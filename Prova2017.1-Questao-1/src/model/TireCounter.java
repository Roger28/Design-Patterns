package model;

import interfaces.ICounter;

public class TireCounter implements ICounter {

	private static int countTyre = 0;

	@Override
	public int counter(int maxTyre) {
		if (TireCounter.countTyre < maxTyre)
			TireCounter.countTyre++;
		else
			TireCounter.countTyre = 1;

		return TireCounter.countTyre;
	}

}
