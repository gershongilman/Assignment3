package Stream;
import util.IntegerPair;
/**
 * @author Gershon Gilman
 * A stream that return integer pair's that represent two twin primes (primes seperate by 2)
 */
public class TwinPrimeStream extends Stream {
	
	//stores the IntegerPair we are working with
	private IntegerPair currentPair;
	
	//storing the stream of primes
	private PrimeStream primeStream;
	
	//we take no input but we know the first twin primes are (3,5) so I started with (2,3) so that we iterate in the program to return the (3,5) first
	public TwinPrimeStream() {
		currentPair = new IntegerPair(2, 3);
		primeStream = new PrimeStream();
			
	}

	/**
	 * Iterate through primes to find pairs of primes that are two away from each other and returns this
	 * @return a string with an integer pair of primes
	 * I may have misunderstood and we were supposed to return an integer pair type?!
	 */
	public String next(){
		String out; 													//so that we can store the next value in the getters and setters we use this local variable
		
		//we know the main idea is the difference should be two so we iterate the values using prime stream till its true
		while(currentPair.getValue1() + 2 != currentPair.getValue2()) {
			currentPair.setValue1(currentPair.getValue2());
			currentPair.setValue2(primeStream.next());
		}
		out = currentPair.toString();
		currentPair.setValue1(currentPair.getValue2());
		currentPair.setValue2(primeStream.next());
		return out;
	}
}
