package ozaste;

public class homework {

	public static void main(String[] args) {
		System.out.println(FahrenheitToCelsius(100));
		System.out.println(KelvinToCelsius(0));
		System.out.println(velocityConversion(90));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(delta(1,5,9));
		System.out.println(smallLetters("PaParaZZi"));
		System.out.println(pr0grammering("Jag Vill BLI Godk�nd i proGrammERIng! <3"));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(velocityToHeight(9.82));
		System.out.println(sphereVolumeToRadius(20));
		System.out.println(areaOfCirkle(5));
		System.out.println(circumferenceOfCirkle(11));
		
		}
	/**
	 * G�r om Farhenheit till Celsius.
	 * @param grader
	 * @return
	 */
	public static double FahrenheitToCelsius (double grader) {
		double kelvin = ((grader + 459.67)*5/9);
		return kelvin;
	}
	
	/**
	 * G�r om Kelvin till Celsius.
	 * @param kelvin
	 * @return
	 */
	public static double KelvinToCelsius(double kelvin) {
		double Celsius = (kelvin - 273.15);
		return Celsius;
	}
	
	/**
	 * G�r om fr�n km/h till Km/s. 
	 * @param velocityKmH
	 * @return
	 */
	public static double velocityConversion(double velocityKmH) {
		double velocity = (velocityKmH / 3.6);
		return velocity;
	}
	
	/**
	 * R�knar ut kinetisk energi. 
	 * @param mass
	 * @param velocity
	 * @return
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double energy = (mass * (velocity * velocity) / 2);
		return energy;
	}
	
	/**
	 * R�knar ut potentionel energi. 
	 * @param mass
	 * @param height
	 * @return
	 */
	public static double potentialEnergy(double mass, double height) {
		double potential = (mass * 9.82 * height);
		return potential;
	}
	
	/**
	 * R�knar ut medelv�rde av tre givna v�rden. 
	 * @param first
	 * @param second
	 * @param last
	 * @return
	 */
	public static double delta(double first, double second, double last) {
		double something = ((first + second + last) / 3);
		return something;
	}
	
	/**
	 * Byter ut stora bokst�ver till sm�. 
	 * @param word
	 * @return
	 */
	public static String smallLetters(String word) {
		String smallLetters = word.toLowerCase();
		return smallLetters;
	}
	
	/**
	 * Byter ut alla stora bokst�ver till sm� och byter ut "o" till 0. 
	 * @param word
	 * @return
	 */
	public static String pr0grammering(String word) {
		String programmering = word.toLowerCase().replace( "o" , "0" );
		return programmering;
	}
	
	/**
	 * R�knar ut tid med hj�lp av str�cka och hastighet. 
	 * @param distance
	 * @param velocity
	 * @return
	 */
	public static double svtTime(double distance, double velocity) {
		double svt = (distance / velocity);
		return svt;
	}
	
	/**
	 * R�knar ut arbete med hj�lp av kraft och str�cka. 
	 * @param force
	 * @param distance
	 * @return
	 */
	public static double work(double force, double distance) {
		double work= (force * distance);
		return work;
	}
	
	/**
	 * R�knar ut hur h�gt ett f�rem�l kommer med en viss hastighet. 
	 * @param velocity
	 * @return
	 */
	public static double velocityToHeight(double velocity) {
		double height = (velocity / 2);
		return height;
	}
	
	/**
	 * R�knar ut radien hos en sf�r som har en viss volym.
	 * @param Volume
	 * @return
	 */
	public static double sphereVolumeToRadius(double Volume) {
		double sphereVolumeToRadius = Math.cbrt((Volume * 3) / (4 * 3.14));
		return sphereVolumeToRadius;
	}
	
	/**
	 * R�knar ut arean av en cirkel med given radie. 
	 * @param radius
	 * @return
	 */
	public static double areaOfCirkle(double radius) {
		double areaOfCirkle = (radius * radius * 3.14);
		return areaOfCirkle;
	}
	
	/**
	 * R�knar ut omkretsen av en cirkel med given diameter. 
	 * @param diameter
	 * @return
	 */
	public static double circumferenceOfCirkle(double diameter) {
		double circumferenceOfCirkle = (diameter * 3.14);
		return circumferenceOfCirkle;
	}
	
	
}



