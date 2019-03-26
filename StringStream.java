
public class StringStream extends Stream {
	private boolean firstVal = false;
	private String output;
	public StringStream(String output) {
		this.output = output.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
	}
	
	public String next() {
		if(firstVal) {
			firstVal = true;
			return getOutput();
		}
		StringBuilder build = new StringBuilder(output);
		setOutput((outputter(build,build.length()-1)).toString());
		return getOutput();
	}
	
	
	public StringBuilder outputter(StringBuilder build, int i) {
		if(i < 0) {
			build.insert(0,'a');
		}
		else {
			if(build.charAt(i) == 'z') {
				build.replace(i,i+1,"a");
				outputter(build, i - 1);
			}
			else {
				build.replace(i,i+1, "" + (char)(build.charAt(i)+1));
			}
			
		}
		return build;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	public static void main(String args[]) {
		StringStream test = new StringStream("zzzz");
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
		System.out.println(test.next());
	}
}

