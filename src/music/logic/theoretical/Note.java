package music.logic.theoretical;

public class Note {

	/**
	 * pitch value. a full step adds 2 to this value, a half step adds 1.
	 */
	private int pitch;
	/**
	 * indicates which accidental precedes the note.
	 * only applies, if hasAccidental() returns "true".
	 * true = sharp; false = flat;
	 */
	private boolean accidentalType;
	
	/**
	 * CONSTRUCTORS
	 */
	public Note() {
		
		pitch = 0;
		
	}
	
	// GETTERS
	public int getPitch() {
		return pitch;
	}
	public boolean getAccidentalType() {
		return accidentalType;
	}
	
	// SETTERS
	public void setPitch(int n) {
		pitch = Math.abs(n);
	}
	/**
	 * @return true when setting succeeded, false when it failed (= note didn't have an accidental)
	 */
	public boolean setAccidentalType(boolean type) {
		if(hasAccidental()) {
			accidentalType = type;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @return true if the note is sharp or flat, false if it's not.
	 */
	public boolean hasAccidental() {
		return pitch % 2 == 1;
	}
	
	/**
	 * adds or subtracts steps from the pitch of a note.
	 * 1 step = half step; 2 steps = full step; 12 steps = full octave
	 * @param n number of steps to go up (positive value) or down (negative value).
	 */
	public void step(int n) {
		pitch += n;
		pitch = Math.abs(pitch);
		//if a half step has been done, add a sharp or flat to the note, depending on if we have
		//gone a half step up or down:
		if(!hasAccidental()) {
			setAccidentalType(n > 0);
		}
			
	}
	
	public String toString() {
		
		return String.format("(02%d)", pitch);
		
	}
	
	
}
