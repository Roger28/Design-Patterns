package decorator;

public abstract class PropagandaDecorator implements IComponent {

	public PropagandaDecorator(IComponent propaganda) {
		this.propaganda = propaganda;
	}

	@Override
	public void play() {
		this.propaganda.play();
	}

	public void setPropaganda(Propaganda propaganda) {
		this.propaganda = propaganda;
	}
	
	protected IComponent propaganda;
}
