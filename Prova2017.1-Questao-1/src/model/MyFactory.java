package model;

import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.ITyre;

public abstract class MyFactory {

	private static MyFactory carFactory = null;

	public abstract ITyre createTyre();
	public abstract IMotor createMotor();
	public abstract IChassi createChassi();

	public static MyFactory getInstance(int tyre, int chassi, int motor) {
		if (carFactory == null) {
			synchronized (MyFactory.class) {
				if (carFactory == null) 
					carFactory = new CarFactory(tyre, chassi, motor);
			}
		}
		return carFactory;
	}

}
