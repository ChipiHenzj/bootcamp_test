package main.java.org.activity06;

import main.java.org.activity05.Road;
import main.java.org.activity05.Transport;

//  implement Vehicle class as a subclass of Transport
	public class Vehicle extends Transport{
	// #1: Create variable to store number of wheels for Vehicle
		
	private int wheels;	
	
	/**
	 * @param id
	 * @param wheels
	 */
	
	
	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		// #3: Set passed id and number of wheels for Vehicle
		// Set other properties of the Transport
		
		super(id, consumption, tankSize);
		this.wheels = wheels;
	}

	/*
	 * @see main.java.org.activity06.Transport#move()
	 */
	// TODO #4: implement method move() for vehicle, which returns
	// String in form: "ID Vehicle is driving with x wheels"
	// where x is actual number of wheels
	// Else return "Cannot drive on " + Road representation as String
	public String move(Road road) {
//		???????
		boolean can = CanMoveRoad(road);
		String result = super.move(road);
		if (can){
			return result + "with " + wheels + " wheels";
		} else {
			return result; 
		}
	
		 
	}

	}
