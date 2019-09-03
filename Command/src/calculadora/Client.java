package calculadora;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Calculator calculator = Calculator.getInstance();
		Scanner scanner = new Scanner(System.in);
		char op = ' ';
		
		while (op != 's') {
			System.out.print("Digite o sinal da operação (+, -, * ou /), 'u' para undo, 'r' para redo e 's' para sair: ");
			op = scanner.next().charAt(0);
			System.out.print("Digite o primeiro valor: ");
			double x = scanner.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double y = scanner.nextDouble();
			
			if(op == '+' || op == '-')
				calculator.setCommand(new AdditionCommand());
			else if(op == '*' || op == '/')
				calculator.setCommand(new MultiplicationCommand());
			
			calculator.calculate(op, x, y);
		}
		scanner.close();

	}

}
