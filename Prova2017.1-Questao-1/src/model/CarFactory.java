package model;

import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.ITyre;

public class CarFactory implements MyFactory {

	private CarFactory(int maxTyre, int maxMotor, int maxChassi) {;
		this.maxTyre = maxTyre;
		this.maxMotor = maxMotor;
		this.maxChassi = maxChassi;
		this.currentTyre = 0;
		this.currentMotor = 0;
		this.currentChassi = 0;
		this.carTyres = new CarTyre[maxTyre];
		this.carMotors = new CarMotor[maxMotor];
		this.carChassis = new CarChassi[maxChassi];
	}
	
	public static CarFactory getInstance(int tyre, int chassi, int motor) {
		if (carFactory == null) 
			carFactory = new CarFactory(tyre, chassi, motor);
		return carFactory;
	}

	@Override
	public ITyre createTyre() {
		if(this.carTyres[this.currentTyre % this.maxTyre] == null)
			this.carTyres[this.currentTyre] = new CarTyre();
		return this.carTyres[this.currentTyre++ % this.maxTyre];
	}

	@Override
	public IMotor createMotor() {
		if(this.carMotors[this.currentMotor % this.maxMotor] == null)
			this.carMotors[this.currentMotor % this.maxMotor] = new CarMotor();
		return this.carMotors[this.currentMotor++ % this.maxMotor];
	}

	@Override
	public IChassi createChassi() {
		if(this.carMotors[this.currentChassi % this.maxChassi] == null)
			this.carMotors[this.currentChassi] = new CarMotor();
		return this.carChassis[this.currentChassi++ % this.maxChassi];
	}
	
	private int maxTyre;
	private int maxMotor;
	private int maxChassi;
	private int currentTyre;
	private int currentMotor;
	private int currentChassi;
	private CarTyre[] carTyres;
	private CarMotor[] carMotors;
	private CarChassi[] carChassis;
	private static CarFactory carFactory;
}
