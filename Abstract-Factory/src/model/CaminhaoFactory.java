package model;

import interfaces.Factory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class CaminhaoFactory implements Factory {

	public static Factory getInstance() {
		if (factory == null) {
			synchronized (CaminhaoFactory.class) {
				if (factory == null) {
					factory = new CaminhaoFactory();
				}
			}
		}
		return factory;
	}

	@Override
	public IPneu criarPneu() {
		return this.pneu;
	}

	@Override
	public IMotor criarMotor() {
		return this.motor;
	}

	@Override
	public IChassi criarChassi() {
		return this.chassi;
	}

	private CaminhaoFactory() {
		this.pneu = PneuCaminhao.getInstance();
		this.motor = MotorCaminhao.getInstance();
		this.chassi = CaminhaoChassi.getInstance();
	}

	private final IPneu pneu;
	private final IMotor motor;
	private final IChassi chassi;
	private volatile static Factory factory;
}
