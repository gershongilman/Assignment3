package Stream;

import filters.Filter;

public abstract class Stream {
	public Filter filter;
	public Filter getFilter() { return filter;}
	public void   setFilter(Filter f) {  filter = f;}
}
