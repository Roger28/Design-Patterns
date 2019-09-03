package command;

public class Client {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		MainDish item1 = new MainDish("Pizza");
		OrderMainDish command1 = new OrderMainDish(item1);
		waiter.execute(command1);

	}

}
