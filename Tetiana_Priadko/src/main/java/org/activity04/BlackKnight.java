package main.java.org.activity04;

/**
 * Black Knight is brave soldier who fights till he is alive. He doesn't bother
 * if some of his arms or legs are cut off. You can kill him only when he lose
 * head. More info at:
 * https://en.wikipedia.org/wiki/Black_Knight_%28Monty_Python%29
 */
public class BlackKnight {
	// Class variables which are shared between all class members (objects)
	public static short totalKnights; // total number of knights at the start of
										// the battle
	public static short aliveKnights; // total number of alive knights
	public static short deadKnights; // total number of dead knights
	public static BlackKnight[] knights; // array of knights in the battle

	// instance variables which are separate for each class member (object)
	public String name; // knight name
	public byte arms, legs, head; // number of limbs
	public boolean alive; // is knight alive

	
	public static void setBattle(int initialNumber) {
		// initialize new array of knights with the passed size.
		// Reset total numbers of total and alive knights to zero
		

		knights = new BlackKnight[initialNumber];
		
		totalKnights = 0;
		aliveKnights = 0;
		deadKnights = 0;
		
		
	}

	public BlackKnight(String name) {
		// set name of newly created knight
		// set count of his arms, legs and head,
		// put reference to this knight into next free cell in array of
		// knights and increase number of total and alive knights appropriately
		

		this.name = name;
		arms = 2;
		legs = 2;
		head = 1;
		
		knights[totalKnights] = this;
		totalKnights++;
		aliveKnights++;
		
		alive = true;
	}

	public String cutOffArm() {
		// handle cutting off knight's arms in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has both arms, cut one off and return
		// "I still can fight with one arm left"
		// If knight has one arm left, cut it off and return "Bugger!"
		// Else return just "Haah!"
		
		if (!alive){
			System.out.println();
			return "Only chicken beats dead!";
		} else if (arms == 2){
			arms--;
			return "I still can fight with one arm left";
		} else if (arms == 1){
			arms--;
			return "Bugger!";
		} else {
			return "Haah!";
		}
		
	}

	public String cutOffLeg() {
		// handle cutting off legs knight's legs in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has both legs, cut one off and return
		// "I still can fight with one leg left"
		// If knight has one leg left, cut it off and return "Bollocks!"
		// Else return just "Haah!"
		

		if (!alive){
			return "Only chicken beats dead!";
		} else if (legs == 2){
			legs--;
			return "I still can fight with one leg left";
		} else if (legs == 1){
			legs--;
			return "Bollocks!";
		} else {
			return "Haah!";
		}
	}

	public String cutOffHead() {
		// TODO handle cutting off knight's head in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight is alive and has head, cut it off and update
		// number of total alive and dead knights and then
		// If there are other knights alive return "You'l newer win! There
		// is/are still Arthur, Cnut to fight!"
		// Where "Arthur, Cnut" are names of still alive knights
		// Else return "You'l burn in hell forever!"
		
		if (!alive){
			return "Only chicken beats dead!";
		} else if (alive && head == 1){
			head--;
			aliveKnights--;
			deadKnights++;
			alive = false;
			
		}
		
		if(aliveKnights > 0){
			//names of alive knights with ", "
			String namesOfStillAliveKnights = "";
			
			//check is or are
			// and get index of last alive
			int countOfAlive = 0;
			int indexOfLastAlive = 0;
			for(int i = 0; i < knights.length; ++i){
				if(knights[i].alive){
					countOfAlive++;
					indexOfLastAlive = i;
				}
			}
			
			//Check result (is or are)
			String isOrAre = "";
			if(countOfAlive > 1){
				isOrAre = " are ";
			} else {
				isOrAre = " is ";
			}
			
			for (int i = 0; i < knights.length; ++i){
				if (knights[i].alive){
					if((i + 1) < knights.length && i < indexOfLastAlive){
						namesOfStillAliveKnights += knights[i].name + ", ";
					} else {
						namesOfStillAliveKnights += knights[i].name;
					}
				}
			}
			
			return "You'l newer win! There"
			+ isOrAre 
			+ "still"
			+ " "
			+ namesOfStillAliveKnights 
			+ " to fight!";
		} else {
			return "You'l burn in hell forever!";
		}
	
	}

}
