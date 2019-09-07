package protectionproxy;

public class RealBanco implements IProxy {

	public RealBanco(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String logarNoSistema() {
		if(temPermissao())
			return "Login efetuado com sucesso!";
		return "Usuário ou senha inválida.";
	}
	
	private boolean temPermissao() {
		if(usuario.equalsIgnoreCase(RealBanco.ADMIN) && senha.equalsIgnoreCase(RealBanco.ADMIN))
			return true;
		else
			return false;
	}

	private String usuario;
	private String senha;
	private static String ADMIN = "admin";
}
