package decorator;

public class Syrup extends CondimentDecorator {
	public Syrup(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .1 + beverage.cost();
	}
}
