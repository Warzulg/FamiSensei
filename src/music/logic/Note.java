package music.logic;

public class Note {
	char pitch;
	int octave;
	boolean halftone;
	@Override
	public String toString() {
		if(this.halftone)
		{
			return pitch + " # " + octave;
		}
		else
		{
			return pitch + " - " + octave;
		}
	}

}
