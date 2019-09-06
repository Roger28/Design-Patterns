package decorator;

import bridge.IVideo;

public abstract class PropagandaDecorator extends IVideo {

	public PropagandaDecorator(IVideo propaganda) {
		this.propaganda = propaganda;
	}

	@Override
	public void play() {
		this.propaganda.play();
	}

	private IVideo propaganda;
}
