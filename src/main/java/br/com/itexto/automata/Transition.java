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
