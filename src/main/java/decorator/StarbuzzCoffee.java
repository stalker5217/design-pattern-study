package decorator;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage americano = new Americano();
		System.out.println(americano.cost());

		Beverage doubleShotAndSyrupAmericano = new Americano();
		doubleShotAndSyrupAmericano = new Shot(doubleShotAndSyrupAmericano);
		doubleShotAndSyrupAmericano = new Shot(doubleShotAndSyrupAmericano);
		doubleShotAndSyrupAmericano = new Syrup(doubleShotAndSyrupAmericano);
		System.out.println(doubleShotAndSyrupAmericano.cost());
	}
}
