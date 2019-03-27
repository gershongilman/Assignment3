package Stream;
import util.IntegerPair;

public class TwinPrimeStream extends Stream {
	private IntegerPair currentPair;
	private PrimeStream primeStream;
	public TwinPrimeStream() {
		setCurrentPair(new IntegerPair(3, 5));
		primeStream = new PrimeStream();
			
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
	public IntegerPair next(){
		IntegerPair out;

		while(currentPair.getValue1() + 2 != currentPair.getValue2()) {
				currentPair.setValue1(currentPair.getValue2());
				currentPair.setValue2(primeStream.next());
				System.out.println("in line");
			}
			out = getCurrentPair();
			currentPair.setValue1(currentPair.getValue2());
			currentPair.setValue2(primeStream.next());
			return out;
	}
		

	public static void main(String args[]) {
		TwinPrimeStream test = new TwinPrimeStream();
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
	}
}
