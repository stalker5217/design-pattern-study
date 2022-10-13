package command;

public class RemoteControlTestDrive {
	public static void main(String[] args) {
		Light light = new Light("toilet");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		RemoteControl remoteControl = new RemoteControl();

		remoteControl.setCommand(lightOnCommand, lightOffCommand);
		remoteControl.on();
		remoteControl.off();

		Tv tv = new Tv("living room");
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		TvOffCommand tvOffCommand = new TvOffCommand(tv);

		remoteControl.setCommand(tvOnCommand, tvOffCommand);
		remoteControl.on();
		remoteControl.off();
	}
}
