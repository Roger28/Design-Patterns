package bridge;

public class FlappyBird extends IGame {

	@Override
	public void initialize() {
		backend.drawSprite();
		backend.detectCollision();
		backend.drawSprite();
		backend.detectCollision();
		backend.drawSprite();
		backend.drawSprite();
	}

	@Override
	public void start() {
		backend.drawSprite();
		backend.drawSprite();
		backend.detectCollision();
		backend.detectCollision();
		backend.drawSprite();
		backend.drawSprite();
	}

}
