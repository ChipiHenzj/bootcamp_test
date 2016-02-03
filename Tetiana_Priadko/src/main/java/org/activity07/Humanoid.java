package main.java.org.activity07;

public interface Humanoid {

	final static int LEG_COUNT = 2;

	/**
	 * 
	 * @return weight of the current humanoid.
	 */
	public int getWeight();

	/**
	 * 
	 * @param weight
	 *            for which this humanoid weight is needed to be changed.
	 */
	public void setWeight(int weight);

	/**
	 * 
	 */
	public void sing();

	/**
	 * @return true if humanoid successfully killed himself, false if not.
	 */
	public boolean killHimself();
}
