package bridge;

public class Video2 extends IVideo {

	public Video2(ICodec codec) {
		super(codec);
	}
	
	@Override
	public void play() {
		System.out.println("Rodando video2");
	}

	

}
