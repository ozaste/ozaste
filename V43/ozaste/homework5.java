package ozaste;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class homework5 {

	public static void main(String[] args) {
		
		FahrenheitToCelsius();
		}

	public static void FahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		
		double f = input.nextDouble();
		double c = (f - 32) * 5/9;
		System.out.println(c + " grader celsius");
}
} 