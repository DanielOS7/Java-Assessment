
public class Compass {

	public void showDirection(int E) {
		
		float A = 30.00f ;
		float B = 60.00f; 
	
		
		if (E == 1)  {
			
			 A = A + 30.00f;
			 System.out.println("Not the right way! Where to next!");
			 System.out.println();
			;
		}
		
		if (E == 2) {
			B = B + 30.00f; 
			System.out.println("Not the right way! Where to next!");
			System.out.println();
		}
		
		if (E == 3) {
			A = A - 30.00f; 
			System.out.println("You going the right way! Where to next!");
			 System.out.println();
		}
		
		if (E == 4) {
			B = B + - 30.00f; 
			System.out.println("You going the right way! Where to next!");
			System.out.println();
		}
		
		
		
		
		
		
		float Y = ((A*A) + (B*B)) ; 
				
				double C =  Math.sqrt(Y);
					
				
					
				 double Z = (C);
				 
				 
				 System.out.println(Z + "(Printed to show formula is working, would not be displayed in actual game)");
				 System.out.println();
				 //(I printed out Z just to see if my formula gave the right value)
				 System.out.println();
	}
	
	
}
