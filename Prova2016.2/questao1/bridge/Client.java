package bridge;

import decorator.PropagandaAntes;
import decorator.PropagandaDepois;

public class Client {

	public static void main(String[] args) {

		IVideo video = new Video1(new Codec1());
		IVideo propagandaAntes = new PropagandaAntes(video);
		IVideo propagandaDepois = new PropagandaDepois(propagandaAntes);
		propagandaDepois.play();
	}

}
