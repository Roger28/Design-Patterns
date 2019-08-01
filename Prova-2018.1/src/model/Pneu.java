package model;

import interfaces.IPneu;
import interfaces.IPrototype;

public class Pneu implements IPneu, IPrototype {

	@Override
	public void design() {
		System.out.println("criando pneu");
	}

	@Override
	public IPrototype clone() {
		return new Pneu();
	}
}
