package bridge;

public class LinuxBackend implements IBackend {

	@Override
	public void drawSprite() {
		System.out.println("Drawing with LinuxBackend.");
	}

	@Override
	public void detectCollision() {
		System.out.println("Detected collision with LinuxBackend.");
	}

}
