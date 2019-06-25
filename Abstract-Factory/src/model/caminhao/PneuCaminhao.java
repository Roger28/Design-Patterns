package model.caminhao;

import interfaces.IPneu;

public class PneuCaminhao implements IPneu {

	public static PneuCaminhao getInstance() {
		return new PneuCaminhao();
	}

	@Override
	public void design() {
		System.out.println("Criando o pneu do caminhao...");
	}

	private PneuCaminhao() {}
}
