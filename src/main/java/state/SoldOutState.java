package state;

public class SoldOutState implements State {
	@Override
	public void insertCoin() {
		System.out.println("다 팔렸습니다.");
	}

	@Override
	public void ejectCoin() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void turnCrank() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void dispense() {
		throw new UnsupportedOperationException();
	}
}
