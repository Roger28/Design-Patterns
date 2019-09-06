package decorator;

import bridge.IGame;

public class SoundDecorator extends IDecorator {

	public SoundDecorator(IGame component) {
		super(component);
	}

	public void finish() {
		super.finish();
		System.out.println("Som");
	}
}
