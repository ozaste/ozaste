

import java.util.Scanner; // beh�vs om man vill ha input

public class l�xa1 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // beh�vs om man vill ha input
		
		
		System.out.println("Skriv ett namn: "); // skriver ut ett meddelande
		
		String namn1 = input.nextLine(); // l�ser in ett namn fr�n konsolen

		System.out.println("Hur gammal �r du?: ");
		
		String namn2 = input.nextLine();
		
		System.out.println("Vad �r din adress?: "); 
		
		String namn3 = input.nextLine(); 
		
		System.out.println("Vad �r ditt postnummer?: "); 
		
		String namn4 = input.nextLine(); 
		
		System.out.println("Vilken stad bor du i?: "); 
		
		String namn5 = input.nextLine(); 
		
		System.out.println("Vad �r ditt telefonnummer?: "); 
		
		String namn6 = input.nextLine(); 
		
		System.out.println("\nINFORMATION:");
		
		System.out.println("\nNAMN:" + "\t" + namn1 + "\n" + "\n�LDER:" + "\t" +  namn2 + "\n" + "\nAdress:" + "\t\t" + 
		namn3 + "\t" + namn4 + "\t" + namn5 + "\nTelefon:" + "\t" + namn6);
		
		
	
		
		
		
	}
}
