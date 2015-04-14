package music.logic.elements;

import java.util.Arrays;

public class Instrument {

	/**
	 * Soundchipset this instrument will work on, only the 2A03 for now.
	 * Relevant for toString method.
	 */
	private final String CHIPSET = "2A03";
	/**
	 * Array of 5 sequence-numbers(=sequence identifiers). If an element is negative, it's considered unused.
	 */
	private int[] attributes;
	/**
	 * The instruments number. Unique to each instrument
	 */
	private int number;
	/**
	 * The instruments name. Can occur more then once
	 */
	private String name;
	
	/**
	 * CONSTRUCTOR
	 */
	public Instrument(int number, String name){
		
		attributes = new int[5];
		Arrays.fill(attributes, -1);	//initialize every attribute without them using any sequence
										//aka without being used.
		this.number = number;
		this.name = name;
		
	}
	
	/**
	 * Assign an attribute a sequence.
	 * @return true if assignment was successful.
	 */
	public boolean assignSequence(InstrumentAttribute attribute, int sequenceNumber) {
		boolean success = true;
		attributes[attribute.getIndex()] = sequenceNumber;
		return success;
	}
	
	public String getChipset() {
		return CHIPSET;
	}
	
	public int[] getAttributes() {
		return attributes;
	}
	
	public int getAttribute(int index) {
		return attributes[index];
	}
	
	public int getAttribute(InstrumentAttribute attribute) {
		return attributes[attribute.getIndex()];
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * very ugly temporary toString method
	 */
	@Override
	public String toString() {
		return String.format("INST%s   %d  %d  %d  %d  %d  %d \"%s\"", 
				CHIPSET, number, attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], name);
	}
	
}
