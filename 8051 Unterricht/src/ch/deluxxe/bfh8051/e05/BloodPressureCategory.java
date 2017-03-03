/**
 * 
 */
package ch.deluxxe.bfh8051.e05;

/**
 * <br>
 * <b>Idee</b> <br>
 * Entwickeln einer Klasse mit einer Methode zur Bestimmung der
 * Blutdruck-Kategorie auf Basis des systolischen und diastolischen Blutdrucks.
 * <br>
 * <b>Notwendiges Wissen</b> <br>
 * Big Java bis Kapitel 5.3 Multiple Alternatives (S. 196) <br>
 * <b>Ausgangslage</b> <br>
 * Mit den nun auch zur Verf�gung stehenden essentiellen Entscheidungsstrukturen
 * sind Programme in der Lage, abh�ngig von Dateninhalten unterschiedliche
 * Aktionen zu ergreifen. <br>
 * <b>Ziele</b> <br>
 * Implementation einer Auswahl auf Basis von mehreren Bedingungen. <br>
 * <b>Aufgabenbeschreibung</b> <br>
 * Entwickeln Sie eine Klasse mit einer Methode, die auf der Basis der
 * nebenstehenden Tabelle gem�ss https://en.wikipedia.org/wiki/Blood_pressure
 * eine Klassifikation vornimmt und die Kategorie als String zur�ckgibt
 * (vergleichen Sie auch die Definitionen z.B. auf der deutschen Ausgabe von
 * wikipedia). Die Methode soll ausf�hrlich getestet und mit Javadoc Kommentar
 * dokumentiert werden. �berlegen Sie sich, welche Kategorien grunds�tzlich
 * ausgegeben werden sollen und auf Basis welcher Konstellation der beiden
 * Blutdruckwerte. <br>
 * 
 * @author Samuel Pulfer
 * @version 0.0.1
 */
public class BloodPressureCategory {
	private double systolic = 0;
	private double diastolic = 0;
	public static double HYPOTENSION[] = { 90.0, 60.0 };
	public static double DESIRED[] = { 119.0, 79.0 };
	public static double PREHYPERTENSION[] = { 139.0, 89.0 };
	public static double STAGEONEHYPERTENSION[] = { 159.0, 99.0 };
	public static double STAGETWOHYPERTENSION[] = { 179.0, 109.0 };
	public static double HYPERTENSIVEURGENCY[] = { 180.0, 110.0 };

	public BloodPressureCategory(float systolic, float diastolic) {
		this.systolic = systolic;
		this.diastolic = diastolic;
	}

	// Setter
	/**
	 * Sets the Bloodpressure.
	 * 
	 * @param systolic
	 *          Systolic Bloodpressure
	 * @param diastolic
	 *          Diastolic Bloodpressure
	 */
	public void setBloodPressure(float systolic, float diastolic) {
		this.systolic = systolic;
		this.diastolic = diastolic;
	}

	// Getter
	/**
	 * @return Systolic Bloodpressure
	 */
	public double getSystolic() {
		return this.systolic;
	}

	/**
	 * @return Diastolic Bloodpressure
	 */
	public double getDiastolic() {
		return this.diastolic;
	}

	// Methods
	/**
	 * @param args
	 *          No Arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getCategory() {
		return "nothing";
	}
}
