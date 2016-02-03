package main.java.org.extra03BridgePattern;

public class Triangle extends Shape {

	Triangle(Color color) {
		super(color);
	}

	public void colorIt() {
		color.addColor();
		System.out.print("triangle ");
	}
}
