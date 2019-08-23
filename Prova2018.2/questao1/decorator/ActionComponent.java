package decorator;

public class ActionComponent implements IDecorator {

	@Override
	public void finish() {
		System.out.print("Executando ");
	}

}
