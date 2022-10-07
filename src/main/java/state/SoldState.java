package state;

public class SoldState implements State {
	private final ToyCapsuleMachine toyCapsuleMachine;

	public SoldState(ToyCapsuleMachine toyCapsuleMachine) {
		this.toyCapsuleMachine = toyCapsuleMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("캡슐이 나오는 중입니다.");
	}

	@Override
	public void ejectCoin() {
		System.out.println("이미 뽑으셨어요.");
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요.");
	}

	@Override
	public void dispense() {
		System.out.println("캡슐을 내보내는 중입니다.");
		toyCapsuleMachine.releaseCapsule();

		if (toyCapsuleMachine.getCount() > 0) {
			toyCapsuleMachine.setState(toyCapsuleMachine.getNoCoinState());
		} else {
			toyCapsuleMachine.setState(toyCapsuleMachine.getSoldOutState());
		}
	}
}
