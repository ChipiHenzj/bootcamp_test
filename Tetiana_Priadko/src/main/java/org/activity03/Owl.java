package main.java.org.activity03;

public class Owl {
	// Class Owl when it's born haven't caught any mice.
	// All owls have cuteness level set to the largest possible integer value.
	public int catchedMiceCount;
	private String name;
	private final int cuteness;

	public Owl(String name) {
		// Creates new owl, assign a name for it, set its cuteness to the
		// highest possible value and make it hoot

		this.name = name;
		cuteness = Integer.MAX_VALUE;
		hoot();
	}

	public String getName() {
		// Return owl's name
		return name;
	}

	public void setName(String name) {
		// Change current owl name to the specified name
		this.name = name;
	}

	public int getCuteness() {
		// Return cuteness level
		return cuteness;
	}

	public void hoot() {
		// Make owl to make "Whooo, whooo!" in standard output
		System.out.println("Whooo, whooo!");
	}
}
