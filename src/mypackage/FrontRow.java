package mypackage;

public class FrontRow {
	String stairs;
	
	public FrontRow(String stairs) {
		this.stairs = stairs;
	}
	
	public void push() {
		System.out.println(stairs + " are pushed to the front.");
	}
	
	public void close() {
		System.out.println(stairs + " are retracted.");
	}
}
