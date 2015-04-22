package music.logic.structure;

import music.logic.elements.InstrumentTick;

public class InstrumentColumn extends Column {

	private InstrumentTick[] ticks;

	/**
	 * CONSTRUCTOR
	 */
	public InstrumentColumn(int channelNr, int length) {
		super(channelNr, length);
		
	}
	
	public InstrumentTick[] getTicks() {
		return ticks;
	}

	public void setTicks(InstrumentTick[] ticks) {
		this.ticks = ticks;
	}
	
	
	
	

}
