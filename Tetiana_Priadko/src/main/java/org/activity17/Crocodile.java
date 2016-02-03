package main.java.org.activity17;

public class Crocodile {

	private String name;

	/**
	 * Interface, which describes - which strategy will use crocodile, to get
	 * out of the maze.
	 */
	private CrocodileStrategy strategy;

	public Crocodile(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CrocodileStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(CrocodileStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * THis method makes crocodile to start searching the exit from the maze.
	 * 
	 * @param board
	 *            represent board on which crocodile will play.
	 */
	public void traverseBoard(int[][] board) {
		// TODO start searching exit from the maze
	}

	/**
	 * This method gets the move count crocodile needs to get out of maze.
	 * 
	 * @return movecount crocodile used to get out of maze.
	 */
	public int getMoveCount() {
		return strategy.getMoveCount();
	}
}
