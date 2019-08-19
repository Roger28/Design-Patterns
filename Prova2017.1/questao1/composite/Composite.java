package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Produto {
	
	public void add(Produto produto) throws UnsupportedOperationException {
		if(produto != null)
			this.produtos.add(produto);
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		if(!this.produtos.isEmpty() && index < this.produtos.size())
			this.produtos.remove(index);
	}
	
	public Produto getAt(int index) throws UnsupportedOperationException {
		if(!this.produtos.isEmpty() && index < this.produtos.size())
			return this.produtos.get(index);
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	@Override
	public void increaseValue(double value) throws UnsupportedOperationException {
		for(Produto produto: this.produtos) {
			produto.increaseValue(value);
		}
	}
	
	private List<Produto> produtos = new ArrayList<Produto>();
}
