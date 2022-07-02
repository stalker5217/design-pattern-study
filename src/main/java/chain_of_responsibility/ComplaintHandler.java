package chain_of_responsibility;

public class ComplaintHandler extends MailTypeHandler {
	public ComplaintHandler(String typeName) {
		super(typeName);
	}

	@Override
	protected boolean resolve(String message) {
		return message.contains("씨발");
	}
}
