package pagamentocommand;

public class Cliente {
	public static void main(String[] args) {
		Loja lojasAfricanas = new Loja("Afriacanas");
		lojasAfricanas.executarCompra(999.00, new PagamentoCartaoCredito());
		System.out.println("---------------------------------------------");
		lojasAfricanas.executarCompra(49.00, new PagamentoBoleto());
		System.out.println("---------------------------------------------");
		lojasAfricanas.executarCompra(99.00, new PagamentoCartaoDebito());
		System.out.println("---------------------------------------------");

		Loja exorbitante = new Loja("Exorbitante");
		exorbitante.executarCompra(19.00, new PagamentoCartaoCredito());

	}
}
