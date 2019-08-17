package bridge;

import decorator.IComponent;
import decorator.PropagandaAntes;
import decorator.PropagandaDepois;

public class Client {

	public static void main(String[] args) {

		IVideo video = new Video1();
		video.setCodec(new Codec1());
//		video.renderizar("Filme Dejavu");
		IComponent videoComPropaganda = new PropagandaAntes(new PropagandaDepois((IComponent)video));
		videoComPropaganda.play();
	}

}
