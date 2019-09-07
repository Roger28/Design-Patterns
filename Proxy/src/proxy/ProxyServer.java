package proxy;

public class ProxyServer implements Server{
	
	private RealServer server;
	private boolean isActive;
	
	public ProxyServer() {
		this.server = new RealServer();
		this.isActive = false;
	}
	
	public void setServer(RealServer server) {
		this.server = server;
	}

	@Override
	public void autenticate() {
		this.server.autenticate();
		this.isActive = true;
	}

	@Override
	public void get() {
		if(isActive)
			this.server.get();
		else 
			System.out.println("Sessão inválida");
	}

	@Override
	public void post() {
		if(isActive)
			this.server.post();
		else 
			System.out.println("Sessão inválida");	
	}

	@Override
	public void put() {
		if(isActive)
			this.server.put();
		else 
			System.out.println("Sessão inválida");	
	}

	@Override
	public void delete() {
		if(isActive)
			this.server.delete();
		else 
			System.out.println("Sessão inválida");
	}
	
	@Override
	public void deactivate() {
		if(isActive) {
			this.server.deactivate();
			this.isActive = false;
		}else 
			System.out.println("Sessão inválida");
		
	}

}
