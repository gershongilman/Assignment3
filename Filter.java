/**
 * @author Gershon Gilman
 * Interface that allows us to use the type Filter so that we can have the two filter classes we have interact
 */
public abstract class Filter<T> {
	/**
	 * @param value the object that is inputed, a filter class
	 * @return true if the filter parameters are passed
	 */
	public abstract boolean passFilter(T value);
}