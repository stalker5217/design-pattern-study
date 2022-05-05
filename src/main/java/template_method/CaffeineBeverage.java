package template_method;

public abstract class CaffeineBeverage {
	final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("물을 끓인다");
	}

	void pourInCup() {
		System.out.println("컵에 따른다");
	}
}
