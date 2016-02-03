package main.java.org.activity09;

/**
 * 
 * @author student IB
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSetMap {
	/**
	 * This code represents updated food list, where from full food list are
	 * deleted products that have been already bought.
	 * 
	 * @param foodFullList
	 *            full food list array
	 * @param boughtFood
	 *            bought food list array
	 * @return list full food list without bought items
	 */

	public List<String> foodList(String[] foodFullList, String[] boughtFood) {
		List<String> list = new ArrayList<String>();

		// TODO No. 1: Write code that will create List list with foodFoodList
		// items.

		// HINT: use a cycle to fill up the list.

		// TODO No. 2: Write code that will create List list2 with boughtFood
		// items.
		// HINT: use a cycle to fill up the list.

		// TODO No. 3: Write code that will delete bought items from list.
		// HINT: use Iterator.

		return list;
	}

	/**
	 * This code represents food list, where duplicated food items should be
	 * removed
	 * 
	 * @param foodList
	 *            food list array
	 * @return set food list without duplicated items
	 */

	public Set<String> removeDuplicatesSet(String[] foodList) {
		Set<String> set = new HashSet<String>();
		// TODO No. 5: Write code that will create List list with foodList
		// items.
		// Then try to remove duplicates.
		// HINT: use Set.
		// Advice: Explore methodality of Set and use it.
		System.out.println("set " + set);
		return set;
	}

	/**
	 * This code represents food list, that needs to be created
	 * 
	 * @return HashMap food list with item name and quantity
	 */

	public HashMap<String, Integer> quantityMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// TODO No. 7: Write code that will create Map map with foodList items
		// and their quantity.
		// Items and quantity are:
		// 10 eggs, 8 candies, 2 fishes, 2 peanuts
		// HINT: Try to avoid duplicated keys
		return map;
	}
}
