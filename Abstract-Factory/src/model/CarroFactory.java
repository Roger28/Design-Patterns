package model;

import interfaces.Factory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public class CarroFactory implements Factory {

	public static CarroFactory getInstance() {
		if (factory == null) {
			synchronized (CarroFactory.class) {
				if (factory == null) {
					factory = new CarroFactory();
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

	private CarroFactory() {
		this.pneu = PneuCarro.getInstance();
		this.motor = MotorCarro.getInstance();
		this.chassi = CarroChassi.getInstance();
	}

	private final IPneu pneu;
	private final IMotor motor;
	private final IChassi chassi;
	private volatile static CarroFactory factory;
}
