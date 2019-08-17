package bridge;

import decorator.IComponent;

public abstract class IVideo implements IComponent{

	protected ICodec codec;
	
	public void setCodec(ICodec codec) {
		this.codec = codec;
	}
	
	public abstract void renderizar(String arquivo);

	@Override
	public void play() {
		System.out.print("Rodando video");
	}
}
