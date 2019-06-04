package application;

import interfaces.ITyre;
import model.MyFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFactory carFactory = MyFactory.getInstance(4,3,2);
		ITyre tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
		tyre = carFactory.createTyre();
		System.out.println(tyre);
	
	}
}
