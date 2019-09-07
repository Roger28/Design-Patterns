package proxy;

public class Client {

	public static void main(String[] args) {
		Server server = new ProxyServer();
		server.autenticate();
		server.get();
		server.post();
		server.put();
		server.delete();
		server.deactivate();

	}

}
