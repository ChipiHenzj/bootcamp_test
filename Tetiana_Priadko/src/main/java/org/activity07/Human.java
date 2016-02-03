package main.java.org.activity07;

public class Human implements Humanoid {
	private String name;
	private int weight;
	int liveCount = 9;

	/**
	 * This method creates new human.
	 * 
	 * @param name
	 *            represents the name for new human.
	 */
	public Human(String name) {
		// TODO #1 create new human, assign him a name and make him weigh 42.
		// HINT: use this. notation to access variables, otherwise their class
		// value
		// will overshadow input value
		this.name = name;
		setWeight(42);	
		
	}

	/**
	 * 
	 * @param name
	 *            represents the name for new human.
	 * @param weight
	 *            represents the new human with output weight.
	 */

	// TODO #2 Overload the main constructor to create an opportunity to create
	// human with specified weight.

	public Human(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * This method makes Human to sing to the console
	 * "Humans are the best creatures in the world" to the console.
	 */
	@Override
	public void sing() {
		// TODO #3 make Human sing
		// "Humans are the best creatures in the world" to the console.
		System.out.println("Humans are the best creatures in the world!");
	}

	/**
	 * This method allows human to try to kill himself.
	 * 
	 * @return true if human died, false if not.
	 */
	@Override
	public boolean killHimself() {
		// TODO #4 all people have 9 lives at the beginning, after each attempt
	// of suicide they lose one. When lives are depleted, he dies.
		
		if(liveCount == 0){		
			return true;
		} else {
			liveCount--;
		   if(liveCount > 0){
			return false;
		   } else {
				return true;
		   }
		}		
	}
	
	/**
	 * This method returns human name.
	 * 
	 * @returns current human name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method changes current name to input.
	 * 
	 * @param name
	 *            for which we need to change.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method returns human liveCount.
	 * 
	 * @returns current human liveCount.
	 */
	public int getLiveCount() {
		return liveCount;
	}

	/**
	 * This method changes current human liveCount to input.
	 * 
	 * @param current
	 *            human liveCount.
	 */
	public void setLiveCount(int life) {
		this.liveCount = life;
	}

	/**
	 * This method returns human weight.
	 * 
	 * @returns current human weight.
	 */
	@Override
	public int getWeight() {
		return this.weight;
	}

	/**
	 * This method sets human weight to output.
	 * 
	 * @param weight
	 *            represents value for which we need to change.
	 */
	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
