package decorator;

import bridge.IGame;

public class AnimationDecorator extends IDecorator{

	public AnimationDecorator(IGame component) {
		super(component);
	}
	
	public void finish() {
		System.out.println("Animação");
		super.finish();
	}

}
