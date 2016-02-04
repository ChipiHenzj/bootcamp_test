package main.java.org.activity05;

import java.util.Locale;

import main.java.org.activity06.WaterRoad;

public class Transport {
	protected String id; // Transport registration number
	private float consumption; // fuel consumption in litres per 100km
	private int tankSize; // tank size in litres
	private float fuelInTank; // fuel in tank

	public Transport(String id, float consumption, int tankSize) {
		// save passed values for Transport
		this.id = id;
		this.consumption = consumption;
		this.tankSize = tankSize;
	}

	public float getConsumption() {
		// return required value
		return consumption;
	}

	public int getTankSize() {
		// return required value
		return tankSize;
	}

	public String getId() {
		// return required value
		return id;
	}

	// Return transport id and type as string e.g. "AAA Transport"
	// HINT: use this.getClass().getSimpleName(); to get type of transport
	protected final String getType() {
		// return required value
		return id + " " + this.getClass().getSimpleName();
	}

	// HINT: use getType() to describe transport and road.toString() to describe
	// road
	// HINT: String.format(Locale.US, "%.2f", float) to format float number with
	// fixed mask
	public String move(Road road) {
		// If transport has enough fuel, decrease actual amount of fuel by
		// necessary amount and return String in form:
		// "AAA Type is moving on From–To, 180km"

		// If there is no enough fuel in tank, return string in form:
		// "Cannot move on From–To, 180km. Necessary
		// fuel:0.00l, fuel in tank:0.00l"

		float necessaryAmount = (((float) road.getDistance()) / 100 * consumption);

		if (necessaryAmount <= fuelInTank) {
			fuelInTank -= necessaryAmount;
			return getType() + " is moving on " + road.toString();
		} else {
			return "Cannot move on " + road.toString() + ". Necessary fuel:"
					+ String.format(Locale.US, "%.2f", necessaryAmount)
					+ "l, fuel in tank:"
					+ String.format(Locale.US, "%.2f", fuelInTank) + "l";
		}
	}

	public void fillTank(Fuel fuel) {
		// fill fuel tank with amount free space in tank
		// decrease amount of passed fuel with this amount

		// if (fuel.getTotalAmount() > (((float)tankSize) - fuelInTank)) {
		// int unnecessary = (int)(fuel.getTotalAmount() - (tankSize -
		// fuelInTank));
		// fuelInTank += (fuel.getTotalAmount() - unnecessary);
		// int totalFuel = TrafficManagementSystem.fuel.getTotalAmount();
		// totalFuel = unnecessary;
		// TrafficManagementSystem.fuel.setTotalAmount(totalFuel);
		// } else {
		// fuelInTank += fuel.getTotalAmount();
		// }

		float empty = (float) tankSize - fuelInTank;
		fuel.useFuel((int) empty);
		fuelInTank = tankSize;
	}

	public float getFuelInTank() {
		// return required value
		return fuelInTank;
	}

	// HINT: use String.format(Locale.US, "%.2f", float) to limit shown numbers
	// to 2 decimal for fractions, and dot as a decimal delimiter.
	public String toString() {
		// return string in form:
		// "Id:A cons:0.0l/100km, tank:00l, speed: 000km/h, fuel:00.00l"
		return "Id:" + id + " cons:"
				+ String.format(Locale.US, "%.1f", consumption) + "l/100km, "
				+ "tank:" + tankSize + "l, " +
				// speed
				"fuel:" + String.format(Locale.US, "%.2f", fuelInTank) + "l";
	}

	public boolean equals(Object obj) {
		// return true, if current transport and passed transport has the
		// same id
		// Otherwise return false
		// HINT use "obj instanceof Transport", to check, that passed object has
		// proper type
		if (obj instanceof Transport) {
			if (this.id.equals(((Transport) obj).getId())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
