package music.logic.structure;

import music.logic.elements.*;

public class Track {
	
	
	private String header;
	private Pattern[] patterns;
	/**
	 * length of the song / amount of patterns
	 */
	private int length;

	/**
	 * CONSTRUCTOR
	 */
	public Track(int length) {
		
		this.length = length;
		patterns = new Pattern[length];
		
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
	
	public void buildHeader(String title, String author, String year, String comment) {
		setHeader(
				String.format("# FamiTracker text export 0.4.2\n\n"
							+ "# Song information\n\n"
							+ "TITLE           %s\n"
							+ "AUTHOR          %s\n"
							+ "COPYRIGHT       %s\n\n"
							+ "# Song comment\n"
							+ "COMMENT %s\n\n",
						title, author, year, comment)
				);
	}

	public Pattern[] getPatterns() {
		return patterns;
	}

	public void setPatterns(Pattern[] patterns) {
		this.patterns = patterns;
	}
	
	public void setPatternLength(int length) {
		for(int i = 0; i < this.length; i++)
			patterns[i] = new Pattern(length);
	}
	
	
}
