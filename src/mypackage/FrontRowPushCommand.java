package mypackage;

public class FrontRowPushCommand implements Command {
	
	FrontRow frontRow;

	public void execute() {
		frontRow.push();
		
	}

	public void undo() {
		frontRow.close();
	}

}
