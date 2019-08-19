package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	public void add(Component component) throws UnsupportedOperationException {
		if(component != null)
			this.components.add(component);
	}
	
	public void remove(int index) throws UnsupportedOperationException {
		if(!this.components.isEmpty() && index < this.components.size())
			this.components.remove(index);
	}
	
	public Component getAt(int index) throws UnsupportedOperationException {
		if(!this.components.isEmpty() && index < this.components.size())
			return this.components.get(index);
		throw new UnsupportedOperationException("Objeto não existe.");
	}
	
	@Override
	public void increaseValue(double value) {
		for(Component component: this.components) {
			component.increaseValue(value);
		}
	}
	
	public List<Component> getComponents() {
		return components;
	}
	
	private List<Component> components = new ArrayList<Component>();
}
