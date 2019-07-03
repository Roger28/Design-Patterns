package model.carro;

import interfaces.IMotor;

public class MotorCarro implements IMotor{
	
	public static  MotorCarro getInstance() {
		return new MotorCarro();
	}

	@Override
	public void design() {
		System.out.println("Criando o motor do carro...");
	}
	
	private MotorCarro() {}
}
