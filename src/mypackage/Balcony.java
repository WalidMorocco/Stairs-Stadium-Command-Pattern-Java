package mypackage;

public class Balcony {
	String stairs;
	
	public Balcony(String stairs) {
		this.stairs = stairs;
	}
	
	public void push() {
		System.out.println(stairs + " are pushed to the top.");
	}
	
	public void close() {
		System.out.println(stairs + " are retracted.");
	}
}
