package filters;

public class MersenneFilter {
	
	public MersenneFilter() {
	}
	
	public boolean passFilter(Object prime) {
		int in = (int) prime;
		if((int)(Math.ceil((Math.log(in + 1) / Math.log(2)))) ==  (int)(Math.floor(((Math.log(in + 1) / Math.log(2)))))) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		MersenneFilter test = new MersenneFilter();
		for(int i = 2; i < 10; i++) {
			System.out.println(i+".");
			System.out.println(test.passFilter(i));
		
		}
	}
}
