package pagamentocommand;

public class Loja {
	private String nomeDaLoja;

	public Loja(String nome) {
		this.nomeDaLoja = nome;
	}

	public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
		Compra compra = new Compra(nomeDaLoja);
		compra.setValor(valor);
		formaDePagamento.processarCompra(compra);
	}
}
