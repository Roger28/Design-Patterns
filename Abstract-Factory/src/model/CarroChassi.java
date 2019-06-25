package model;

import interfaces.IChassi;

public class CarroChassi implements IChassi {

	public static CarroChassi getInstance() {		
		return new CarroChassi();	
	}

	@Override
	public void design() {
		System.out.println("Criando o chassi do carro...");
	}

	private CarroChassi() {
	}
		
}
