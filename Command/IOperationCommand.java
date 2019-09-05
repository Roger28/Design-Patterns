package command;

public abstract class IOperationCommand {
	
	public IOperationCommand(char op, Calculator calculator) {
		this.op = op;
		this.calculator = calculator;
	}
	
	public abstract void execute();
	public abstract void undo();
	
	protected Calculator calculator;
	protected char op;
}
