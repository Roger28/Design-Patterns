package calculadora;

public class Calculadora {
	
//	public double sum(double x, double y) {
//		return x + y;
//	}
//	
//	public double subtract(double x, double y) {
//		return x - y;
//	}
//	
//	public double multiply(double x, double y) {
//		return x * y;
//	}
//	
//	public double divide(double x, double y) {
//		return x / y;
//	}
	
	public double calculate(char op, double x, double y) {
		switch(op) {
            case '+':
            	return x + y;
            case '-':
            	return x - y;
            case '*':
            	return x * y;
            case '/':
            	return x / y;
            default:
            	throw new IllegalStateException();
    
		}
	}
}
