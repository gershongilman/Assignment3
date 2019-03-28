package filters;

/**
 * @author Gershon Gilman
 * Filter that checks if an input is a power of 2 if you add one to it
 */
public class MersenneFilter {
	
	//Made specifically for the stream so we ignore upstream filters.
	public MersenneFilter() {
	}
	
	/**
	 * checks if a number is a is a power of 2 if you add one to it
	 * @param prime the input parameter
	 * @return boolean, true if it is a power of two if one is added
	 */
	public boolean passFilter(Object prime) {
		int in = (int) prime; 									//type casting the input from object to int and creating the local variable so that we only typecast once
		
		//using bitwise operators we can easily check if we have a Mersenne Prime given a prime
		return ((in & (in +1))) == 0;
	}
}
