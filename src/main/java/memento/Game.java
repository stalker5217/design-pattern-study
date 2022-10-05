package memento;

public class Game {
	private int level;
	private int score;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public GameMemento createMemento() {
		return new GameMemento(level, score);
	}

	public void restore(GameMemento gameMemento) {
		this.level = gameMemento.getLevel();
		this.score = gameMemento.getScore();
	}
}
