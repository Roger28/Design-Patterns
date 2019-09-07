package protectionproxy;

public class RealBanco implements IProxy {

	@Override
	public String logarNoSistema(String usuario, String senha) {
		if(temPermissao(usuario, senha)) 
			return "Login efetuado com sucesso!";
		return "Usuário ou senha inválida.";
	}
	
	private boolean temPermissao(String usuario, String senha) {
		if(usuario.equalsIgnoreCase(RealBanco.ADMIN) && senha.equalsIgnoreCase(RealBanco.ADMIN))
			return true;
		else
			return false;
	}

	private static String ADMIN = "admin";
}
