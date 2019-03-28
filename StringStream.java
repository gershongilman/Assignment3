package Stream;
/**
 * @author Gershon Gilman
 * Produces a continous sequence of strings that consist of lower case letters in lexicographical order.
 * I made it get rid of all numbers and punctuation to simplify outputs and finally lower case all inputs
 */
public class StringStream extends Stream {
	
	//stores the boolean of if this is the first time the next() is called
	private boolean firstVal = false;
	
	//stores the output string
	private String output;
	
	//we take a string as input and format it
	public StringStream(String output) {
		this.output = output.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
	}
	
	/**
	 * produce and return the next lexicographically correct string
	 * @return string of lower case letters that are next in the order
	 */
	public String next() {
		if(firstVal) {
			firstVal = true;
			return getOutput();
		}

		// Build next lexicographic string and we use the getters to return, we use a finder method to accomplish this task.
		StringBuilder build = new StringBuilder(output);
		setOutput((outputter(build, build.length()-1)).toString());
		return getOutput();
	}
	
	/**
	 * helper function that creates next string after 'build' in lexicographical order
	 * @param build string builder type that we create the 
	 * @param index the length of the string that is inputed 
	 * @return a string builder that will be converted to string and returned to user
	 */
	public StringBuilder outputter(StringBuilder build, int index) {
		//if we have either an empty string or that we have gone through and we had all zzz we use this to add an 'a'
		//we use insert() because we want to be able to put the 'a' at the beginning 
		if(index < 0) {
			build.insert(0,'a');
		}
		else {
			//if we have a 'z' then we want to replace it with an 'a'
			if(build.charAt(index) == 'z') {
				build.replace(index,index + 1,"a");
		
				//we use recursion to replace the zzz till we reach a non z or if we reach end of 
				//string we will insert in a as seen above
				outputter(build, index - 1);
			}
			
			//otherwise we increase the letter
			else {
				build.replace(index, index + 1, "" + (char)(build.charAt(index)+1));
			}
		}
		return build;
	}
	
	/**
	 * @return the output that is set
	 */
	public String getOutput() {
				return output;
		}
	
	/**
	 * setter for the output
	 * @param output string that will be returned
	 */
	public void setOutput(String output) {
		this.output = output;
	}
}

