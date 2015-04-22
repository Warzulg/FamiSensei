package music.logic.structure;


public class Pattern {

	/**
	 * The columns in this pattern. Columns can be either InstrumentColumns or
	 * NoiseColumns
	 */
	private Column[] columns;
	private int length;

	/**
	 * CONSTRUCTOR
	 */
	public Pattern(int length) {
		
		this.length = length;
		//initialize the columns with the proper channel numbers + types and length:
		columns = new Column[4];
		for(int i = 0; i < 4; i++) {
			if(i != 3) {
				columns[i] = new InstrumentColumn(i, length);
			} else {
				columns[i] = new NoiseColumn(i, length);
			}
		}
		
	}
	
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

	public Column[] getColumns() {
		return columns;
	}

	public void setColumns(Column[] columns) {
		this.columns = columns;
	}
	
	public int getLength() {
		return length;
	}
	

}
