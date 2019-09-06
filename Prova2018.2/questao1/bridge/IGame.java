package bridge;

public abstract class IGame {
	
	public IGame() {}
	
	public IGame(IBackend backend) {
		this.backend = backend;
	}
	
	public abstract void initialize();
	public abstract void start();
	public abstract void finish();
	
	public void setBackend(IBackend backend) {
		this.backend = backend;
	}
	
	protected IBackend backend;
}
