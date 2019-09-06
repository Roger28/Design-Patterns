package bridge;

public class FlappyBird extends IGame {

	public FlappyBird(IBackend backend) {
		super(backend);
	}

	@Override
	public void initialize() {
		backend.drawSprite();
		backend.detectCollision();
	}

	@Override
	public void start() {
		backend.drawSprite();
		backend.detectCollision();
	}

	@Override
	public void finish() {
		System.out.println("Finalizando FlappyBird.");
	}

}
