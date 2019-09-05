package command;

import java.util.LinkedList;
import java.util.Queue;

public class Invoker {

	public Invoker() {
		this.made = new LinkedList<IOperationCommand>();
		this.undone = new LinkedList<IOperationCommand>();
	}

	public void execute(IOperationCommand command) {
		command.execute();
		this.made.offer(command);
		this.undone.clear();
	}

	public void redo() {
		if(!undone.isEmpty()) {
			IOperationCommand command = undone.poll();
			command.execute();
			this.made.offer(command);
		}
	}

	public void undo() {
		if(!made.isEmpty()) {
			IOperationCommand command = made.poll();
			command.undo();
			this.undone.offer(command);
		}
	}

	private Queue<IOperationCommand> made;
	private Queue<IOperationCommand> undone;
}
