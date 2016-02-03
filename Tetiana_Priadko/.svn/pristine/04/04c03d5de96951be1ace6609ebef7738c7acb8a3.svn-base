package main.java.org.activity03;


public class OwlFarm {
	private Owl[] owls;
	private int owlCount;

	// You can use main() method to test your implementation by
	// running it as a Java application
	// Note that Unit tests don't invoke this method

	public static void main(String[] args) {
		// Change your code here, to check, how it works

		OwlFarm owlTester = new OwlFarm();
		owlTester.setupFarm();

		owlTester.renameOwl("Bob", "Marley");
	}

	/**
	 * Create method, which generates random length array of owls. Make first
	 * owl to catch one mouse, print its cuteness level, and change owl named
	 * "Bob" to "Marley", if it exists.
	 */
	public void setupFarm() {
		// #1 Generate random number between >0 and < 5 to use it as
		// owlCount
		// HINT: use Random class for this.

		owlCount = 1 + (int) (Math.random() * (4 - 1 + 1));

		// #2 Create owl array and fill names: "Alfonso", "Bob", "Charly",
		// "Diana", "Edgar"

		owls = new Owl[owlCount];
		String[] names = new String[] { "Alfonso", "Bob", "Charly", "Diana",
				"Edgar" };
		for (int i = 0; i < owlCount; ++i) {
			owls[i] = new Owl(names[i]);
		}
		owls[0] = new Owl("Alfonso");

		// #3 Make first owl to catch one mouse.
		// HINT Pay attention - cached mice count is public and cuteness level
		// is private.

		owls[0].catchedMiceCount = (owls[0].catchedMiceCount + 1);
	}

	/**
	 * If owl with such name exists, changes it's name.
	 * 
	 * @param startName
	 *            name which is needed to be changed.
	 * @param endName
	 *            for which we need to change owl name.
	 */
	public void renameOwl(String startName, String endName) {
		// #5 Parse through owls and check their names
		// current name of owl is as startName, change it to the endName
		// HINT : Pay attention - name field is private.

		for (int i = 0; i < 5; ++i) {
			if (owls[i].getName().equals(startName)) {
				System.out.println();
				System.out.println("Was " + owls[i].getName());
				owls[i].setName(endName);
				System.out.println("Now is " + owls[i].getName());
				break;
			}
		}
	}

	public Owl[] getOwls() {

		// return refernece to owl array

		return owls;
	}

	public int getOwlCount() {
		// return count of array length

		return owls.length;
	}

}
