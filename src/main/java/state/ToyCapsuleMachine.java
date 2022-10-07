package state;

public class ToyCapsuleMachine {
	private final State soldOutState;
	private final State noCoinState;
	private final State hasCoinState;
	private final State soldState;

	private State state;
	private int count;

	public ToyCapsuleMachine(int initCapsuleCount) {
		this.soldOutState = new SoldOutState();
		this.noCoinState = new NoCoinState(this);
		this.hasCoinState = new HasCoinState(this);
		this.soldState = new SoldState(this);

		this.count = initCapsuleCount;
		if (initCapsuleCount > 0) {
			state = noCoinState;
		} else {
			state = soldOutState;
		}
	}

	public void insertCoin() {
		state.insertCoin();
	}

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseCapsule() {
		if (count > 0) {
			count--;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}
}
