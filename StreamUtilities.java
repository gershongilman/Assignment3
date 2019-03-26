package util;

import filters.Filter;
import Stream.IntegerStream;
import Stream.Stream;
import Stream.StringStream;

/**
 * @author Gershon Gilman
 *This class will deal with streams and manipulate them to a selected form of sum, product, or just concatenated at a certain point.
 */
public class StreamUtilities {
	
	/**
	 * This method will take in a stream and print the first n values of it
	 * @param input, a stream
	 * @param x, an integer
	 */
	public static void print(Stream input, int x) {
		for(int i = 0; i < x; i++) {
			System.out.println(input.toString());
		}
	}
	
	/**
	 * This method will take a stream of integers and add up and return the sum of the n number of integers in a stream.
	 * @param input, Stream of integers
	 * @param x, the n straight values
	 * @return
	 */
	public int sum(IntegerStream input, int x) {
		int sum = 0;
		for(int i = 0; i < x; i++) {
			sum += input.next();
		}
		return sum;
	}
	
	/**
	 * This method will take a stream of integers and return the product of the first n integers represented by x.
	 * @param input, stream of integers
	 * @param x
	 * @return
	 */
	public int product(IntegerStream input, int x) {
		int product = 0;
		for(int i = 0; i < x; i++) {
				product *= input.next();
			
		}
		return product;
	}
	
	/**
	 * This method will take a stream of values and concatenate it to contain n characters.
	 * @param input, the stream that will be inputed
	 * @param x, the point to cut the stream at
	 * @return
	 */
	public String concatenate(StringStream input, int x) {
		StringBuilder output = new StringBuilder();
		
		for(int i =0; i < x; i++) {
			output.append(input.next());
		}
		return output.toString();
	}
	
	
    public static int calculateNextPrimeNumber(int currentNumber, Filter filter) {
		
		
		return 2;
	}
}