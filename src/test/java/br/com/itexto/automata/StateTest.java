package br.com.itexto.automata;

import static org.junit.Assert.*;

import org.junit.Test;

public class StateTest {

	@Test
	public void testConstructor() {
		State state = new State("test", true, true);
		assertEquals("test", state.getName());
		assertTrue(state.isFinal());
		assertTrue(state.isFinal());
	}
	
	@Test
	public void testEquality() {
		State state = new State("tst", true, true);
		assertEquals(state, state);
		State state_equals = new State("tst", true, true);
		assertEquals(state, state_equals);
		State another = new State("dd", true, true);
		assertFalse(state.equals(another));
	}
	
	@Test
	public void testAddTransition() {
		State state = new State("tst", true, true);
		State state2 = new State("tst2", false, true);
		Transition transition = new Transition("\nwt", state);
		state.addTransition(transition);
		assertTrue(state.getTransitions().contains(transition));
		Transition identical = new Transition("\nwt", state);
		state.addTransition(identical);
		assertEquals(1, state.getTransitions().size());
		Transition another = new Transition("\\*", state2);
		state.addTransition(another);
		assertEquals(2, state.getTransitions().size());
		assertTrue(state.getTransitions().contains(another));
	}

	

}
