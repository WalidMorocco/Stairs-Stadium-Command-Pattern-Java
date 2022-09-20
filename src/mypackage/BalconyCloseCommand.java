package mypackage;

public class BalconyCloseCommand implements Command {
	Balcony balcony;

	public BalconyCloseCommand(Balcony balcony) {
		super();
		this.balcony = balcony;
	}

	public void execute() {
		balcony.close();
		
	}

	public void undo() {
		balcony.push();
	}

}
