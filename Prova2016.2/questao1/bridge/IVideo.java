package bridge;

public abstract class IVideo{

	protected ICodec codec;
	
	public IVideo() {}
	
	public IVideo(ICodec codec) {
		this.codec = codec;
	}

	public abstract void play();
}
