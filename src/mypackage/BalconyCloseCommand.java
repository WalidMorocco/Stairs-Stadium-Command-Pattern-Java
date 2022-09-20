package mypackage;

public class BalconyCloseCommand implements Command {
	Balcony balcony;

	public void execute() {
		balcony.close();
		
	}

	public void undo() {
		balcony.push();
	}

}
