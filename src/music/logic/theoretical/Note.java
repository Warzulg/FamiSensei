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
		pitch = n;
	}
	
	public boolean isSharp() {
		return pitch % 2 == 1;
	}
	
	public void step(int n) {
		pitch += n;
	}
	
	
}
