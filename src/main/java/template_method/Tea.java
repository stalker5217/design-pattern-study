package template_method;

public class Tea extends CaffeineBeverage{
	@Override
	void brew() {
		System.out.println("차를 우려낸다");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가한다");
	}
}
