package mypackage;

public class FrontRowCloseCommand implements Command {
	
	FrontRow frontRow;

	public void execute() {
		frontRow.close();
		
	}

	public void undo() {
		frontRow.push();
	}

}
