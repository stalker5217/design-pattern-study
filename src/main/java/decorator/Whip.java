package decorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .2 + beverage.cost();
	}
}
