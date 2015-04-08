package music.logic.elements;



public class InstrumentTick implements Comparable {
	private Note note;
	/**
	 * -1 if not available
	 */
	private int volumn;
	/**
	 * -1 if no instrument is available
	 */
	private int instrument;
	private Effect[] effects;
	
	

	
	@Override
	public String toString() {
		StringBuilder tickString = new StringBuilder();
		if(this.note == null)
		{
			tickString.append(" ...");
		}
		else
		{
			tickString.append(this.note.toString());
		}
		
		if(this.volumn == -1)
		{
			tickString.append(" ..");
		}
		else
		{
			tickString.append(" " + String.format("%02X", this.volumn));
		}
		
		if(this.instrument == -1)
		{
			tickString.append(" ..");
		}
		else
		{
			tickString.append(" " + String.format("%01X", this.instrument));
		}
		
		
				 
		for(Effect effect : this.effects)
		{
			if (effect == null)
			{
				tickString.append(" ...");
			}
			else
			{
				tickString.append(effect.toString());
			}
		}
		return tickString.toString();
	}




	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.note.compareTo(o);
		
		
		
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
