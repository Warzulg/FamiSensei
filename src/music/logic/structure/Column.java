package music.logic.structure;

public abstract class Column {

	/**
	 * number identifying the channel. 5th channel (DPCM) not included.
	 * 0 = Pulse 1; 1 = Pulse 2; 2 = Triangle; 3 = Noise
	 */
	private int channelNr;
	private int length;
	
	/**
	 * CONSTRUCTOR
	 */
	public Column(int channelNr, int length) {
		this.channelNr = channelNr;
		this.length = length;
	}
	
	public int getChannelNr() {
		return channelNr;
	}
	public void setChannelNr(int channelNr) {
		this.channelNr = channelNr;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
