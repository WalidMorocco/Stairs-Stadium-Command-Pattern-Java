package mypackage;

public class MiddleSection {
	String stairs;
	
	public MiddleSection(String stairs) {
		this.stairs = stairs;
	}
	
	public void expand() {
		System.out.println(stairs + " are expanded.");
	}
	
	public void close() {
		System.out.println(stairs + " are retracted.");
	}
}
