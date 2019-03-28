package filters;

/**
 * @author Gershon Gilman
 *A filter that determines if we have a palindrome as input
 */
public class PalindromeFilter extends Filter {
	/**
	 * takes filter and assigns a value to the filter
	 * @param upstreamFilter the other filter which will be checked before this one
	 */
	public PalindromeFilter(Filter upstreamFilter) {
		setUpstreamFilter( upstreamFilter);
	}
	
	/**
	 * To determine if an object is a string and therefore a palindrome
	 * @param input object that we filter
	 * @return true if the object is a palindrome and that it passed the other filter correctly(returned true)
	 */
	public boolean passFilter(Object value) {
		if(value == null) {
			return false;
		}
		
		if(getUpstreamFilter() == null || (getUpstreamFilter() != null && getUpstreamFilter().passFilter(value))){
			String input = value.toString(); 	 //type casting again from object to string
			
			//this is a quick way of checking if an input is a palindrome another way would 
			//be to create a for loop and check if the front and end are equal and keep going till length() -1/ 2
			return input.equals(new StringBuilder(input).reverse().toString());	
		}
		return false;
		
	}
}