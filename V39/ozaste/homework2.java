package ozaste;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number1 > 0 && number2 > 0){
		System.out.println(1);
		}
		else if(number1 < 0 && number2 > 0){
		System.out.println(2);
		}
		else if(number1 < 0 && number2 < 0){
		System.out.println(3);
		}
		else if(number1 > 0 && number2 < 0){
		System.out.println(4);
		}
	}

}
