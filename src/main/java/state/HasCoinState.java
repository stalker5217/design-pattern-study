package state;

public class HasCoinState implements State {
	private final ToyCapsuleMachine toyCapsuleMachine;

	public HasCoinState(ToyCapsuleMachine toyCapsuleMachine) {
		this.toyCapsuleMachine = toyCapsuleMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("동전은 하나만 넣어주세요.");
	}

	@Override
	public void ejectCoin() {
		System.out.println("동전을 반환합니다.");
		toyCapsuleMachine.setState(toyCapsuleMachine.getNoCoinState());
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이를 돌립니다.");
		toyCapsuleMachine.setState(toyCapsuleMachine.getSoldState());
	}

	@Override
	public void dispense() {
		throw new UnsupportedOperationException();
	}
}
