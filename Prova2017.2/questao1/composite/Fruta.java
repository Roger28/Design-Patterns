package composite;

public abstract class Fruta {

	public void add(Fruta fruta) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}

	public void remove(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}

	public Fruta getAt(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}

	public void realizarLimpeza() {
		System.out.println("Realizando limpeza nas frutas.");
	}
}
