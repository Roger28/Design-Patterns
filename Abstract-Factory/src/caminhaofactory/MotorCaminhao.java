package model.caminhao;

import interfaces.IMotor;

public class MotorCaminhao implements IMotor {

	public static MotorCaminhao getInstance() {
		return new MotorCaminhao();
	}

	@Override
	public void design() {
		System.out.println("Criando o motor do caminhao...");
	}
	
	private MotorCaminhao() {}

}
