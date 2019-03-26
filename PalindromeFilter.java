/**
 * @author Gershon Gilman
 *A filter that determines if we have a palindrome as input
 */
public class PalindromeFilter extends Filter<String> {
	//stores the Filter we are going to refer to from another class
	private Filter<String> upstreamFilter;
	
	/**
	 * takes filter and assigns a value to the filter
	 * @param upstreamFilter the other filter which will be checked before this one
	 */
	public PalindromeFilter(Filter<String> upstreamFilter) {
		this.upstreamFilter = upstreamFilter;
	}
	
	/**
	 * To determine if an object is a string and therefore a palindrome
	 * @param in input object that we filter
	 * @return true if the object is a palindrome and that it passed the other filter correctly(returned true)
	 */
	public boolean passFilter(String in) {
		if(in == null) {
			return false;
		}
		
		if(upstreamFilter == null || upstreamFilter.passFilter(in)){
			String input = in.toString();
			return input.equals(new StringBuilder(input).reverse().toString());	
		}
		return false;
		
	}
//	public static void main(String args[]) {
//		PalindromeFilter test = new PalindromeFilter(null);
//		System.out.println(test.passFilter("1111"));
//	}
}