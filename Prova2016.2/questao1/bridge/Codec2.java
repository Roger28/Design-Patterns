package bridge;

public class Codec2 implements ICodec {

	@Override
	public void comprimir(String arquivo) {
		System.out.println("Codec2: " + arquivo + " comprimido com sucesso.");
	}

	@Override
	public void descomprimir(String arquivo) {
		System.out.println("Codec2: " + arquivo + " descomprimido com sucesso.");
	}

}
