package util;

/**
 * @author Gershon Gilman
 * A class that represents integers in a specified pairs format
 */
public class IntegerPair {
	//stores the value of the first integer
	private int value1;
	
	//stores the value of the second integer
	private int value2;
	
	//setting the two integer values by the specified integers the user gave
	public IntegerPair(int Value1, int Value2) {
		this.value1 = Value1;
		this.value2 = Value2;
	}
	
	/**
	 * @return value of the first integer
	 */
	public int getValue1() {
		return value1;
	}
	
	/**
	 * Setting the value of the first integer
	 * @param value1 an integer that is user set
	 */
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	/**
	 * @return value of the second integer
	 */
	public int getValue2() {
		return value2;
	}
	
	/**
	 * Setting the value of the second integer
	 * @param value2 an integer that is user set
	 */
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	@Override
	/**
	 * Overrides toString method to a specific format of two integers
	 * @return string with format (value1,value2)
	 */
	public String toString() {
		return "(" + value1 + "," + value2 + ")";
	}
}

