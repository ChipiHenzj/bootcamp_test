package main.java.org.activity05;

public class Fuel {

	private int totalAmount;
	private float price; // price in €/l

	public static void main (String [] args){
		Fuel fuel = new Fuel(50);
		fuel.setPrice(2);
		System.out.println(fuel.toString());
	}
	
	public Fuel(int newAmount) {
		// set total amount of fuel according to the passed value
		
		totalAmount = newAmount;
	}

	public void setPrice(float newPrice) {
		// set price of the fuel according to the passed value
		
		price = newPrice;
	}

	public void useFuel(int amount) {
		// decrease total amount of fuel according to the passed value
		
		totalAmount -= amount;
	}

	public float getPrice() {
		// return price of the fuel
		
		return price;
	}

	public int getTotalAmount() {
		// return total amount of the fuel
		
		return totalAmount;
	}
	
//	
	public void setTotalAmount(int total) {
		
		totalAmount = total;
	}

	// override .toString() method for fuel to return string in format:
	// "Total amount: 10l price: 1.20€/l"
	

	public String toString() {
		
		String string = Integer.toString(totalAmount);
		return "Total amount: " + string + "l price:" + price + "€/l";
	}

}
