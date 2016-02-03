package main.java.org.extra03BridgePattern;

abstract class Shape {

	Color color;

	Shape(Color color) {
		this.color = color;
	}

	abstract public void colorIt();
}
