package ozaste;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		System.out.println("Det minsta talet �r " + min());

	}

	public static int min() {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in tv� heltal");
		
		
		int e = input.nextInt();
		int n = input.nextInt();
		input.close();
	
		if(e < n) {
			return e;
		}
		else {
			return n;
		}
			
	}
	
	
	
}
