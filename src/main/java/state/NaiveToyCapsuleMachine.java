package state;

public class NaiveToyCapsuleMachine {
	private State state;
	private int count;

	public NaiveToyCapsuleMachine() {
		count = 0;
		state = State.SOLD_OUT;
	}

	public NaiveToyCapsuleMachine(int count) {
		this.count = count;
		this.state = count > 0 ? State.NO_COIN : State.SOLD_OUT;
	}

	public void insertCoin() {
		if (state == State.HAS_COIN) {
			System.out.println("동전은 하나만 넣어주세요.");
		} else if (state == State.NO_COIN) {
			state = State.HAS_COIN;
			System.out.println("동전을 넣었습니다.");
		} else if (state == State.SOLD_OUT) {
			System.out.println("다 팔렸습니다.");
		} else if (state == State.SOLD) {
			System.out.println("캡슐이 나오는 중입니다.");
		}
	}

	public void ejectCoin() {
		if (state == State.HAS_COIN) {
			state = State.NO_COIN;
			System.out.println("동전을 반환합니다.");
		} else if (state == State.NO_COIN) {
			System.out.println("동전이 없습니다.");
		} else if (state == State.SOLD_OUT) {
			System.out.println("동전이 없습니다?");
		} else if (state == State.SOLD) {
			System.out.println("이미 뽑으셨어요.");
		}
	}

	public void turnCrank() {
		if (state == State.HAS_COIN) {
			state = State.SOLD;
			System.out.println("손잡이를 돌립니다.");
			dispense();
		} else if (state == State.NO_COIN) {
			System.out.println("동전이 없습니다.");
		} else if (state == State.SOLD_OUT) {
			System.out.println("매진 상태입니다.");
		} else if (state == State.SOLD) {
			System.out.println("손잡이는 한 번만 돌려주세요.");
		}
	}

	private void dispense() {
		if (state == State.HAS_COIN) {
			System.out.println("캡슐을 내보낼 수 없습니다.");
		} else if (state == State.NO_COIN) {
			System.out.println("동전이 없습니다.");
		} else if (state == State.SOLD_OUT) {
			System.out.println("다 팔렸습니다.");
		} else if (state == State.SOLD) {
			System.out.println("캡슐을 내보내는 중입니다.");

			if (--count == 0) {
				state = State.SOLD_OUT;
				System.out.println("다 털었습니다.");
			} else {
				state = State.NO_COIN;
			}
		}
	}

	private enum State {
		SOLD_OUT, NO_COIN, HAS_COIN, SOLD
	}
}
