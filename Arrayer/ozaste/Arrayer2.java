package ozaste;

public class Arrayer2 {

	public static void main(String[] args) {
		
		double[] number = new double[20];
		double[] number2 = {12.5,3,328};
		
		String[] namn = {"Edvin" , "Svante" , "Pedram" , "Max" };
		
		for (int i = 0; i < namn.length; i++) {
			int antalA = 0;
			
			for (int j = 0; j < namn[i].length(); j++) {
			if	(namn[j].contains("a")) {
				antalA++;
			}
			}
			
			
		}
		System.out.println("antal an är" + antalA );
		
	}

}
