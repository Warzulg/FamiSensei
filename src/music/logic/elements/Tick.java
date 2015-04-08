package music.logic.elements;

public abstract class Tick implements Comparable{
	/**
	 * -1 if not available
	 */
	private int volumn;
	/**
	 * -1 if no instrument is available
	 */
	private int instrument;
	private Effect[] effects;
	
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public int getInstrument() {
		return instrument;
	}
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	public Effect[] getEffects() {
		return effects;
	}
	public void setEffects(Effect[] effects) {
		this.effects = effects;
	}
	
	

}
