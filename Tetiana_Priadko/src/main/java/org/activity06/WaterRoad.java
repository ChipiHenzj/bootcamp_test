package main.java.org.activity06;

import main.java.org.activity05.Road;

public class WaterRoad extends Road {

	public static void main(String[] args) {

	}

	public WaterRoad(String from, String to, int dist) {
		// Reuse Road constructor with passed parameters
		super(from, to, dist);
	}

	public WaterRoad() {
		// reuse Road constructor without parameters
		super();
	}

	// override .toString() method for GroundRoad which returns string in
	// form: "Type From — To, 00km"
	// HINT use .getClass().getSimpleName() to get Type and reuse toString() of
	// Road
	public String toString() {
		return this.getClass().getSimpleName() + getFrom() + " — " + getTo()
				+ "," + getDistance() + "km";
	}

	// override .equals() method to return true, if current and ground
	// has the same start and end points, distance and type. Note that
	// direction is not important, but distance and road type is.
	// HINT use super keyword to reuse .equals for Road class and then add just
	// additional checks

	public boolean equals(Object obj) {
		if (super.equals(obj) == true) {
			if (obj.getClass().getSimpleName()
					.equals(this.getClass().getSimpleName())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
