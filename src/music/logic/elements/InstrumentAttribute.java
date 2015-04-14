package music.logic.elements;

public enum InstrumentAttribute {
	VOLUME(0,0,15), ARPEGGIO(1,-96,96), PITCH(2,-128,127), HIPITCH(3,-128,127), DUTYNOISE(4,0,3);
	private int index;
	private int min;
	private int max;
	
	/**
	 * CONSTRUCTOR
	 * @param index: Index in an Instruments attributes-array where the attribute belongs.
	 * @param min: Minimum value this attribute can have.
	 * @param max: Maximum value this attribute can have.
	 */
	private InstrumentAttribute(int index, int min, int max) {
		this.index = index;
		this.min = min;
		this.max = max;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
}
