package music.logic.theoretical;

public class TimeSignature {

	
	private int beatsAmount;
	private int beatsType;
	private int noteLength;
	
	/**
	 * CONSTRUCTORS
	 * @param beatsAmount amount of beats in the measure.
	 * duple = 2; triple = 3; quadruple = 4;
	 * @param beatsType amount of notes a beat can be broken into.
	 * simple = 2; compound = 3;
	 * @param noteLength length of the notes in the measure.
	 * full = 1; half = 2; quarter = 4; eighth = 8; sixteenth = 16; 
	 */
	public TimeSignature(int beatsAmount, int beatsType, int noteLength) {
		
		this.beatsAmount = beatsAmount;
		this.beatsType = beatsType;
		
	}
	public TimeSignature() {
		this(0,0,0);
	}
	
	// SETTERS
	public void setBeatsAmount(int n) {
		beatsAmount = n;
	}
	public void setBeatsType(int n) {
		beatsType = n;
	}
	public void setNoteLength(int n) {
		noteLength = n;
	}
	
	// GETTERS
	public int getBeatsAmount() {
		return beatsAmount;
	}
	public int getBeatsType() {
		return beatsType;
	}
	public int getNoteLength() {
		return noteLength;
	}
	
	public int getNoteAmount() {
		return beatsAmount * beatsType;
	}
	
	public String toString() {
		
		return String.format("%d / %d",
							 getNoteAmount(), noteLength);
		
	}
	
	
}
