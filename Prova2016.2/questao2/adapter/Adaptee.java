package adapter;

public class Adaptee {

	public Adaptee() {}
	
	public Adaptee(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void mover(int deltaX, int deltaY) {
		System.out.println("Movido para deltaX: " + deltaX + " e " + "deltaY: " + deltaY);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	protected int x;
	protected int y;
}
