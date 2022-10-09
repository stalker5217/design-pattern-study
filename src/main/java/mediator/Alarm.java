package mediator;

public class Alarm implements Colleague {
	private Mediator mediator;

	public Alarm(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void doEvent() {
		mediator.alarmOperation();
	}

	public void doAlarm() {
		System.out.println("beep. beep.");
	}
}
