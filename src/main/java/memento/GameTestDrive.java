package memento;

public class GameTestDrive {
	public static void main(String[] args) {
		Game game = new Game();
		game.setLevel(1);
		game.setScore(0);

		// 현재 상태 저장
		GameMemento memento = game.createMemento();

		// 복구
		game.restore(memento);
	}
}
