package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static Calculator getInstance() {
		if (instance == null)
			instance = new Calculator();
		return instance;
	}

	public void calculate(char op, double x, double y) {
		this.command.calculate(op, x, y);
		this.commands.add(command);
	}

	public void redo() {
		this.command.redo();
	}

	public void undo() {
		this.command.undo();
	}

	public void setCommand(IOperationCommand command) {
		this.command = command;
	}

	private Calculator() {
		this.commands = new ArrayList<IOperationCommand>();
	}

	private static Calculator instance;
	private List<IOperationCommand> commands;
	private IOperationCommand command;
}
