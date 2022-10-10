package visitor;

public class Laptop implements Item {
	private final int price;

	public Laptop(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int accept(SecondHandDealerVisitor secondHandDealerVisitor) {
		return secondHandDealerVisitor.visit(this);
	}
}
