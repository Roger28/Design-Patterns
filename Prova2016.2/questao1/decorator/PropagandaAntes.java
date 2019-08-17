package decorator;

public class PropagandaAntes extends PropagandaDecorator{

	public PropagandaAntes(IComponent propaganda) {
		super(propaganda);
	}
	
	public void play() {
		super.play();
		System.out.print(" + Propaganda Antes");
	}

}
