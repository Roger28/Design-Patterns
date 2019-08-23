package bridge;

public class WindowsBackend implements IBackend {

	@Override
	public void drawSprite() {
		System.out.println("Drawing with WindowsBackend");
	}

	@Override
	public void detectCollision() {
		System.out.println("Detected collision with WindowsBackend");
	}

}
