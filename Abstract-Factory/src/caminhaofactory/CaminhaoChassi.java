package model.caminhao;

import interfaces.IChassi;

public class CaminhaoChassi implements IChassi {

	public static CaminhaoChassi getInstance() {
		return new CaminhaoChassi();
	}

	@Override
	public void design() {
		System.out.println("Criando o chassi do caminhao...");
	}

	private CaminhaoChassi() {
	}

}
