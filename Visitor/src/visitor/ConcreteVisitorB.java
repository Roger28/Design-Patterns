package visitor;

public class ConcreteVisitorB implements IVisitor{

	@Override
	public void visitoAluno(Aluno a) {
		a.accept(this);
	}

	@Override
	public void visitProfessor(Professor b) {
		b.accept(this);
	}

}
