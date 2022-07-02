package bridge;

public class Samsung extends TV {
	int station = 0;
	public void on() {
		System.out.println("Turning on the Samsung TV");
	}
	public void off() {
		System.out.println("Turning off the Samsung TV");
	}
	public void tuneChannel(int channel) {
		this.station = channel;
		System.out.println("Set the Samsung TV station to " + this.station);
	}
	public int getChannel() {
		return station;
	}
}
