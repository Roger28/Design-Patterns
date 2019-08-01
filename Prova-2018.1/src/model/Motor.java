package model;

import interfaces.IMotor;
import interfaces.IPrototype;

public class Motor implements IMotor, IPrototype {

	@Override
	public void design() {
		System.out.println("criando motor");
	}

	@Override
	public IPrototype clone() {
		return new Motor();
	}
}
