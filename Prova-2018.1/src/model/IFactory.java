package model;

import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;

public interface IFactory {
	IPneu createPneu();
	IMotor createMotor();
	IChassi createIChassi();
}
