package music.logic;

public class Note implements Comparable{
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
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
