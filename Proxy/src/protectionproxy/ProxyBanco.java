package protectionproxy;

public class ProxyBanco implements IProxy {

	@Override
	public String logarNoSistema(String usuario, String senha) {
		if(this.realBanco == null)
			this.realBanco = new RealBanco();
		return this.realBanco.logarNoSistema(usuario, senha);
	}

	private RealBanco realBanco;
}
