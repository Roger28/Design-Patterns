package decorator;

import bridge.IVideo;

public class PropagandaAntes extends PropagandaDecorator{

	public PropagandaAntes(IVideo propaganda) {
		super(propaganda);
	}
	
	public void play() {
		System.out.println("Propaganda Antes");
		super.play();
	}

}
