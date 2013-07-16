/*
  Copyright 2013 Henrique Lobo Weissmann (loboweissmann@gmail.com)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package br.com.itexto.automata;

import java.util.HashSet;
import java.util.Set;

public class State {
	
	private Set<Transition> transitions = new HashSet<Transition>();
	
	public State next(final char _char) {
		return null;
	}
	
	public State next(final byte _byte) {
		return null;
	}
	
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
