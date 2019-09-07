package protectionproxy;

public class Client {

	public static void main(String[] args) {
		IProxy banco = new ProxyBanco();
		System.out.println(banco.logarNoSistema("admin", "admin"));
		System.out.println(banco.logarNoSistema("admin", "admin"));
	}

}
