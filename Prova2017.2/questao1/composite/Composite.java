package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Fruta {

	public Composite() {
		this.frutas = new ArrayList<Fruta>();
	}

	public void add(Fruta fruta) throws UnsupportedOperationException {
		if (fruta != null)
			this.frutas.add(fruta);
	}

	public void remove(int index) throws UnsupportedOperationException {
		if (!this.frutas.isEmpty() && index < this.frutas.size())
			this.frutas.remove(index);
	}

	public Fruta getAt(int index) throws UnsupportedOperationException {
		if (!this.frutas.isEmpty() && index < this.frutas.size())
			return this.frutas.get(index);
		throw new UnsupportedOperationException("Operação não suportada");
	}

	@Override
	public void realizarLimpeza() {
		for (Fruta fruta : this.frutas)
			fruta.realizarLimpeza();
	}

	private List<Fruta> frutas;
}
