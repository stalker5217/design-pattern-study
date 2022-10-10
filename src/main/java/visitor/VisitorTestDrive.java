package visitor;

import java.util.List;

public class VisitorTestDrive {
	public static void main(String[] args) {
		final List<Item> items = List.of(
			new Phone(1500, false),
			new Phone(900, true),
			new Pad(1200, true),
			new Laptop(2600)
		);

		final SecondHandDealerVisitor secondHandDealer = new SecondHandDealer();
		final int sum = items.stream()
			.mapToInt(item -> item.accept(secondHandDealer))
			.sum();

		System.out.println("sum: " + sum);
	}
}
