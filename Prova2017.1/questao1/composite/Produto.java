package composite;

public abstract class Produto {
	
	protected double preco;

	public void add(Produto produto) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public Produto getAt(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void increaseValue(double value)  {
		this.preco = this.preco + (this.preco * value);
	}
	
	public double getPreco() {
		return this.preco;
	}
}
