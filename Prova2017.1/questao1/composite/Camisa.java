package composite;

public class Camisa extends Produto {
	public Camisa(double preco) {
		this.preco = preco;
	}
	
	@Override
	public void increaseValue(double value) throws UnsupportedOperationException {
		this.preco = this.preco + (this.preco * value);
	}
}
