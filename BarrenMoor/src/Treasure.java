
public class Treasure {

	public void explainDistance (double X) {
	
		
// Player wins game if location to points conversion formula shown in Compass equals 0 i.e 0 sqaured + 0 sqaured = 0, making the sqaure root equal 0
// thus winning the game.
				 
		if (X <= 0.00d) {
			System.out.println("------------------");
			System.out.println();
			System.out.println("You have found the Treasure!");
			System.out.println();
			System.out.println("------------------");
			System.out.println();
			System.out.println("Well Done You Won!");
			System.out.println();
			System.out.println("------------------");
			System.out.println("Winning message printed for satisfaction the real treasure was the options: South then West or West then South");
			System.out.println();
			
		}
			
		else {
			System.out.println("Not quite there yet. Try again!");
		}

	}
	
}
