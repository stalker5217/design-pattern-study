package state;

public class NoCoinState implements State {
	private final ToyCapsuleMachine toyCapsuleMachine;

	public NoCoinState(ToyCapsuleMachine toyCapsuleMachine) {
		this.toyCapsuleMachine = toyCapsuleMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("동전을 넣었습니다.");
		toyCapsuleMachine.setState(toyCapsuleMachine.getHasCoinState());
	}

	@Override
	public void ejectCoin() {
		System.out.println("동전이 없습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("동전이 없습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("동전이 없습니다.");
	}
}
