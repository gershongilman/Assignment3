package Stream;
import filters.MersenneFilter;


public class MersennePrimeStream extends PrimeStream {
	private MersenneFilter filter;
	public MersennePrimeStream() {
		filter = new MersenneFilter();
	}
	
	@Override
	public int next() {
			int out;
			while(filter != null && !filter.passFilter(getValue())) {
				super.next();
			}
			out = getValue();
			super.next();
			return out;
	}

	public static void main(String args[]) {
		MersennePrimeStream test = new 	MersennePrimeStream();
		for(int i = 0; i < 6; i++) {
			System.out.println(test.next());
		}
	}
}
