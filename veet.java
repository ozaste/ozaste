package veet;

import java.util.Scanner;

public class veet {

	public static void main(String[] args) {

		// villkor

		boolean again = true;
		int svar = 1;
		int age = 0;// initierat variabel

		Scanner input = new Scanner(System.in);// g�r det m�jligt att f� input fr�n

		if (again) {
			System.out.println("Hur gammal �r du?");
			age = input.nextInt();

			if (age >= 18) {

				System.out.println("Du �r gammal nog, grattis!");
				System.out.println("bara s� du vet s� f�r du �ka moppe");

			}

			else if (age > 14 && age < 18) {

				System.out.println("Du �r f�r ung f�r bil men du kan k�ra moppe");
			}

			else { // om villkoret inte uppfylls k�rs else

				System.out.println("Du �r f�r ung, tyv�r!");
			}

			System.out.println("Vill du fr�ga om �lder igen? Skriv (1) om ja, (2) om nej.");

			if (svar == input.nextInt()) {
				again = false;
			}

		}
	}

}
