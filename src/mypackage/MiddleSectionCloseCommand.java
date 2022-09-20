package mypackage;

public class MiddleSectionCloseCommand implements Command {
	
	MiddleSection middleSection;

	public MiddleSectionCloseCommand(MiddleSection middleSection) {
		super();
		this.middleSection = middleSection;
	}

	public void execute() {
		middleSection.close();
		
	}

	public void undo() {
		middleSection.expand();
	}

}
