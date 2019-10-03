package modulus;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int m = input.nextInt();
		
		m -= 45;
				
		if(m < 0) {
		h -= 1;
		m += 60;
	}
		if(h < 0) {
		h = 23;
		
		
}
		System.out.println(h + " " + m);
}
}