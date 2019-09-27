package visitor;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
	
	public Visitor() {
		this.visitors = new ArrayList<IVisitor>();
		this.aggregators = new ArrayList<IElement>();
	}
	
	public void addVisitor(IVisitor visitor) {
		this.visitors.add(visitor);
	}
	
	public void addElement(IElement element) {
		this.aggregators.add(element);
	}
	
	public void realizer() {
		for(IElement element : this.aggregators)
			for(IVisitor visitor : this.visitors)
				element.accept(visitor);
	}
	
	private List<IVisitor> visitors;
	private List<IElement> aggregators;
}
