package bridge;

public class Video1 extends IVideo {

	public Video1(ICodec codec) {
		super(codec);
	}
	
	@Override
	public void play() {
		System.out.println("Rodando video1");
		
	}

	
	
}
