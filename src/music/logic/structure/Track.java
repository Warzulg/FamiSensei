package music.logic.structure;

import music.logic.elements.*;

public class Track {
	
	
	private String header;
	private Pattern[] patterns;

	/**
	 * CONSTRUCTOR
	 */
	public Track() {
		
		
		
	}
	
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

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Pattern[] getPatterns() {
		return patterns;
	}

	public void setPatterns(Pattern[] patterns) {
		this.patterns = patterns;
	}
	
	
}
