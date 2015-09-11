package music.logic.theoretical;

public class Note {

	/**
	 * pitch value. a full step adds 2 to this value, a half step adds 1.
	 */
	private int pitch;
	
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
	
	// SETTERS
	public void setPitch(int n) {
		pitch = Math.abs(n);
	}
	
	public boolean isSharp() {
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
	}
	
	public String toString() {
		
		return String.format("(02%d)", pitch);
		
	}
	
	
}
