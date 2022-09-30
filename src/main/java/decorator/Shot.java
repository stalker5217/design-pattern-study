package decorator;

public class Shot extends CondimentDecorator {
	public Shot(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .5 + beverage.cost();
	}
}
