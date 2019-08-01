package application;

import interfaces.IPrototype;
import model.Motor;
import model.MyFactory;

public class Client {
	public static void main(String[] args) {
		MyFactory myFactory = MyFactory.getInstance();
		myFactory.addPrototype("Motor", 2, 4);

       	System.out.println(myFactory.create("Motor"));
       	System.out.println(myFactory.create("Motor"));
       	System.out.println(myFactory.create("Motor"));
       	System.out.println(myFactory.create("Motor"));
       	System.out.println(myFactory.create("Motor"));


		
//		String classe = "model." + "Motor";
//		IPrototype prototype = null;
//		try {
//			Class<?> p = Class.forName(classe);
//			prototype = (IPrototype) p.newInstance();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
		
//		Motor motor = (Motor) prototype.clone();
//		motor.design();
    }
}
