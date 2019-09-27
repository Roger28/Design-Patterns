package visitor;

public class Aluno implements IElement {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitoAluno(this);
	}

}
