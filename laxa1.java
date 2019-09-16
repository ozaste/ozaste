

import java.util.Scanner; // behövs om man vill ha input

public class läxa1 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // behövs om man vill ha input
		
		
		System.out.println("Skriv ett namn: "); // skriver ut ett meddelande
		
		String namn1 = input.nextLine(); // läser in ett namn från konsolen

		System.out.println("Hur gammal är du?: ");
		
		String namn2 = input.nextLine();
		
		System.out.println("Vad är din adress?: "); 
		
		String namn3 = input.nextLine(); 
		
		System.out.println("Vad är ditt postnummer?: "); 
		
		String namn4 = input.nextLine(); 
		
		System.out.println("Vilken stad bor du i?: "); 
		
		String namn5 = input.nextLine(); 
		
		System.out.println("Vad är ditt telefonnummer?: "); 
		
		String namn6 = input.nextLine(); 
		
		System.out.println("\nINFORMATION:");
		
		System.out.println("\nNAMN:" + "\t" + namn1 + "\n" + "\nÅLDER:" + "\t" +  namn2 + "\n" + "\nAdress:" + "\t\t" + 
		namn3 + "\t" + namn4 + "\t" + namn5 + "\nTelefon:" + "\t" + namn6);
		
		
	
		
		
		
	}
}
