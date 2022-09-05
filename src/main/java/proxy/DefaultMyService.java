package proxy;

public class DefaultMyService implements MyService {
	@Override
	public void myLogic() {
		System.out.println("Hello World!");
	}
}
