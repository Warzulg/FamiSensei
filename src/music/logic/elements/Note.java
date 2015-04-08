package music.logic.elements;

import java.lang.instrument.IllegalClassFormatException;
import java.util.HashMap;

public class Note implements Comparable {

	public static final HashMap<Character, Integer> noteSymbolToNoteValue;
	static {
		noteSymbolToNoteValue = new HashMap<Character, Integer>();
		noteSymbolToNoteValue.put('C', 1);
		noteSymbolToNoteValue.put('D', 2);
		noteSymbolToNoteValue.put('E', 3);
		noteSymbolToNoteValue.put('F', 4);
		noteSymbolToNoteValue.put('G', 5);
		noteSymbolToNoteValue.put('A', 6);
		noteSymbolToNoteValue.put('H', 7);
	}
	
	
	public static final HashMap<Integer, Character> valueToNoteSymbol;
	static {
		valueToNoteSymbol = new HashMap<Integer, Character>();
		valueToNoteSymbol.put(0, 'H');
		valueToNoteSymbol.put(1, 'C');
		valueToNoteSymbol.put(2, 'D');
		valueToNoteSymbol.put(3, 'E');
		valueToNoteSymbol.put(4, 'F');
		valueToNoteSymbol.put(5, 'G');
		valueToNoteSymbol.put(6, 'A');
		valueToNoteSymbol.put(7, 'H');
	}
	
	

	/**
	 * A numeric value including information about the note and its octave
	 */
	private int pitchValue;

	/**
	 * true, if the note is a halftone
	 */
	boolean halftone;

	public int getPitchValue() {
		return pitchValue;
	}

	public void setPitchValue(char note, int octave) {
		this.pitchValue = note * Note.noteSymbolToNoteValue.get(note);
	}
	
	public int getOctave()
	{
		return this.pitchValue / 7;
	}
	
	public char getPitch()
	{
		return Note.valueToNoteSymbol.get(this.pitchValue);
	}

	@Override
	public String toString() {
		if (this.halftone) {
			return this.getPitch() + " # " + this.getOctave();
		} else {
			return this.getPitch() + " - " + this.getOctave();
		}
	}

	 @Override
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

}
