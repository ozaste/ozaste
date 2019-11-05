package ozaste;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		
		AgeControl();
				
				
			}
		
public static void AgeControl() {
			
			Scanner input = new Scanner(System.in);
			
			int age = input.nextInt();
			
			if (age >= 0 && age <= 5) {
				System.out.println("neeeeej");
}
			else if(age >= 6 && age <= 12) {
			System.out.println("du får spela fornite");
			}
			else if(age >= 13 && age <= 14) {
				System.out.println("du är tonåring");
				}
			else if(age >= 15 && age <= 17) {
				System.out.println("du får åka moppe");
				}
			else if(age >= 18 && age <= 20) {
				System.out.println("du får köra bil");
				}
			else if(age >= 21 && age <= 64) {
				System.out.println("du får vuxenstarff");
				}
			else if(age >= 65 && age <= 99) {
				System.out.println("du är pansionär");
				}
			else if(age >= 100) {
				System.out.println("RIP?");
				}
}
}
