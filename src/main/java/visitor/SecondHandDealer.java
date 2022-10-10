package visitor;

public class SecondHandDealer implements SecondHandDealerVisitor {
	@Override
	public int visit(Phone phone) {
		int originalPrice = phone.getPrice();
		if (phone.isAndroid()) {
			return originalPrice < 10 ? originalPrice : 10;
		} else {
			return originalPrice / 2;
		}
	}

	@Override
	public int visit(Pad pad) {
		int originalPrice = pad.getPrice();
		if (pad.isScreenCrack()) {
			return originalPrice / 2 - 100;
		} else {
			return originalPrice / 2;
		}
	}

	@Override
	public int visit(Laptop laptop) {
		int originalPrice = laptop.getPrice();
		if (originalPrice > 2000) {
			return originalPrice / 2;
		} else {
			return originalPrice / 3;
		}
	}
}
