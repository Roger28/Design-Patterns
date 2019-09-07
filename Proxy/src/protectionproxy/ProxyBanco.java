package protectionproxy;

public class ProxyBanco implements IProxy {

	public ProxyBanco(String usuario, String senha) {
		if(this.realBanco == null)
			this.realBanco = new RealBanco(usuario, senha);
	}

	@Override
	public String logarNoSistema() {
		return this.realBanco.logarNoSistema();
	}

	private RealBanco realBanco;
}
