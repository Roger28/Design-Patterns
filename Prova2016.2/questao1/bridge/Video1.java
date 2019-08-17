package bridge;

public class Video1 extends IVideo {

	@Override
	public void renderizar(String arquivo) {
		codec.descomprimir(arquivo);
	}
	
}
