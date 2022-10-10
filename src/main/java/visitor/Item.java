package visitor;

public interface Item {
	int getPrice();
	int accept(SecondHandDealerVisitor secondHandDealerVisitor);
}
