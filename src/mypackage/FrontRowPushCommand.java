package mypackage;

public class FrontRowPushCommand implements Command {
	
	FrontRow frontRow;

	public FrontRowPushCommand(FrontRow frontRow) {
		super();
		this.frontRow = frontRow;
	}

	public void execute() {
		frontRow.push();
		
	}

	public void undo() {
		frontRow.close();
	}

}
