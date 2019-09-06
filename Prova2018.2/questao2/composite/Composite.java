package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends VisualObject {

	public Composite() {
		this.visualObjects = new ArrayList<VisualObject>();
	}
	
	public void add(VisualObject visualObject) throws UnsupportedOperationException {
		if(visualObject != null)
			this.visualObjects.add(visualObject);
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		if(!this.visualObjects.isEmpty() && index < this.visualObjects.size())
			this.visualObjects.remove(index);
	}
	
	public VisualObject getAt(int index) throws UnsupportedOperationException {
		if(!this.visualObjects.isEmpty() && index < this.visualObjects.size())
			return this.visualObjects.get(index);
		throw new UnsupportedOperationException("Operação não suportada");
	}
	
	public void show() {
		for(VisualObject visualObject : visualObjects)
			visualObject.show();
	}
	
	public void hide() {
		for(VisualObject visualObject : visualObjects)
			visualObject.hide();
	}
	
	private List<VisualObject> visualObjects;
}
