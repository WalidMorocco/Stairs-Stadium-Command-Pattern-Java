package mypackage;

public class BalconyPushCommand implements Command {
	Balcony balcony;

	public BalconyPushCommand(Balcony balcony) {
		super();
		this.balcony = balcony;
	}

	public void execute() {
		balcony.push();
		
	}

	public void undo() {
		balcony.close();
	}

}
