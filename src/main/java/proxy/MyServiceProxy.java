package proxy;

public class MyServiceProxy implements MyService{
	private MyService myService;

	public MyServiceProxy(MyService myService) {
		this.myService = myService;
	}

	@Override
	public void myLogic() {
		long before = System.currentTimeMillis();
		myService.myLogic();
		long after = System.currentTimeMillis();

		System.out.println(after - before);
	}
}
