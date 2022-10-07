package state;

public class ToyCapsuleMachineTestDrive {
	public static void main(String[] args) {
		ToyCapsuleMachine toyCapsuleMachine = new ToyCapsuleMachine(10);

		toyCapsuleMachine.insertCoin();
		toyCapsuleMachine.ejectCoin();
		toyCapsuleMachine.turnCrank();
		toyCapsuleMachine.insertCoin();
		toyCapsuleMachine.turnCrank();
	}
}
