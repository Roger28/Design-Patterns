package command;

public class AdditionCommand extends IOperationCommand {

	public AdditionCommand(char op, Calculator calculator) {
		super(op, calculator);
	}
	
	@Override
	public void execute() {

	}

	@Override
	public void undo() {

	}
	
}
