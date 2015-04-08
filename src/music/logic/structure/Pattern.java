package music.logic.structure;


public class Pattern {

	/**
	 * The columns in this pattern. Columns can be either InstrumentColumns or
	 * NoiseColumns
	 */
	Column[] columns;

	@Override
	public String toString() {
		StringBuilder patternString = new StringBuilder();
		for(int rowNr = 0; rowNr < this.columns[0].getLength() ; rowNr++)
		{
			patternString.append(String.format("ROW %02X", rowNr));
			for(int colNr = 0; colNr < this.columns.length; colNr++)
			{
				if(this.columns[colNr] instanceof InstrumentColumn)
				{
					patternString.append(" :" + ((InstrumentColumn) this.columns[colNr]).getTicks()[rowNr].toString());
				}
				else if(this.columns[colNr] instanceof NoiseColumn)
				{
					//Noise Columns todo
				}
			}
		}
		return patternString.toString();
		
		
	}

}
