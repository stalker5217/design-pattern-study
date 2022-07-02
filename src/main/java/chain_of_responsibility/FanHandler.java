package chain_of_responsibility;

public class FanHandler extends MailTypeHandler {
	public FanHandler(String typeName) {
		super(typeName);
	}

	@Override
	protected boolean resolve(String message) {
		return message.contains("사랑해");
	}
}
