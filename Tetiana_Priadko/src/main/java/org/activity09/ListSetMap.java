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
	
	public static void main(String[] args) {
//
		ListSetMap listSetMap = new ListSetMap();
		String [] food1 = new String[]{"1", "2", "3"};
		String [] food2 = new String[]{"2"};
		
		Iterator<String> iter = listSetMap.foodList(food1, food2).iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
//		String[] food = new String[] {"1", "2" , "2", "4", "10"};
//		Iterator<String> iter1 = listSetMap.removeDuplicatesSet(food).iterator();
//		
//		while(iter1.hasNext()){
//			System.out.println(iter1.next());
//		}
//		
//		System.out.println("" + listSetMap.removeDuplicatesSet(food));
	}
	
	
	
	
	
	 
	 public List<String> foodList(String[] foodFullList, String[] boughtFood) {
		List<String> list = new ArrayList<String>();

		// TODO No. 1: Write code that will create List list with foodFullList
				// items.
				// HINT: use a cycle to fill up the list.
		for(int i = 0; i < foodFullList.length; ++i){
			list.add(foodFullList[i]);
		}
		
		// TODO No. 2: Write code that will create List list2 with boughtFood
		// items.
		// HINT: use a cycle to fill up the list.
		
		List<String> list2 = new ArrayList<String>();
		for(int i = 0; i < boughtFood.length; ++i){
			list2.add(boughtFood[i]);
		}
		
		
		// TODO No. 3: Write code that will delete bought items from list.
		// HINT: use Iterator.
		
		Iterator<String> iterList = list.iterator();
		
		while (iterList.hasNext()) {
			String s = iterList.next();
			Iterator<String> iterList2 = list2.iterator();
			while(iterList2.hasNext()){
				if (s.equals(iterList2.next())) {
	                iterList.remove();
	        }
		}       
	}

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
		// TODO No. 5: Write code that will create List list with foodList
		// items.
		// Then try to remove duplicates.
		// HINT: use Set.
		// Advice: Explore methodality of Set and use it.
		
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < foodList.length; ++i){
			set.add(foodList[i]);
		}
		
		List<String> list = new ArrayList<String>();
		Iterator<String> iterator = set.iterator();
		for(int i = 0; i < set.size(); ++i){
			list.add(i, iterator.next());
		}
		
		
		System.out.println("set " + set);
		return set;
	}

	/**
	 * This code represents food list, that needs to be created
	 * 
	 * @return HashMap food list with item name and quantity
	 */

	public HashMap<String, Integer> quantityMap() {
		// TODO No. 7: Write code that will create Map map with foodList items
		// and their quantity.
		// Items and quantity are:
		// 10 eggs, 8 candies, 2 fishes, 2 peanuts
		// HINT: Try to avoid duplicated keys
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("eggs", 10);
		map.put("candies", 8);
		map.put("fishes", 2);
		map.put("peanuts", 2);
		
		return map;
	}
}
