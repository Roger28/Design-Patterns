package protectionproxy;

public class Client {

	public static void main(String[] args) {
		IProxy banco = new ProxyBanco("admin", "admin");
		System.out.println(banco.logarNoSistema());
	}

}
