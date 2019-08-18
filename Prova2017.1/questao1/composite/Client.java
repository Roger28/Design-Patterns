package composite;

public class Client {

	public static void main(String[] args) {	
		Composite laticinios = new Composite(); 
		Composite vestuario = new Composite(); 
		Composite todosOsProdutos = new Composite(); 
		Leite l = new Leite(2.0); // Preço = R$ 2.00 
		Camisa c = new Camisa(30.0); // Preço = R$ 30.00 
		laticinios.add(l); 
		vestuario.add(c); 
		todosOsProdutos.add(laticinios); 
		todosOsProdutos.add(vestuario); 
		todosOsProdutos.increaseValue(0.1); // Aumenta todos os produtos em 10% 
		laticinios.increaseValue(0.1); // Aumenta somente laticinios em 10% 
		System.out.println(l.getPreco()); // O preço do leite agora deve ser R$ 2.42 
		System.out.println(c.getPreco()); // O preço da camisa agora deve ser R$ 33.0
	}

}
