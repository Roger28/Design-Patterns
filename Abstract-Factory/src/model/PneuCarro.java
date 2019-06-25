package model;

import interfaces.IPneu;

public class PneuCarro implements IPneu {

	public static PneuCarro getInstance() {
		return new PneuCarro();
	}

	@Override
	public void design() {
		System.out.println("Criando o pneu do carro...");
	}
	
	private PneuCarro() {}
}
