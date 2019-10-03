package modulus;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int del2 = input.nextInt();
		int del3 = input.nextInt();
		int siffror = input.nextInt();
		
		for(int i = 1; i <= siffror; i++) {
		
			if(i % del2 == 0 && i % del3 == 0) {
				System.out.println("FizzBuzz");
			}
			
			else if(i % del3 == 0) {
				System.out.println("Buzz");
			}
			else if(i % del2 == 0) {
				System.out.println("Fizz");
			}
			else if(i % del3 != 0 && i % del2 != 0) {
				System.out.println(i);
			}
			}
		}
	}
		

