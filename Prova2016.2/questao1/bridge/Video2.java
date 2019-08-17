package bridge;

public class Video2 extends IVideo {

	@Override
	public void renderizar(String arquivo) {
		codec.descomprimir(arquivo);
	}

}
