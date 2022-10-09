package mediator;

public class SmartHomeMediator implements Mediator {
	private Calendar calendar;
	private Alarm alarm;
	private CoffeePot coffeePot;
	private Sprinkler sprinkler;

	public SmartHomeMediator(Calendar calendar, Alarm alarm, CoffeePot coffeePot, Sprinkler sprinkler) {
		this.calendar = calendar;
		this.alarm = alarm;
		this.coffeePot = coffeePot;
		this.sprinkler = sprinkler;
	}

	@Override
	public void alarmOperation() {
		if (!calendar.isWeekend()) {
			alarm.doAlarm();
			coffeePot.extract();
			sprinkler.spray();
		}
	}
}
