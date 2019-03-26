	/**
	 * @author Gershon Gilman
	 *This class returns a stream in numeric order, integers that are not a multiples of a number set by the user that are greater than a certain initial value
	 */
	public class NotMultipleStream extends IntegerStream{
		//stores the a NotMultipleFilter
		private NotMultipleFilter filter;
		//private int current;
		
		/**
		 * The constructor for NotMultipleStream
		 * @param base integer that is the "multiple". We do not want any values returned that are a multiple of base 
		 * @param initialValue the value from we start finding multiples 
		 */
		public NotMultipleStream(int base, int initialValue) {
			super(initialValue);
			filter = new NotMultipleFilter(base, null);
		}
		

		@Override
		/**
		 * To return the next integer that is not a multiple of base using NotMultipleFilter
		 */
		public int next() {
			int nextValue = getValue();
			while(!filter.passFilter(nextValue)) {
				nextValue += 1;
			}
			setValue(nextValue + 1);
			return nextValue;
		}
		public static void main(String args[]) {
			NotMultipleStream test = new NotMultipleStream(4,3);
			System.out.println(test.next());
			System.out.println(test.next());
			System.out.println(test.next());
			System.out.println(test.next());
			System.out.println(test.next());
		}
}
