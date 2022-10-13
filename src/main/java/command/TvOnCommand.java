package command;

public class TvOnCommand implements Command {
	private Tv tv;

	public TvOnCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
}
