package mypackage;

public class MiddleSectionExpandCommand implements Command {
	
	MiddleSection middleSection;

	public MiddleSectionExpandCommand(MiddleSection middleSection) {
		super();
		this.middleSection = middleSection;
	}

	public void execute() {
		middleSection.expand();
		
	}

	public void undo() {
		middleSection.close();
	}

}
