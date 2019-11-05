package ozaste;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		
		
		System.out.println(kelvin());

	}
	public static double kelvin() {
		
		Scanner input = new Scanner(System.in);
	double c = input.nextDouble();
	double k = c -= 273.15;
	
	return k;
	
}
}
