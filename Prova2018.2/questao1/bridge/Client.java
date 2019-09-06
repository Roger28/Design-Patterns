package bridge;

import decorator.AnimationDecorator;
import decorator.IDecorator;
import decorator.SoundDecorator;

public class Client {

	public static void main(String[] args) {
		
		IBackend linux = new LinuxBackend();
		IGame game = new AngryBirds(linux);
		IDecorator decorator = new SoundDecorator(new AnimationDecorator(game));
		game.initialize();
		game.start();
		decorator.finish();

	}

}
