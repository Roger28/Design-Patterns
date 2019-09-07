package proxy;

public class RealServer implements Server {

	@Override
	public void autenticate() {
		System.out.println("You logged in Real Server");
	}

	@Override
	public void get() {
		System.out.println("You did a GET on Real Server");
	}

	@Override
	public void post() {
		System.out.println("You did a POST on Real Server");
	}

	@Override
	public void put() {
		System.out.println("You did a PUT on Real Server");
	}

	@Override
	public void delete() {
		System.out.println("You did a DELETE on Real Server");
	}

	@Override
	public void deactivate() {
		System.out.println("Deactivating from Real Server");
	}

}
