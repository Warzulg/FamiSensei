package music.logic.elements;

public class Sequence {

	/**
	 * Numerical value to identify the sequence.
	 * Every value identifies exactly one sequence of one attribute.
	 */
	private int number;
	/**
	 * The attribute held by the sequence. Our standard chipset has 5.
	 * This will affect the range of the numerical values stored in "values".
	 */
	private InstrumentAttribute attribute;
	/**
	 * Values an attribute will take over time, as instrument is played.
	 * One entry equals ~ 16ms play time.
	 */
	private int[] values;
	/**
	 * Starting and releasing point of a loop within the sequence values.
	 * If no loop intended, leave both variables negative.
	 */
	private int loopStart = -1;
	private int loopRelease = -1;
	/**
	 * Maximum and Minimum values of a sequence value.
	 */
	private int min;
	private int max;
	
	/**
	 * CONSTRUCTOR
	 * @param attribute: Instrument attribute this sequence is describing.
	 * @param number: Sequence number/identifier (unique to specified attribute).
	 * @param values: Array of values in sequence aka behavior of attribute.
	 */
	public Sequence(InstrumentAttribute attribute, int number, int... values) {
		
		this.number = number;
		this.attribute = attribute;
		
		//set min and max depending on sequence type
		min = attribute.getMin();
		max = attribute.getMax();
		
		//check if "values" has appropriate format before assigning
		for(int i = 0; i < values.length; i++) {
			if(values[i] < min || values[i] > max) {
				//throw exception
				break;
			}
			this.values = values;
		}
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public InstrumentAttribute getAttribute() {
		return attribute;
	}
	
	public int[] getValues() {
		return values;
	}
	
	public int getValue(int index) {
		return values[index];
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	/**
	 * Returns the values Array in a useable manner.
	 * @return all values elements separated with a whitespace, starting with a whitespace.
	 */
	public String valuesToString() {
		String output = "";
		for(int i = 0; i < values.length; i++) {
			output += " " + values[i];
		}
		return output;
		//once/if loops within sequences are implemented this method will need to be
		//updated to insert "|" at a loop starting point and "/" at a loop breaking point.
	}
	
	/**
	 * another ugly temporary toString method
	 */
	@Override
	public String toString() {
		return String.format("MACRO   %d  %d  -1  -1  0 :%s", 
				attribute.getIndex(), number, valuesToString());
	}
	
}
