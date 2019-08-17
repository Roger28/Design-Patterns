package decorator;

public class PropagandaDepois extends PropagandaDecorator{

	public PropagandaDepois(IComponent propaganda) {
		super(propaganda);
	}

	public void play() {
		super.play();
		System.out.print(" + Propaganda Depois");
	}
}
