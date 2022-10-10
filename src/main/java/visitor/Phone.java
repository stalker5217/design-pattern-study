package visitor;

public class Phone implements Item {
	private final int price;
	private final boolean android;

	public Phone(int price, boolean android) {
		this.price = price;
		this.android = android;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public boolean isAndroid() {
		return android;
	}

	@Override
	public int accept(SecondHandDealerVisitor secondHandDealerVisitor) {
		return secondHandDealerVisitor.visit(this);
	}
}
