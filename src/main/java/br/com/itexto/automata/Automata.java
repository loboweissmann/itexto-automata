package br.com.itexto.automata;

import java.util.HashMap;
import java.util.Map;


public class Automata {
	
	private final Map<String, State> states = new HashMap<String, State>();
	private State initialState;
	
	public State process(String input) {
		State currentState = initialState;
		return null;
	}
	
	public State process(byte[] input) {
		return null;
	}
	
	public void addState(State state) {
		if (state != null && state.getName() != null) {
			states.put(state.getName(), state);
			if (state.isInitial()) {
				initialState = state;
			}
		}
	}
	
	
	
	public Automata() {
		
	}

}
