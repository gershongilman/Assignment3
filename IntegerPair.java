package util;

//import Stream.IntegerStream;
public class IntegerPair {
	private int value1 = 0;
	private int value2 = 0;
	
	public IntegerPair(int Value1, int Value2) {
		this.value1 = Value1;
		this.value2 = Value2;
	}
	
	public int getValue1() {
		return value1;
	}
	
	public void setValue1(int value) {
		value1 = value;
	}
	
	public int getValue2() {
		return value2;
	}
	
	public void setValue2(int value) {
		value2 = value;
	}
	
	@Override
	public String toString() {
		return "(" + value1 + "," + value2 + ")";
	}
	
	public static void main(String args[]) {
		IntegerPair test = new IntegerPair(2,3);
		System.out.println(test.toString());
	}
	
}

