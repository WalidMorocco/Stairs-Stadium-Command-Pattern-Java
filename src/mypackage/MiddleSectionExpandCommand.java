package mypackage;

public class MiddleSectionExpandCommand implements Command {
	
	MiddleSection middleSection;

	public void execute() {
		middleSection.expand();
		
	}

	public void undo() {
		middleSection.close();
	}

}
