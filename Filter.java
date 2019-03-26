package filters;

/**
 * @author Gershon Gilman
 * Interface that allows us to use the type Filter so that we can have the two filter classes we have interact
 */
public abstract class Filter {
	
	//stores the Filter we are going to refer to from another class
		private Filter upstreamFilter;
		
	
	/**
	 * @param value the object that is inputed, a filter class
	 * @return true if the filter parameters are passed
	 */
	public abstract boolean passFilter(Object value);


	public Filter getUpstreamFilter() {
		return upstreamFilter;
	}


	public void setUpstreamFilter(Filter upstreamFilter) {
		this.upstreamFilter = upstreamFilter;
	}
}