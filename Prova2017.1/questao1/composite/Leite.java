package composite;

public class Leite extends Produto {
	
	public Leite(double preco) {
		this.preco = preco;
	}
	
	public void increaseValue(double value) throws UnsupportedOperationException {
		this.preco = this.preco + (this.preco * value);
	}
}
