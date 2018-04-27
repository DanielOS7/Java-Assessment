import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Hello! Welcome to ‘The adventure of the barren moor’");
		System.out.println("What is your name?:");
		
		PlayerName nameR = new PlayerName();
		
		@SuppressWarnings("resource")
		Scanner theScanner = new Scanner(System.in);
		
		String N = theScanner.nextLine();
		nameR.theName(N);
		
		
	
		System.out.println();
		System.out.println("--------------------------------");
		
		System.out.println("STARTING GAME...");
		System.out.println("--------------------------------");
		
		System.out.println();
		System.out.println("Oh No, " + N + "!" + " You have landed in in the middle of an infinite grey swamp.");
		System.out.println("Luckily you have your magic compass  which tells you what direction you are facing "
				+ "and the distance to the treasure.");
		
		System.out.println();
		System.out.println("Each time you select a direction you will take 30 steps and the compass will then "
				+ "give you some advise to get to treasure.");
		
		System.out.println();
		System.out.println("Please enter the number of the direction you would like to go (North = 1, East = 2, South = 3 or West = 4):");
		System.out.println();
		// Options changed to numbers as I didn't get to the stage of implementing case
		
		
		
		Compass compassR = new Compass();
		
		
		int E = theScanner.nextInt();
		compassR.showDirection(E);
		

		
		Advice helpR = new Advice();
		
		System.out.println("Would you like some help? (1 = Yes 2 = No):");
		int P = theScanner.nextInt();
		String ref = helpR.Ones(P);
		
		System.out.println(ref);
		
		System.out.println();
		
		Treasure Ref = new Treasure();
		Ref.explainDistance(0.00); /* I have entered in 0.00 just to give an example of the winning message. "Treasure and Compass class shows 
		the formulas*/
		
		/* (The Treasure class was meant to work out the players location. But I did not get to the stage of implementing the Compass class in 
	    Treasure class correctly. */
		
		

	}

}
