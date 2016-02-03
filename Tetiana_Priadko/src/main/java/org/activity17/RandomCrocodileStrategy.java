package main.java.org.activity17;

import java.util.Random;

public class RandomCrocodileStrategy implements CrocodileStrategy {

	private int[][] board;

	private int moveCount = 0;

	@Override
	/**
	 * Random crocodile always will make random moves. If he accidentaly will
	 * find the exit from the maze, he will use it.
	 * param board represents board on which crocodile will play.
	 */
	public void traverseBoard(int[][] board) {
		this.board = board;
		int[] currentPosition = { 0, 0 };

		// TODO #1 Make random crocodile to always do random moves.
	}

	@Override
	/**
	 * 	Judges does not like random crocodile, and he is always punished for
	 *  50 additional moves.
	 *	@return movecount random crocodile needs to get out of maze.
	 */
	public int getMoveCount() {
		// TODO #2 Make the punishment to the crocodile( 50 additional moves)
		return moveCount;
	}

}
