package composite;

public class Client {

	public static void main(String[] args) {
		Composite frutas = new Composite();
		Composite cajus = new Composite();
		Composite macas = new Composite();
		Composite cajusVerdes = new Composite();
		Composite macasMaduras = new Composite();
		Composite cajusVerdesPequenos = new Composite();
		Composite macasMadurasGrande = new Composite();
		
		cajus.add(new Caju());
		macas.add(new Maçã());
		macas.add(new Maçã());
		macas.add(new Maçã());
		
		cajusVerdes.add(cajus);
		macasMaduras.add(macas);
		
		cajusVerdesPequenos.add(cajusVerdes);
		macasMadurasGrande.add(macasMaduras);
		
		frutas.add(cajusVerdesPequenos);
		frutas.add(macasMadurasGrande);
		
		frutas.realizarLimpeza();
		System.out.println("------------------------");
		
		cajusVerdesPequenos.realizarLimpeza();
		

	}

}
