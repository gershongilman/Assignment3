package Stream;
import filters.PalindromeFilter;
/**
 * @author Gershon Gilman
 * Given a string we create a stream of palindromes in lexicographical order
 */
public class PalindromeStream extends StringStream {
	
	//stores the palindrome filter that we use to check if an input is a palindrome
	private PalindromeFilter filter;
	
	public PalindromeStream(String input) {
		super(input);																// We use the stringstream to iterate through the string in lexographical order
		filter = new PalindromeFilter(null);										
	}
	
	/**
	 * Iterates through the input string until we pass the filter and return the next Palindrome
	 * @return String, of the next Palindrome in lexicographical order
	 */
	public String next() {
		String out;																	//local variable used to make iteration an easier process
		
		//loop that checks if the string we have is a palindrome and if not we iterate till we do
		while(!filter.passFilter(getOutput())) {
			super.next();
		}
		
		out = getOutput();
		//done for iteration purposes
		super.next();																
		return out;
	}
}

