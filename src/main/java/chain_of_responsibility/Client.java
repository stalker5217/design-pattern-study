package chain_of_responsibility;

public class Client {
	public static void main(String[] args) {
		MailTypeHandler baseHandler = new SpamHandler("spam");

		baseHandler
			.setNext(new FanHandler("fan"))
			.setNext(new ComplaintHandler("complaint"))
			.setNext(new NewLocHandler("new location"));

		baseHandler.handleRequest("광고임");
		baseHandler.handleRequest("사랑해");
		baseHandler.handleRequest("씨발아");
		baseHandler.handleRequest("설치 해주세요");
		baseHandler.handleRequest("일반");
	}
}
