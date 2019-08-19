package composite;

public abstract class Component {
	
	protected double price;
	
	public double getPrice() {
		return this.price;
	}

	public void add(Component component) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public Component getAt(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void increaseValue(double value) {
		this.price = this.price + (this.price * value);
	}
}
