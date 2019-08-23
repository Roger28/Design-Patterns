package bridge;

public class AngryBirds extends IGame {

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

}
