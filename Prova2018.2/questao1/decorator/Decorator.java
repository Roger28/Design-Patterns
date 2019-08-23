package decorator;

public abstract class Decorator implements IDecorator {

	public Decorator(IDecorator component) {
		this.component = component;
	}

	@Override
	public void finish() {
		this.component.finish();
	}
	
	public void setComponent(ActionComponent component) {
		this.component = component;
	}
	
	protected IDecorator component; 
}
