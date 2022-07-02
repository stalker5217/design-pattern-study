package chain_of_responsibility;

public class SpamHandler extends MailTypeHandler {
	public SpamHandler(String typeName) {
		super(typeName);
	}

	@Override
	protected boolean resolve(String message) {
		return message.contains("광고");
	}
}
