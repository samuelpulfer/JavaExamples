/**
 * 
 */
package ch.deluxxe.bfh8051.e05;

/**
 * This Class returns the BloodPressureCathegory due to the systolic and diastolic bloodpressure.
 * @author Samuel Pulfer
 * @version 0.0.1
 */
public class BloodPressureCategory {
	private double systolic = 0;
	private double diastolic = 0;

	public BloodPressureCategory(float systolic, float diastolic){
		this.systolic = systolic;
		this.diastolic = diastolic;
	}
	/**
	 * Sets the Bloodpressure.
	 * @param systolic
	 * @param diastolic
	 */
	public void setBloodPressure(float systolic, float diastolic){
		this.systolic = systolic;
		this.diastolic = diastolic;
	}
	/**
	 * @return Systolic Bloodpressure
	 */
	public double getSystolic(){
		return this.systolic;
	}
	/**
	 * @return Diastolic Bloodpressure
	 */
	public double getDiastolic(){
		return this.diastolic;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
