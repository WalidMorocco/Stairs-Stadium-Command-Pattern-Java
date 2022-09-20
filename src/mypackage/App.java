package mypackage;

public class App {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();
		
		// Create all the control stair devices in their proper location
		FrontRow frontRow = new FrontRow("Front Row North Wing Stairs");
		MiddleSection middleSection = new MiddleSection("Middle Section East Wing Stairs");
		Balcony balcony= new Balcony("Balcony South Wing Stairs");


		// Create all the front row section stair commands
		FrontRowPushCommand frontRowPushCommand = new FrontRowPushCommand(frontRow);
		FrontRowCloseCommand frontRowCloseCommand = new FrontRowCloseCommand(frontRow);
		
		// Create all the middle section stair commands
		MiddleSectionExpandCommand middleSectionExpandCommand = new MiddleSectionExpandCommand(middleSection);
		MiddleSectionCloseCommand middleSectionCloseCommand = new MiddleSectionCloseCommand(middleSection);
		
		// Create all the balcony section stair commands
		BalconyPushCommand balconyPushCommand = new BalconyPushCommand(balcony);
		BalconyCloseCommand balconyCloseCommand= new BalconyCloseCommand(balcony);
		
		// Load command into the remote slots
		remoteControl.setCommand(0, frontRowPushCommand, frontRowCloseCommand);
		remoteControl.setCommand(1, middleSectionExpandCommand, middleSectionCloseCommand);
		remoteControl.setCommand(2, balconyPushCommand, balconyCloseCommand);
		
		// Print our remote
		System.out.println(remoteControl);
		
		// Push and retract front row stairs
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		// Push and retract middle section stairs
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		// Push and retract balcony stairs
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		// Undo last button
		remoteControl.undoButtonWasPushed();
	}

}
