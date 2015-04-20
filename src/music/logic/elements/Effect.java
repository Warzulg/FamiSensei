package music.logic.elements;

public class Effect {
	
	private char id;
	/**
	 * effect parameter. hex number
	 */
	private int parameter;
	
	public char getId() {
		return id;
	}
	
	public void setId(char value) {
		this.id = id;
	}
	
	public int getParameter() {
		return parameter;
	}
	
	public void setParameter(int paramter) {
		this.parameter = parameter;
	}
	
	@Override
	public String toString() {
		return String.format("%s%02d", id, Integer.toHexString(parameter));
	}

}
