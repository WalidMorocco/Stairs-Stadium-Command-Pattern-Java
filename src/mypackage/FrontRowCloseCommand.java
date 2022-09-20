package mypackage;

public class FrontRowCloseCommand implements Command {
	
	FrontRow frontRow;

	public FrontRowCloseCommand(FrontRow frontRow) {
		super();
		this.frontRow = frontRow;
	}

	public void execute() {
		frontRow.close();
		
	}

	public void undo() {
		frontRow.push();
	}

}
