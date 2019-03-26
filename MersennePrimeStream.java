
public class MersennePrimeStream extends IntegerStream {
	private MersenneFilter filter;
	private PrimeStream stream;
	
	public MersennePrimeStream() {
		super(2);
		stream = new PrimeStream();
		filter = new MersenneFilter();
	}
	
	@Override
	public int next() {
		while(!filter.passFilter(getValue())) {
			setValue(stream.next());
		}
		return getValue();
	}
}
