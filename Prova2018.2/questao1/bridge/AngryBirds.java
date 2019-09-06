package bridge;

public class AngryBirds extends IGame {

	public AngryBirds(IBackend backend) {
		super(backend);
	}

	@Override
	public void initialize() {
		backend.drawSprite();
		backend.detectCollision();
		backend.drawSprite();
		backend.drawSprite();
		backend.detectCollision();
		backend.drawSprite();
	}

	@Override
	public void start() {
		backend.drawSprite();
		backend.detectCollision();
		backend.drawSprite();
		backend.drawSprite();
		backend.drawSprite();
		backend.detectCollision();
	}

	@Override
	public void finish() {
		System.out.println("Finalizando AngryBirds.");
	}
}
