package adapter;

public class Client {

	public static void main(String[] args) {

		Target target = new Adapter();
		target.mover(10, 300);
	}

}
