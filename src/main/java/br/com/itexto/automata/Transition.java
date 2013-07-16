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

public class Transition {
	
	private final String expression;
	public String getExpression() {return expression;}
	
	private final State to;
	public State getTo() {return to;}
	
	public Transition(String expression, State to) {
		this.expression = expression;
		this.to = to;
	}
	
	public String toString() {
		return expression + " -> " + to;
	}
	
	public boolean equals(Object obj) {
		return (obj == this) ||
				(
					(obj instanceof Transition) &&
					 expression != null &&
					 expression.equals(((Transition) obj).getExpression()) &&
					 to != null &&
					 to.equals(((Transition) obj).getTo())
				);
	}
	
	public int hashCode() {
		return ("Transition:" + toString()).hashCode();
	}
	
}
