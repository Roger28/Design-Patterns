package command;

public class MainDish {
	private String name;

	public MainDish(String name) {
		this.name = name;
	}

	public void order() {
		System.out.println("Main Dish (" + this.name + ") is ordered");
	}

	public void cancel() {
		System.out.println("Main Dish (" + this.name + ") is cancelled");
	}
}
