package application;

import interfaces.IMotor;
import interfaces.ITyre;
import model.CarFactory;
import model.MyFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFactory carFactory = CarFactory.getInstance(2,3,2);

		IMotor tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
		tyre = carFactory.createMotor();
		System.out.println(tyre);
	
	}
}
