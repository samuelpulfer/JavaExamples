/**
 * 
 */
package ch.deluxxe.bfh8051.e05;

/**
 * @author Samuel Pulfer
 *
 */
/**
 * This is the Adipositas class.
 */
public class Adipositas {

	public float bmi = 25;

	/**
	 * This is the Adipositas Constructor.
	 */
	public Adipositas(float bmi) {

		this.bmi = bmi;
		calculate();
	}

	/**
	 * This is the method calculating the BMI.
	 */
	public void calculate() {

		if (bmi < 16.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"starkes Untergewicht\"");
		} else if (bmi < 17.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"mässiges Untergewicht\"");
		} else if (bmi < 18.5) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"leichtes Untergewicht\"");
		} else if (bmi < 25.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"Normalgewicht\"");
		} else if (bmi < 30.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"Präadipositas\"");
		} else if (bmi < 35.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"Adipositas Grad I\"");
		} else if (bmi < 40.00) {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"Adipositas Grad II\"");
		} else {
			System.out.println("BMI: " + bmi + "entspricht der Kathegorie \"Adipositas Grad III\"");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adipositas adi = new Adipositas(100);
	}

}
