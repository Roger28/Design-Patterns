package model;

import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.ITyre;

public interface MyFactory {
	public ITyre createTyre();
	public IMotor createMotor();
	public IChassi createChassi();
}
