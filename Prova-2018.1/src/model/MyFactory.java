package model;

import java.util.HashMap;

import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;
import interfaces.IPrototype;

public class MyFactory implements IFactory {
	
	private MyFactory() {
		this.prototypes = new HashMap<String, PrototypeManager>();
	}

	public static MyFactory getInstance() {
		if(instance == null) instance = new MyFactory();
		return instance;
	}
	
	public boolean addPrototype(String prototypeName, int min, int max) {
		if(prototypes.containsKey(prototypeName))
			return false;
		
		String classe = "model." + prototypeName;
		IPrototype prototype = null;
		
		try {
			Class<?> p = Class.forName(classe);
			prototype = (IPrototype) p.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		this.prototypes.put(prototypeName, new PrototypeManager(min, max, prototype));
		for (int i = 0; i < max; i++)
		    System.out.println("[" + i + "] = " + prototypes.get(prototypeName).prototypes[i]);
		return true;
	}
		
	public IPrototype create(String prototypeName){
		if (!prototypes.containsKey(prototypeName)) return null;
		PrototypeManager prototypeManager = prototypes.get(prototypeName);
		if (prototypeManager.prototypes[prototypeManager.current%prototypeManager.max] == null)
			prototypeManager.prototypes[prototypeManager.current%prototypeManager.max] = prototypeManager.prototype.clone();
		return prototypeManager.prototypes[prototypeManager.current++%prototypeManager.max];
    }
	
	@Override
	public IPneu createPneu() {
		return new Pneu();
	}

	@Override
	public IMotor createMotor() {
		return new Motor();
	}

	@Override
	public IChassi createIChassi() {
		return new Chassi();
	}
	
	private class PrototypeManager {
		public int current;
		public int max;
		public IPrototype prototype;
		public IPrototype[] prototypes;
		
		public PrototypeManager(int min, int max, IPrototype prototype) {
			this.current = 0;
			this.max = max;
			this.prototype = prototype;
			this.prototypes = new IPrototype[max];
			this.addPrototypes(min);
//			add();
		}
		
		private void add() {
			this.prototypes[current] = this.prototype.clone();
		}
		
		private void addPrototypes(int min) {
			for(int i = 0; i < min; i++)
				this.prototypes[i] = this.prototype.clone();
		}
	}
	
	private static MyFactory instance = null;
	private HashMap<String, PrototypeManager> prototypes;
}
