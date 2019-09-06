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
		
		frutas.add(cajus);
		frutas.add(macas);
		
		cajus.add(cajusVerdes);
		macas.add(macasMaduras);
		
		cajusVerdes.add(cajusVerdesPequenos);
		macasMaduras.add(macasMadurasGrande);
		
		cajusVerdesPequenos.add(new Caju());
		cajusVerdesPequenos.add(new Caju());
		macasMadurasGrande.add(new Maçã());
		
		frutas.realizarLimpeza();
		System.out.println("------------------------");
		
		cajusVerdesPequenos.realizarLimpeza();
		

	}

}
