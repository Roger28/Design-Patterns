package application;

import books.DesignPatternsBook;
import books.HarryPotterBook;
import books.SOLIDBook;
import composite.Component;
import composite.Composite;
import eletronics.PC;
import eletronics.TV;
import eletronics.VGA;

public class Client {

	public static void main(String[] args) {
		Composite books = new Composite();
		Composite eletronics = new Composite();
		
		SOLIDBook solidBook = new SOLIDBook(60.0);
		HarryPotterBook harryPotterBook = new HarryPotterBook(110.0);
		DesignPatternsBook designPatternsBook = new DesignPatternsBook(350.0);
		books.add(solidBook);
		books.add(harryPotterBook);
		books.add(designPatternsBook);
		
		PC pc = new PC(2500.0);
		TV tv = new TV(999.90);
		VGA gtx = new VGA(749.0);
		eletronics.add(pc);
		eletronics.add(tv);
		eletronics.add(gtx);
		
		for(Component component: books.getComponents())
			System.out.println(component.getClass().getName().split("\\.")[1] + " custa:" + component.getPrice());
		
		books.increaseValue(0.1); // aumenta em 10% o preço da categoria books		
		System.out.println("*********APÓS AUMENTO DE 10%************");
		
		for(Component component: books.getComponents())
			System.out.println(component.getClass().getName().split("\\.")[1] + " custa:" + component.getPrice());
		
		System.out.println("----------------------------------------");
		
		for(Component component: eletronics.getComponents())
			System.out.println(component.getClass().getName().split("\\.")[1] + " custa:" + component.getPrice());
		
		eletronics.increaseValue(0.5); // aumenta em 50% o preço da categoria eletronics
		System.out.println("*********APÓS AUMENTO DE 50%************");
		for(Component component: eletronics.getComponents())
			System.out.println(component.getClass().getName().split("\\.")[1] + " custa:" + component.getPrice());

	}

}
