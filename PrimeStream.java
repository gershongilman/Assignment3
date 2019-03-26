package Stream;

import filters.NotMultipleFilter;
public class PrimeStream extends IntegerStream{
	private NotMultipleFilter filter;
	public PrimeStream() {
		super(2);
	}
	
	@Override
	public int next() {
	
			while(filter != null && !filter.passFilter(getValue())) {
				super.next();
			}
			filter = new NotMultipleFilter(getValue(),filter);
			return getValue();
	}
	public static void main(String args[]) {
		PrimeStream test = new PrimeStream();
		for(int i = 0; i < 10; i++) {
			System.out.println(test.next());
		}
	}
}
