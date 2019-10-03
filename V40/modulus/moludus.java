package modulus;

public class moludus {

	public static void main(String[] args) {
		
		// % == modulus
		
		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		
		System.out.println(tal1 % 3); // testar ifall "tal1" är delbart med 3.
								      // är den det så blir svaret noll, om inte
		                              // så anges resten.
		
		int sum = 0;
		
		for (int i = 0; i <= 100 ; i++) {
		
			if (i % 3 == 0) {
				System.out.println("talet " + i + " är delbart med 3");
				
				sum =+ + i;
						
		}
					
	}
		System.out.println("the total sum of all integers divisible by 3 is: " + sum);
		
		
		int turn = 0;
		
		while (true) {	// skriver ut vems tur det är tills dess att man gjort det hundra ggr.
			
			turn++;
			
			if (turn % 3 == 0) {
				System.out.println("Davids tur");
			}
			
			else if (turn % 3 == 1) {
				System.out.println("Johans tur");
			}
			
			else if (turn % 3 == 1) {
				System.out.println("Lucas tur");
			}
			
			if (turn == 100) {
				 break;
			}
		
		
		}
	
	
}
	
}
	
	
	