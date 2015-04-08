package music.logic.structure;

public abstract class Column {

	/**
	 * The number of instrument defined in the header, this column plays
	 */
	private int channelNr;
	private int length;
	
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
