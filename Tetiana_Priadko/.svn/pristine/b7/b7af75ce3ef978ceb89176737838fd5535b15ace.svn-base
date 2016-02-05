package main.java.org.activity05;

public class Road {
	private String from; // Start point
	private String to; // End point
	private int distance; // distance in km

	public static void main(String[] args) {
		Road road = new Road("Riga", "Oslo", 200);
		System.out.println(road.toString());
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDistance() {
		// return distance of the road
		return distance;
	}

	public String toString() {
		// return string in form: "From — To, 00km"
		// Note that — is not dash ("minus key" in jargon), but m-dash!
		// See more at: https://en.wikipedia.org/wiki/Dash
		return from + " — " + to + ", " + distance + "km";
	}

	// HINT use "obj instanceof Road", to check, that passed object has proper
	// type
	public boolean equals(Object obj) {
		// return true, if current road and passed road has the same start,
		// end points and distance. Note that direction of road is not
		// important, but distance is (different distance means different
		// route)

		boolean isEquals;

		if (obj instanceof Road) {
			if (((Road) obj).distance == distance) {
				isEquals = true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		return isEquals;
	}

	public Road() {
		// implement Road constructor that without parameters
		// values are set to "" or 0;
		from = "";
		to = "";
		distance = 0;
	}

	public Road(String from, String to, int distance) {
		// save passed values into road properties
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

}
