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
