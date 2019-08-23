package decorator;

public class SoundDecorator extends Decorator {

	public SoundDecorator(IDecorator component) {
		super(component);
	}

	public void finish() {
		super.finish();
		System.out.print("+ som ");
	}
}
