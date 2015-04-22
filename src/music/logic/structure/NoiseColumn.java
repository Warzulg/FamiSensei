package music.logic.structure;

import music.logic.elements.NoiseTick;


public class NoiseColumn extends Column {
	
	private NoiseTick[] ticks;

	/**
	 * CONSTRUCTOR
	 */
	public NoiseColumn(int channelNr, int length) {
		super(channelNr, length);
		
	}
	
	public NoiseTick[] getTicks() {
		return ticks;
	}

	public void setTicks(NoiseTick[] ticks) {
		this.ticks = ticks;
	}
	
	

}
