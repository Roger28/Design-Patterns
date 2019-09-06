package adapter;

public class Adapter extends Adaptee implements Target{

	@Override
	public void mover(int x, int y) {
		super.mover(x - getX(), y - getY());
	}

}
