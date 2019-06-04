package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.ICounter;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.ITyre;

public class CarFactory extends MyFactory {

	public CarFactory(int maxTyre, int maxMotor, int maxChassi) {
		CarFactory.maxTyre = maxTyre;
		CarFactory.maxMotor = maxMotor;
		CarFactory.maxChassi = maxChassi;
		this.carTyres = new ArrayList<CarTyre>();
		this.carMotors = new ArrayList<CarMotor>();
		this.carChassis = new ArrayList<CarChassi>();
		addTyre();
		addMotor();
		addChassi();
	}

	@Override
	public ITyre createTyre() {
		this.setContador(new TireCounter());
		return carTyres.get(this.contador.counter(CarFactory.maxTyre) - 1);
	}

	@Override
	public IMotor createMotor() {
		this.setContador(new EngineCounter());
		return carMotors.get(this.contador.counter(CarFactory.maxMotor) - 1);
	}

	@Override
	public IChassi createChassi() {
		this.setContador(new ChassisCounter());
		return carChassis.get(this.contador.counter(CarFactory.maxChassi)- 1);
	}

	private void addTyre() {
		for (int i = 0; i < CarFactory.maxTyre; i++)
			this.carTyres.add(new CarTyre());
	}

	private void addMotor() {
		for (int i = 0; i < CarFactory.maxMotor; i++)
			this.carMotors.add(new CarMotor());
	}

	private void addChassi() {
		for (int i = 0; i < CarFactory.maxChassi; i++)
			this.carChassis.add(new CarChassi());
	}
	
	private void setContador(ICounter contador) {
		this.contador = contador;
	}
	
	private static int maxTyre;
	private static int maxMotor;
	private static int maxChassi;
	private ICounter contador;
	private List<CarTyre> carTyres;
	private List<CarMotor> carMotors;
	private List<CarChassi> carChassis;
}
