package Stream;
import filters.NotMultipleFilter;

/**
 * @author Gershon Gilman
 * Stream that iterates through integers and returns all primes, using the Sieve of Eratosthenes technique.
 */
public class PrimeStream extends IntegerStream{
	
	//stores the filter we use to check if a number is a multiple of another
	private NotMultipleFilter filter;
	
	public PrimeStream() {
		super(2); 																			//first prime is two
	}
	
	@Override
	/**
	 * Method that iterates to provide the next prime when called
	 * @return the next prime in the stream
	 */
	public int next() {
			while(filter != null && !filter.passFilter(getValue())) {
				super.next();
			}
			
			//we need to make this iterative so we set setup the new filter using the value we will return
			filter = new NotMultipleFilter(getValue(),filter);	
			return getValue();
	}
}
