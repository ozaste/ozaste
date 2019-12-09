package ozaste;

import java.util.Arrays;

public class HomeworkArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(uppgift1(numbers));
		System.out.println(uppgift2(names));
		System.out.println(mostNumbers(numbers) + " " + leastNumbers(numbers));
		System.out.println(uppgift4(names));
		System.out.println(uppgift5(numbers));
		System.out.println(uppgift6(numbers));
		System.out.println(uppgift7(names));
		System.out.println(uppgift8(names));
		

	}
/**
 * antalet sjuor
 * @param numbers
 * @return
 */
	public static int uppgift1(int[] numbers) {

		int antal7 = 0;
		{

			for (int i = 0; i < numbers.length; i++) {

				if (numbers[i] == 7) {
					antal7++;
				}

			}
			return antal7;

		}
	}
/**
 * antal Tom
 * @param names
 * @return
 */
	public static int uppgift2(String[] names) {

		int antalTom = 0;
		{

			for (int i = 0; i < names.length; i++) {

				if (names[i].equals("Tom")) {
					antalTom++;
				}
			}
			return antalTom;
		}

	}
/**
 * största antal tal
 * @param numbers
 * @return
 */
	private static int mostNumbers(int[] numbers) {
		int most = 0;
		int amount = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount > max) {
				most = i;
				max = amount;
			}

		}
		return most;

	}
/**
 * minsta antal tal
 * @param numbers
 * @return
 */
	private static int leastNumbers(int[] numbers) {
		int most = 0;
		int amount;
		int min = 10101;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (min > amount) {
				most = i;
				min = amount;
			}

		}
		return most;
	}
/**
 * vilken index som drusilla finns i
 * @param names
 * @return
 */
	public static int uppgift4(String[] names) {

		int index = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("Drusilla")) {
				index = i;
			}
		}
		return index;
	}
/**
 * summan av alla gämna tal
 * @param numbers
 * @return
 */
	public static int uppgift5(int[] numbers) {

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {

				sum = sum + numbers[i];
			}
		}
		return sum;
	}
/**
 * hur många tal av alla tal
 * @param numbers
 * @return
 */
	public static String uppgift6(int[] numbers) {
		
		int[] amount =  new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				
				if (numbers[j] == i) {
					
					amount[i]++;
				}
			}
		}
		return Arrays.toString(amount);
	}
/**
 * antal namn som börjar på L
 * @param names
 * @return
 */
	public static int uppgift7(String[] names) {
		
		int L = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].charAt(0) == 'L') {
				L++;
			}
		}
		return L;
	}
/**
 * antalet namn som är fem bokstäver långa
 * @param names
 * @return
 */
	public static int uppgift8(String[] names) {
		
		int five = 0;
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 5) {
				five++;
			}
		}
		return five;
		
	}
}
