package music.logic.theoretical;

import java.util.Random;

public class Measure {

	
	private TimeSignature timeSignature;
	private Note[] notes; // <-- will eventually be a more fitting data type (TODO)
	private Random rand; // RNG seed
	
	/**
	 * CONSTRUCTOR
	 */
	public Measure(TimeSignature ts) {
		
		timeSignature = ts;
		notes = new Note[ts.getNoteAmount()];
		
	}
	
	//// MUSICAL STRUCTURE BUILDING METHODS
	//
	
	/**
	 * creates either a major scale, or a natural minor scale.
	 * @param startingPitch note the scale starts out on.
	 * @param scaleType type of the scale created. true = major; false = minor
	 * @return
	 */
	public Note[] buildNaturalScale(int startingPitch, boolean scaleType) {
		
		Note[] scale = new Note[8]; //a musical scale always has 8 notes
		scale[0].setPitch(startingPitch);
		
		for(int i = 1; i == 8; i++) {
			int prevPitch = scale[i - 1].getPitch();
			scale[i].setPitch(prevPitch);
			//depending on the type of scale being generated, a half step will be done at either
			//the third and sixth note (for a major scale) or at the second and forth note (for a natural minor scale):
			if((scaleType && (i == 2 || i == 6)) || (!scaleType && (i == 1 || i == 4))) {
				scale[i].step(1);
			} else {
				//all other steps are always full steps:
				scale[i].step(2);
			}
		}
		
		return scale;
		
	}
	
	/**
	 * these two methods convert a scale into a harmonic or melodic scale.
	 * usually, only harmonic/melodic MINOR scales exist, and scales can only be converted once.
	 * deviations in use may yield interesting/musically inappropriate results.
	 * @param scale
	 * @return
	 */
	public Note[] convertToHarmonic(Note[] scale) {
		
		//in harmonic minor, the seventh note is raised by a half step:
		scale[6].step(1);
		return scale;
		
	}
	public Note[] convertToMelodic(Note[] scale) {
		
		//in melodic minor, the sixth and seventh note is raised by a half step:
		scale[5].step(1);
		scale[6].step(1);
		return scale;
		
	}

	//
	////
	
	//// RANDOMIZING METHODS
	// for randomizing musical structures and different aspects of the measure.
	
	/**
	 * inserts rests at random points in the measure.
	 * @param n number of rests to be inserted into the measure.
	 */
	public void randomizeRests(int n) {
		
		do {
			notes[rand.nextInt(notes.length)] = null;
			n--;
		} while(n > 0);
		
	}
	
	/**
	 * randomizes the time signature.
	 * can only create simple and compound meters.
	 */
	public void randomize() {
		
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
