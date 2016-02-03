package main.java.org.activity17;

import java.util.ArrayList;

public class GreedyCrocodileStrategy implements CrocodileStrategy {

	private int[][] board;
	private int moveCount = 0;
	private int[] currentPosition = { 0, 0 };
	private ArrayList<int[]> candies = new ArrayList<int[]>();

	@Override
	/**
	 * Greedy crocodile is two times faster, than other crocodiles, but he is
	 * always hungry, so he starts traversing from eating all candies in the
	 * maze. When he ate all, he happily gets out of maze.
	 * @param board on which crocodile will play.
	 */
	public void traverseBoard(int[][] board) {
		this.board = board;
		this.getAllCandies();

		// TODO #1 Make crocodile to find and eat all candies.
		// TODO #2 Make crocodile to find out the way from the maze.
	}

	@Override
	/**
	 * Greedy crocodile is two times faster, than other.
	 */
	public int getMoveCount() {
		// TODO #3 return move count crocodile needed to get out of the maze.
		return 0;
	}

	/**
	 * This method parses the maze from left upper corner from left to right
	 * from top to bottom. It founds all candies and add them to candy
	 * arraylist.
	 */
	public void getAllCandies() {
		// TODO #4 find all candies in the maze and place them to the list
	}

	/**
	 * This method calculates the distance between current position and input
	 * position.
	 * 
	 * @param position
	 *            position to which we need to calculate distance.
	 * @return distance between two maze points.
	 */
	public int distance(int[] position) {
		int distance = 0;
		// TODO #4 Calculate the distance between two points.
		// HINT distance is equal to sum of differences by x and by y
		// coordinates.
		return distance;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public int[] getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int[] currentPosition) {
		this.currentPosition = currentPosition;
	}

	public ArrayList<int[]> getCandies() {
		return candies;
	}

	public void setCandies(ArrayList<int[]> candies) {
		this.candies = candies;
	}

}
