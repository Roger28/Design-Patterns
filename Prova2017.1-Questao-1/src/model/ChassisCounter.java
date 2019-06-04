package model;

import interfaces.ICounter;

public class ChassisCounter implements ICounter {

	private static int chassisCounter = 0;

	@Override
	public int counter(int maxChassi) {
		if (ChassisCounter.chassisCounter < maxChassi)
			ChassisCounter.chassisCounter++;
		else
			ChassisCounter.chassisCounter = 1;

		return ChassisCounter.chassisCounter;
	}

}
