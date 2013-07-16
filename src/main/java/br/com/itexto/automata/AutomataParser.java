package br.com.itexto.automata;

import java.io.InputStream;

public class AutomataParser {
	
	public Automata parse(InputStream input) {
		Automata result = null;
		if (input != null) {
			result = new Automata();
		}
		return result;
	}
	
}
