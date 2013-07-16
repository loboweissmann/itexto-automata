package br.com.itexto.automata;

public interface Expression {
	/**
	 * Check if a given character corresponds to the expression
	 * @param _char
	 * @return
	 */
	public boolean check(final char _char);
	
	/**
	 * Check if a given byte corresponds to the expression
	 * @param _byte
	 * @return
	 */
	public boolean check(final byte _byte);
	
}
