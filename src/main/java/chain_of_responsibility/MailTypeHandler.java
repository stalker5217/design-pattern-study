package chain_of_responsibility;

public abstract class MailTypeHandler {
	private final String typeName;

	private MailTypeHandler next;

	protected MailTypeHandler(String typeName) {
		this.typeName = typeName;
	}

	public MailTypeHandler setNext(MailTypeHandler next) {
		this.next = next;
		return next;
	}

	public void handleRequest(String message) {
		if (resolve(message)) {
			System.out.println("Email Type: " + typeName);
		}

		if (next != null) {
			next.handleRequest(message);
		}
	}

	protected abstract boolean resolve(String message);
}
