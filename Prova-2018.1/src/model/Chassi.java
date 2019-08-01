package model;

import interfaces.IChassi;
import interfaces.IPrototype;

public class Chassi implements IChassi, IPrototype {

	@Override
	public void design() {
		System.out.println("criando chassi");
	}
	
	@Override
	public IPrototype clone() {
		return new Chassi();
	}

}
