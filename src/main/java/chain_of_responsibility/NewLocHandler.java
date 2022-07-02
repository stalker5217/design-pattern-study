package chain_of_responsibility;

public class NewLocHandler extends MailTypeHandler {
	public NewLocHandler(String typeName) {
		super(typeName);
	}

	@Override
	protected boolean resolve(String message) {
		return message.contains("설치");
	}
}
