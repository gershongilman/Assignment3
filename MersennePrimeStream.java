package Stream;
import filters.MersenneFilter;

/**
 * @author Gershon Gilman
 * Class that produces a stream of Mersenne Primes, which due to data limitations will only result in 6 values being returned at reasonable rate.
 */
public class MersennePrimeStream extends PrimeStream {
	
	//stores the filter we use to test the power of two factor
	private MersenneFilter filter;
	
	//we take no input because we already know that 3 will be the first output, but we do initiate the filter.
	public MersennePrimeStream() {
		filter = new MersenneFilter();
	}
	
	@Override
	/**
	 * Using the specific filter created we check and see if we have a Mersenne prime 2^x -1 
	 * @return the next Mersenne Prime
	 */
	public int next() {
			int out;																//for recursion purposes we use a local variable to store the current output
			
			//using the prime stream we are able to just check if the prime is the specified type
			while(filter != null && !filter.passFilter(getValue())) {
				super.next();
			}
			out = getValue();
			super.next();
			return out;
	}
}
