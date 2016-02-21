package cse360assign3;

/** 
 * Class to perform basic arithmetic operations on integers.
 * 
 * @author Terry Wen PIN 903 CSE360
 *
 */

public class Calculator {

	private int total;
	
	/**
	 * Initializes calculator object, with total starting at zero
	 * 
	 * @param none
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - Returns the current value in the calculator
	 * 
	 * @return current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - Adds a value to the total
	 * 
	 * @param value number to be added
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract - Subtracts a value from the total
	 * 
	 * @param value number to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply - Multiplies total by input
	 * 
	 * @param value number to be multiplied
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide - Divides total by input
	 * 
	 * @param value number to be divided by
	 */
	public void divide (int value) {
		if(value != 0)
			total /= value;
		else
			total = 0;
	}
	
	/**
	 * getHistory - returns string of operations performed
	 * 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}