package music.logic.elements;



public class InstrumentTick extends Tick{
	
	private Note note;
	
	
	
	

	
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
		
		if(this.getVolumn() == -1)
		{
			tickString.append(" ..");
		}
		else
		{
			tickString.append(" " + String.format("%02X", this.getVolumn()));
		}
		
		if(this.getInstrument() == -1)
		{
			tickString.append(" ..");
		}
		else
		{
			tickString.append(" " + String.format("%01X", this.getInstrument()));
		}
		
		
				 
		for(Effect effect : this.getEffects())
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

	

	
	
	
}
