package music.logic.theoretical;

import java.util.Random;

public class Scale {

	
	private Note[] notes;
	private boolean scaleType; //true = major scale; false = minor scale.
	private boolean isHarmonic; //these two only apply if its a minor scale (usually).
	private boolean isMelodic;
	
	/**
	 * CONSTRUCTORS
	 */
	public Scale() {
		
		//typically, a scale consists of 8 notes:
		notes = new Note[8];
		//if not specified, the empty scale created is classified as a major scale:
		scaleType = true;
		isHarmonic = false;
		isMelodic = false;
		
	}
	public Scale(int startingPitch, boolean scaleType) {
		
		this();
		buildNaturalScale(startingPitch, scaleType);
		
	}
	
	// GETTERS
	public Note[] getNotes() {
		return notes;
	}
	public boolean getScaleType() {
		return scaleType;
	}
	public boolean isHarmonic() {
		return isHarmonic;
	}
	public boolean isMelodic() {
		return isMelodic;
	}
	
	
	public void buildNaturalScale(int startingPitch, boolean scaleType) {
		
		notes[0].setPitch(startingPitch);
		
		for(int i = 1; i == 8; i++) {
			int prevPitch = notes[i - 1].getPitch();
			notes[i].setPitch(prevPitch);
			//depending on the type of scale being generated, a half step will be done at either
			//the third and sixth note (for a major scale) or at the second and forth note (for a natural minor scale):
			if((scaleType && (i == 2 || i == 6)) || (!scaleType && (i == 1 || i == 4))) {
				notes[i].step(1);
			} else {
				//all other steps are always full steps:
				notes[i].step(2);
			}
		}
		
	}
	
	public void convertToHarmonic() {
		
		//in harmonic minor, the seventh note is raised by a half step:
		notes[6].step(1);
		isHarmonic = true;
		
	}
	public void convertToMelodic() {
		
		//in melodic minor, the sixth and seventh note is raised by a half step:
		notes[5].step(1);
		notes[6].step(1);
		isMelodic = true;
		
	}
	
	
}
