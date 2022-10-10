package visitor;

public interface SecondHandDealerVisitor {
	int visit(Phone phone);
	int visit(Pad pad);
	int visit(Laptop laptop);
}
