package br.com.itexto.automata;

import java.util.HashSet;
import java.util.Set;

public class State {
	
	private Set<Transition> transitions = new HashSet<Transition>();
	
	public void addTransition(Transition transition) {
		if (transition != null) {
			transitions.add(transition);
		}
	}
	
	private final boolean _final;
	public boolean isFinal() {return _final;}
	
	private final boolean _initial;
	public boolean isInitial() {return _initial;}
	
	public Set<Transition> getTransitions() {return transitions;}
	
	private final String name;
	public String getName() {return name;}
	
	public State(String name, boolean _final, boolean _initial) {
		this.name = name;
		this._final = _final;
		this._initial = _initial;
	}
	
	public boolean equals(Object obj) {
		return (obj == this) ||
			   (obj instanceof State &&
			    getName() != null &&
			    getName().equals(((State) obj).getName()));
	}
	
	public String toString() {
		return name;
	}
	
	public int hashCode() {
		return name != null ? name.hashCode() : -1;
	}
	
}
