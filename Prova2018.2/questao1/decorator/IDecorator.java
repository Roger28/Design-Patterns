package decorator;

import bridge.IGame;

public abstract class IDecorator extends IGame {
	
	public IDecorator(IGame component) {
		this.component = component;
	}
	
	@Override
	public void initialize() {
		this.component.initialize();
	}

	@Override
	public void start() {
		this.component.start();
	}

	@Override
	public void finish() {
		this.component.finish();
	}
	
	public void setComponent(IGame component) {
		this.component = component;
	}
	
	protected IGame component; 
}
