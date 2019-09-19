package veet;

import java.util.Scanner;

public class veet {

	public static void main(String[] args) {

		// villkor

		boolean again = true;
		int svar = 1;
		int age = 0;// initierat variabel

		Scanner input = new Scanner(System.in);// gör det möjligt att få input från

		if (again) {
			System.out.println("Hur gammal är du?");
			age = input.nextInt();

			if (age >= 18) {

				System.out.println("Du är gammal nog, grattis!");
				System.out.println("bara så du vet så får du åka moppe");

			}

			else if (age > 14 && age < 18) {

				System.out.println("Du är för ung för bil men du kan köra moppe");
			}

			else { // om villkoret inte uppfylls körs else

				System.out.println("Du är för ung, tyvär!");
			}

			System.out.println("Vill du fråga om ålder igen? Skriv (1) om ja, (2) om nej.");

			if (svar == input.nextInt()) {
				again = false;
			}

		}
	}

}
