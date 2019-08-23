package decorator;

public class AnimationDecorator extends Decorator{

	public AnimationDecorator(IDecorator component) {
		super(component);
	}
	
	public void finish() {
		super.finish();
		System.out.print("+ animação ");
	}

}
