package mediator;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Calendar implements Colleague {
	@Override
	public void doEvent() {
		System.out.println("Calendar Event!");
	}

	public boolean isWeekend() {
		DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
		return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
	}
}
