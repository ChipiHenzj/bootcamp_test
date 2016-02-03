package main.java.org.activity07;

public class AlienFromMars implements Humanoid, Alien {

	private int weight;

	/**
	 * This method creates new alien with specified weight.
	 * 
	 * @param weight
	 *            represents new alien weight.
	 */
	public AlienFromMars(int weight) {
		this.weight = weight;
	}

	/**
	 * This method doubles the current alien weight.
	 */
	@Override
	public void doubleWeight() {

		// TODO #1 multiply alien weight by 2.

	}

	/**
	 * This method allows alien to eat human. If human is still alive, his live
	 * level changes to 0 and all weight is transfered to alien.
	 * 
	 * @param human
	 *            - represents human, which will be eaten.
	 */
	@Override
	public void eatHuman(Human human) {

		// TODO #2: implement method, according to description above.

	}

	/**
	 * This method makes alien to say "Place for your advertisement!" to the
	 * console.
	 */
	@Override
	public void sing() {
		// TODO #3: Make alien sing to the console.

	}

	/**
	 * This method tries to kill alien, but it is impossible, so alien says,
	 * "I AM IMMORTAL MUAHAHAHAHA!" to the console.
	 * 
	 * @return false, because alien cannot be killed.
	 */
	@Override
	public boolean killHimself() {

		// TODO #4 implement alien suicide logic.

		return false;
	}

	/**
	 * @return returns current alien weight.
	 */
	@Override
	public int getWeight() {
		return this.weight;
	}

	/**
	 * This method sets input value to the class variable.
	 * 
	 * @param weight
	 *            - weight will be set to current Alien.
	 */
	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}
}
