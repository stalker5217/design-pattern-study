package visitor;

public class Pad implements Item {
	private final int price;
	private final boolean screenCrack;

	public Pad(int price, boolean screenCrack) {
		this.price = price;
		this.screenCrack = screenCrack;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public boolean isScreenCrack() {
		return screenCrack;
	}

	@Override
	public int accept(SecondHandDealerVisitor secondHandDealerVisitor) {
		return secondHandDealerVisitor.visit(this);
	}
}
