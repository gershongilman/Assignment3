
public class PalindromeStream extends StringStream {
	private PalindromeFilter filter;
	private boolean firstiteration = false;
	
	public PalindromeStream(String input) {
		super(input);
		filter = new PalindromeFilter(null);
	}
	
	public String next() {
		String out;
		if(!firstiteration && filter.passFilter(getOutput())) {
			firstiteration = true;
			out = getOutput();
			super.next();
			return out;
		}
		while(!filter.passFilter(getOutput())) {
			super.next();
		}
		out = getOutput();
		super.next();
		return out;
	}

	
	
		
	
	public static void main(String args[]) {
		PalindromeStream test = new PalindromeStream("zzzz");
		for(int i = 0; i < 10; i++) {
			System.out.println(test.next());
		}

	}
}
