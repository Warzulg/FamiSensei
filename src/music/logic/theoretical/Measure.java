package music.logic.theoretical;

import java.util.Random;

public class Measure {

	
	private TimeSignature timeSignature;
	private Note[] notes; // <-- will eventually be a more fitting data type (TODO)
	private Random rand = new Random(); // RNG seed
	
	/**
	 * CONSTRUCTOR
	 */
	public Measure(TimeSignature ts) {
		
		timeSignature = ts;
		notes = new Note[ts.getNoteAmount()];
		
	}
	
	// GETTER
	public TimeSignature getTimeSignature() {
		return timeSignature;
	}
	public Note[] getNotes() {
		return notes;
	}
	
	
	//// RANDOMIZING METHODS
	// for randomizing musical structures and different aspects of the measure.
	
	/**
	 * inserts rests at random points in the measure.
	 * @param n number of rests to be inserted into the measure.
	 */
	public void randRests(int n) {
		
		do {
			notes[rand.nextInt(notes.length)] = null;
			n--;
		} while(n > 0);
		
	}
	
	/**
	 * randomizes the time signature.
	 * can only create simple and compound meters.
	 */
	public void randTimeSignature() {
		
		timeSignature.setBeatsAmount(rand.nextInt(3) + 2);
		timeSignature.setBeatsType(rand.nextInt(2) + 2);
		int i = rand.nextInt(5) + 1;
		if(i == 3) {
			i++;
		} else if(i == 4) {
			i = 8;
		} else if(i == 5) {
			i = 16;
		}
		timeSignature.setNoteLength(i);
		
	}
	
	//
	////
	
	
}
