package main.java.org.activity06;

import main.java.org.activity05.Road;
import main.java.org.activity05.Transport;

// TODO #1: implement Ship class as a subclass of Transport
	public class Ship extends Transport{
	// TODO #2: Create variable to store number of sails for ship
		
     private byte sails;
	/**
	 * @param id
	 * @param sails
	 */
	public Ship(String id, byte sails) {
		// TODO #3: Set passed id and number of sails for ship
		// Set other properties of the Transport
		
		super(id, 1, 1);
		this.sails = sails;
	}

	/*
	 * @see main.java.org.activity06.Transport#move()
	 */

	// TODO #4: implement similar method move() for ship, which returns
	// String in form: "ID Ship is sailing with x sails"
	// where x is actual number of sails
	// Else return "Cannot sail on " + Road representation as String
	public String move(Road road) {
		if(road instanceof WaterRoad ){
			return getType() + " is sailing on " + road.toString() + " with " + sails + " sails";
		} else {
			return "Cannot sail on " + road.toString();
		}
		
	}
	
	public byte getSails(){
		return sails;
	}
}
