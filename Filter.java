package filters;

/**
 * @author Gershon Gilman
 * Interface that allows us to use the type Filter so that we can have the two filter classes we have interact and connect them all to the stream base class
 */
public abstract class Filter {
	
	//stores the Filter we are going to refer to from another class
	private Filter upstreamFilter;
		
	
	/**
	 * @param value the object that is inputed, a filter class
	 * @return true if the filter parameters are passed
	 */
	public abstract boolean passFilter(Object value);

	/**
	 * We want to be able retrieve the upstream filter (lessens the amount of coding within filters)
	 * @return Filter that represents the upstream filter
	 */
	public Filter getUpstreamFilter() {
		return upstreamFilter;
	}

	/**
	 * We need to be able to set the upstream filter 
	 * @param upstreamFilter input Filter that we will use in the other filter
	 */
	public void setUpstreamFilter(Filter upstreamFilter) {
		this.upstreamFilter = upstreamFilter;
	}
}