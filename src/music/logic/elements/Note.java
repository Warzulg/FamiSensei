package music.logic.elements;

public class Note {
	 
	/**
	 * all available note symbols. note pitch = symbol index - 1
	 */
	private final char[] PITCH_SYMBOLS = {'C','D','E','F','G','A','H'};
	
	/**
	 * numerical representation of note and octave (pitch + octave * 7)
	 */
	private int pitchValue;
	
	private boolean halftone;
	
	/**
	 * CONSTRUCTOR
	 */
	public Note(int pitchValue) {
		
		this.pitchValue = pitchValue;
		
	}
	
	private int getPitchValue() {
		return pitchValue;
	}
	
	private int getPitch() {
		return pitchValue % 7;
	}
	
	private char getPitchSymbol() {
		return PITCH_SYMBOLS[getPitch() - 1];
	}
	
	private int getOctave() {
		return pitchValue / 7;
	}
	
	private void setPitchValue(int value) {
		pitchValue = value;
	}
	
	private void raiseNote(int n) {
		pitchValue += n;
		fixPitchValue();
	}
	
	private void raiseNote(int n, boolean halftone) {
		if(halftone) {
			raiseNote(n + 1);
			setHalftone(false);
		} else {
			raiseNote(n);
		}
	}
	
	private void raiseOctave(int n) {
		pitchValue += n * 7;
		fixPitchValue();
	}

	private void fixPitchValue() {
		if(pitchValue < 0) {
			pitchValue = (pitchValue % 7) * -1;
		} else if(pitchValue > 49) {
			raiseOctave( -((pitchValue % 49) / 7) );
		}
	}
	
	@Override
	public String toString() {
		if (halftone) {
			return getPitchSymbol() + "#" + getOctave();
		} else {
			return getPitchSymbol() + "-" + getOctave();
		}
	}
	
	 public int compareTo(Object note2) {
		 if(note2 == null || !(note2 instanceof Note))
		 {
			 return -1;
		 }
		 
		 if(this.pitchValue < ((Note) note2).pitchValue)
		 {
			 return -1;
		 }
		 else if (this.pitchValue == ((Note) note2).pitchValue)
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }
	
	 }
	 
	 public boolean isHalftone() {
		 return halftone;
	 }
	 
	 private void setHalftone(boolean halftone) {
		 this.halftone = halftone;
	 }
	 
}
