package ozaste;

import java.util.Scanner;

public class homework38 {
	
	public static void main(String[] args) {
		
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		double number4 = 0;
		double number5 = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 5 heltal");
		number1 = input.nextDouble();
		
		number2 = input.nextDouble();
		
		number3 = input.nextDouble();
		
		number4 = input.nextDouble();
		
		number5 = input.nextDouble();
		
			if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5) {
			
				System.out.println("störst:" + number1); }
			
			else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
				
				System.out.println("störst:" + number2);}
				
			else if (number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5) {
					
				System.out.println("störst:" + number3);}
					
			else if (number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5) {
				
				System.out.println("störst:" + number4);}
						
			else if (number5 >= number1 && number5 >= number2 && number5 >= number3 && number5 >= number4) {
				
				System.out.println("störst:" + number5);
			}
				
				if(number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5){
					 
					System.out.println("minst:" + number1);}

				else if(number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5){

					System.out.println("minst:" + number2);}

				else if(number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5){

					System.out.println("minst:" + number3);}

				else if(number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5){

					System.out.println("minst:" + number4);}

				else if(number5 <= number1 && number5 <= number2 && number5 <= number3 && number5 <= number4){

					System.out.println("minst:" + number5);}
				
	double medel = (number1 + number2 + number3 + number4 + number5)/5;
	System.out.println("medel:" + medel);
	
		}
			
}
		


		