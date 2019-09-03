package pagamentocommand;

public class Compra {
	private static int CONTADOR_ID;
	private int idNotaFiscal;
	private String nomeDaLoja;
	private double valorTotal;

	public Compra(String nomeDaLoja) {
		this.nomeDaLoja = nomeDaLoja;
		idNotaFiscal = ++CONTADOR_ID;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		return new String("Nota fiscal nº: " + this.idNotaFiscal + "\nLoja: " + this.nomeDaLoja + "\nValor: " + this.valorTotal);
	}
}
