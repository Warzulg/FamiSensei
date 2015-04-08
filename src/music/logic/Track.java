package music.logic;

public class Track {
	String header;
	Pattern[] patterns;

	@Override
	public String toString() {
		StringBuilder trackString =new StringBuilder();
		
		trackString.append(this.header);
		
		for(int patternNr = 0; patternNr < this.patterns.length; patternNr++)
		{
			trackString.append(String.format("PATTERN %02d", patternNr));
			trackString.append(this.patterns[patternNr].toString());
			trackString.append("\n\n");
		}
		
		trackString.append("# End of export\n");
		return trackString.toString();
	}
	
	

}
