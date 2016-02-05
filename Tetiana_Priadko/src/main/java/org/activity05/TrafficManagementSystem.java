package main.java.org.activity05;

public class TrafficManagementSystem {
	static Fuel fuel;
	static Transport[] transports;
	static Road[] roads;
	static float fuelPrice;
	static int fuelAmount;

	public static void initSystem(int roads, int transport, int fuelAmount,
			float fuelPrice) {
		// save passed values into structures of Traffic Management System

		TrafficManagementSystem.roads = new Road[roads];
		TrafficManagementSystem.transports = new Transport[transport];
		fuel = new Fuel(fuelAmount);

		TrafficManagementSystem.fuelAmount = fuelAmount;
		TrafficManagementSystem.fuelPrice = fuelPrice;
		TrafficManagementSystem.fuel.setPrice(fuelPrice);

	}

	public static Transport[] getTransports() {
		// return required value
		return transports;
	}

	public static void addTransport(int i) {
		// create new array of transports in size of passed value
		Transport[] newTransports = new Transport[i];
	}

	public static void setVehicle(Transport transport, int i) {
		// set passed transport into passed cell of transports array
		transports[i] = transport;
	}

	public static void addRoads(int i) {
		// create new array of roads in size of passed value
		Road[] newRoads = new Road[i];
	}

	public static Road[] getRoads() {
		// return required value
		return roads;
	}

	public static void setRoad(Road road, int i) {
		// set passed road into passed cell of roads array
		roads[i] = road;
	}

	public static double maxDistance(Transport transport) {
		// Calculate maximum distance transport can make with full tank
		double maxDistance = ((float) transport.getTankSize()
				/ transport.getConsumption() * 100);
		return maxDistance;
	}

	public static void fillTransportTanks() {
		// fill all fuel tanks of all transports with fuel
		for (int i = 0; i < transports.length; i++) {
			transports[i].fillTank(fuel);
		}
	}

	public static boolean canDriveDistance(Transport transport, Road road) {
		// Calculate if passed transport can drive passed road

		if ((((float) road.getDistance()) / 100 * transport.getConsumption()) <= transport
				.getFuelInTank()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean canDriveInPrice(Transport transport, Road road,
			float price) {
		// Calculate if passed transport can drive passed road in passed
		// price
		if (((road.getDistance() / 100 * transport.getConsumption() * fuelPrice)) <= price) {
			return true;
		} else {
			return false;
		}
	}

	public static Fuel getFuel() {
		// return reference to fuel of Traffic Management System
		return fuel;
	}

}
