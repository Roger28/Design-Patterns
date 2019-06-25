package application;

import interfaces.Factory;
import model.caminhao.CaminhaoFactory;
import model.carro.CarroFactory;

public class Client {

	public static void init(Factory app) {
		app.criarPneu().design();
		app.criarMotor().design();
		app.criarChassi().design();
	}

	public static void main(String[] args) {
		init(CarroFactory.getInstance());
		System.out.println("--------------------------------");
		init(CaminhaoFactory.getInstance());
	}

}
