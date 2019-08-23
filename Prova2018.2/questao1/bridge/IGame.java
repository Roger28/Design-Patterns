package bridge;

import decorator.IDecorator;

public abstract class IGame implements IDecorator{
	
	public abstract void initialize();
	public abstract void start();
	
	public void finish() {
		System.out.print("Finalizando o jogo ");
	}
	
	public void setBackend(IBackend backend) {
		this.backend = backend;
	}
	
	protected IBackend backend;
}
