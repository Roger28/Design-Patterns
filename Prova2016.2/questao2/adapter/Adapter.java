package adapter;

public class Adapter extends Adaptee implements Target{

	@Override
	public void mover(int deltaX, int deltaY) {
		super.mover(deltaX, deltaY);
	}

}
