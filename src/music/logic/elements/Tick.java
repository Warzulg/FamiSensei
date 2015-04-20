package music.logic.elements;

public abstract class Tick implements Comparable{
	
	/**
	 * -1 if not available
	 */
	private int volumn;
	private Note note;
	/**
	 * -1 if no instrument is available
	 */
	private Instrument instrument;
	private Effect[] effects;
	
	/**
	 * CONSTRUCTOR
	 */
	public Tick(int volumn, Note note, Instrument instrument, Effect[] effects) {
		this.volumn = volumn;
		this.note = note;
		this.instrument = instrument;
		this.effects = effects;
	}
	
	public Tick() {
		this.volumn = -1;
		this.note = null;
		this.instrument = null;
		this.effects = null;
	}
	
	public Note getNote() {
		return note;
	}
	
	public void setNote(Note note) {
		this.note = note;
	}
	
	public int getVolumn() {
		return volumn;
	}
	
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public Effect[] getEffects() {
		return effects;
	}
	
	public void setEffects(Effect[] effects) {
		this.effects = effects;
	}
	
	@Override
	public String toString() {
		return String.format(" : %s %02d %0d %s %s %s ",
				note!= null ? note.toString() : "...",
				instrument != null ? instrument.getNumber() : "..",
				volumn != -1 ? volumn : ".",
				effects[0] != null ? effects[0].toString() : "...",
				effects[1] != null ? effects[0].toString() : "...",
				effects[2] != null ? effects[0].toString() : "..."	
				);
	}
	
}
