package ozaste;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv in hur många steg trappan ska ha");
		int steps;
		steps = input.nextInt();
		stair(steps);
	}
	
	public static void stair(int steps) {
		int step;
		for(int i = 0; i < steps; i++) {
			
			step = steps - i;
			for(int j = 1; j <= steps; j++) {
				if(j<step) {
					System.out.print(" ");
				}
				else {
					System.out.print("X");
				}
				
			}
			System.out.println();
		}
		
	}
}