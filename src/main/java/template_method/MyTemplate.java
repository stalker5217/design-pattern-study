package template_method;

public abstract class MyTemplate {
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		if (hook()) {
			concreteOperation();
		}
	}

	// 하위 클래스에서 재정의
	abstract void primitiveOperation1();

	// 하위 클래스에서 재정의
	abstract void primitiveOperation2();

	// 공통으로 사용되는 구체 메서드
	final void concreteOperation() {
		// ...
	}

	// 상황에 따라 템플릿 알고리즘의 진행 사항을 변경하거나,
	// 템플릿에서 필수 요소는 아니나 부가적인 기능을 구현하거나하는
	// 다양한 목적으로 사용
	public boolean hook() {
		return true;
	}
}
