package model;

import interfaces.ICounter;

public class EngineCounter implements ICounter{

	private static int engineCounter = 0;

	@Override
	public int counter(int maxEngine) {
		if (EngineCounter.engineCounter < maxEngine)
			EngineCounter.engineCounter++;
		else
			EngineCounter.engineCounter = 1;

		return EngineCounter.engineCounter;
	}

}
