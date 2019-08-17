package bridge;

public class Codec1 implements ICodec{

	@Override
	public void comprimir(String arquivo) {
		System.out.println("Codec1: " + arquivo + " comprimido com sucesso.");
	}

	@Override
	public void descomprimir(String arquivo) {
		System.out.println("Codec1: " + arquivo + " descomprimido com sucesso.");
	}

}
