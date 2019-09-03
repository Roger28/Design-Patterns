package calculadora;

public interface IOperationCommand {
	public void calculate(char op, double x, double y);
	public void redo();
	public void undo();
}
