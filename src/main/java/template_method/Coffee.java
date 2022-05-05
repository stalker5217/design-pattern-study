package template_method;

public class Coffee extends CaffeineBeverage{
	@Override
	void brew() {
		System.out.println("커피를 추출한다");
	}

	@Override
	void addCondiments() {
		System.out.println("우유를 추가한다");
	}
}
