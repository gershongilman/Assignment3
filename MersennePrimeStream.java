
public class MersennePrimeStream extends IntegerStream {
	private MersenneFilter filter;
	private PrimeStream primeStream;
	
	public MersennePrimeStream() {
		super(2);
		primeStream = new PrimeStream();
		filter = new MersenneFilter();
	}
	
	@Override
	public int next() {
		while(!filter.passFilter(getValue())) {
			setValue(primeStream.next());
		}
		return getValue();
	}
}
