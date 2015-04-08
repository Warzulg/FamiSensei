package music.logic;



public class Tick implements Comparable {
	Note note;
	/**
	 * -1 if not available
	 */
	int volumn;
	/**
	 * -1 if no instrument is available
	 */
	int instrument;
	Effect[] effects;
	
	

	
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
}
