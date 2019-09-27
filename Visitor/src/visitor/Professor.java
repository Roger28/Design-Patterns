package visitor;

public class Professor implements IElement {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitProfessor(this);
	}

}
