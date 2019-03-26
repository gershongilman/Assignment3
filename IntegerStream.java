/**
 * @author Gershon Gilman
 *This class produces a stream of continous consecutive integers 
 */
public class IntegerStream extends Stream {
	private int currentVal;							//stores the value we are on in the stream
	
	/**
	 * Constructor which only require one integer that is where we start
	 * @param input integer that is the first value
	 */
	public IntegerStream(int input){
		currentVal = input;
	}
	
	/**
	 * @return the next value in the stream
	 */
	public int next() {
		return currentVal++;
	}
	
	/**
	 * Getter to retrieve the current value
	 * @return the current value
	 */
	public int getValue() {
		return currentVal;
	}
	
	/**
	 * Setter to set the current value
	 * @param value the value which the user assigns the current value
	 */
	public void setValue(int value) {
		currentVal = value;
	}
	public static void main(String args[]) {
		IntegerStream test = new IntegerStream(1);
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
	}
}