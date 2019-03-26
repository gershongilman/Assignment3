package filters;

/**
 * @author Gershon Gilman
 *This class implements filter and filters out if an integer is not a multiple of a given value.
 */
public class NotMultipleFilter extends Filter {
	//stores the base value that is provided by user
	private int base;		
	
	
	
	/**
	 * Take a base value and an upstream filter
	 * @param base value that represents the integer that we want to check with if a number is a multilple of it
	 * @param upstreamFilter refers to a filter that may be checked before this one
	 */
	public NotMultipleFilter(int base, Filter upstreamFilter) {
		this.base = base;
		this.setUpstreamFilter(upstreamFilter);
		
	}
	
	/**
	 * Method decides is an object is not a multiple of base.
	 * @param value object that we filter
	 * @return true if value is integer and not a multiple of base and that the other filter is passed(returned true)
	 */
	public boolean passFilter(Object value) {
		if (value == null) return false;
		if(value instanceof Integer && value != null &&(getUpstreamFilter() == null || getUpstreamFilter().passFilter(value))) {
			if((int)value % base != 0) {
				return true;
			}
		}
		return false;
	}
}
