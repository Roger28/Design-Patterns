package composite;

public abstract class VisualObject {
	
	public void add(VisualObject visualObject) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public VisualObject getAt(int index) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void show() {
		
	}
	
	public void hide() {
		
	}
}
