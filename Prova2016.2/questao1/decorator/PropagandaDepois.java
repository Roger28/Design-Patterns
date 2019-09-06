package decorator;

import bridge.IVideo;

public class PropagandaDepois extends PropagandaDecorator{

	public PropagandaDepois(IVideo propaganda) {
		super(propaganda);
	}

	public void play() {
		super.play();
		System.out.println("Propaganda Depois");
	}
}
