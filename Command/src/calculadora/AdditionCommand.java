package calculadora;

public class AdditionCommand implements IOperationCommand {

	public AdditionCommand() {
		this.calculadora = new Calculadora();
	}
	
	@Override
	public void calculate(char op, double x, double y) {
		double resultado = this.calculadora.calculate(op, x, y);
		System.out.println("Resultado: "  + resultado);
	}

	@Override
	public void redo() {

	}

	@Override
	public void undo() {

	}

	private Calculadora calculadora;
}
