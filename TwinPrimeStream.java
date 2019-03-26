package Stream;
import util.IntegerPair;
import util.StreamUtilities;

public class TwinPrimeStream extends Stream {
	private IntegerPair currentPair;
	
	public TwinPrimeStream() {
		setCurrentPair(new IntegerPair(3, 5));
	}

	public IntegerPair getCurrentPair() {
		return currentPair;
	}

	public void setCurrentPair(IntegerPair pair) {
		this.currentPair = pair;
	}
	
	/**
	 * @return the next value in the stream
	 */
	public IntegerPair next() {
		int value1 = StreamUtilities.calculateNextPrimeNumber( currentPair.getValue1() , getFilter());
		int value2 = StreamUtilities.calculateNextPrimeNumber( value1 , getFilter());
		while (value2 - value1 != 2) {
			 value1 = StreamUtilities.calculateNextPrimeNumber(value2 , getFilter());
			 value2 = StreamUtilities.calculateNextPrimeNumber( value1 , getFilter());
		
		}
		currentPair = new IntegerPair(value1, value2);
		
		return currentPair;
	}

	@Override
	public String toString() {
		
		return currentPair.toString();
	}
	public static void main(String args[]) {
		TwinPrimeStream test = new TwinPrimeStream();
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
	}
}
