package bridge;

import decorator.AnimationDecorator;
import decorator.IDecorator;
import decorator.SoundDecorator;

public class Client {

	public static void main(String[] args) {
		
		IGame game = new FlappyBird();
		IBackend linux = new LinuxBackend();
		game.setBackend(linux);
		IDecorator decorator = new SoundDecorator(new AnimationDecorator(game));
		game.initialize();
		game.start();
		decorator.finish();
	}

}
