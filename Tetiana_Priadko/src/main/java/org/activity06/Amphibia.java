package main.java.org.activity06;

import main.java.org.activity05.Road;
import main.java.org.activity05.Transport;

//  #1: Implement Amphibia class in a such way, that it
// "is a Transport" and "looks like a Ship and a Vehicle"
// (has properties and methods of both).

public class Amphibia extends Transport {
	Ship ship;
	Vehicle vehicle;

	// #2: Implement way to store Ship and Vehicle structures
	// HINT: Start implementation of aggregate parts
	// (Vehicle and Ship) before implementing Amphibia

	private byte sails;
	private int wheels;

	// #3: Implement constructor, which set id, number of sails and
	// wheels for amphibia. Note that every part of Amphibia
	// should have the same id!
	public Amphibia(String id, float consumption, int tankSize, byte sails,
			int wheels) {
		super(id, consumption, tankSize);
		this.sails = sails;
		this.wheels = wheels;
	}

	// #5: implement method which shows how amphibia moves
	// If passed is WaterRoad road:
	// "ID Amphibia is sailing with X sails on water"
	// If passed is Road, return:
	// "ID Amphibia is driving with X wheels on earth"
	// Note, that on road amphibia should behave in the same way as a Transport

	public String move(Road road) {

		if (road instanceof WaterRoad) {
			return getType() + " is sailing with " + sails + " sails on "
					+ road.toString();
		} else {
			return getType() + " is driving with " + wheels + " wheels on "
					+ road.toString();
		}
	}
}
