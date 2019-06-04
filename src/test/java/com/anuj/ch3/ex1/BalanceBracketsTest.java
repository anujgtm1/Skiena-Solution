package com.anuj.ch3.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalanceBracketsTest {
    BalanceBrackets object = new BalanceBrackets();

    @Test
    public void whenEmptyString_thenReturnsTrue() {
        assertEquals(-1, object.getUnbalancedBracketPosition("") );
    }

    @Test
    public void whenSingleStartingBracket_thenReturnsValue() {
        assertEquals(1, object.getUnbalancedBracketPosition("("));
    }

    @Test
    public void whenSingleEndingBracket_thenReturnsValue() {
        assertEquals(0, object.getUnbalancedBracketPosition(")"));
    }

    @Test
    public void whenSingleBalancedBracket_thenReturnsTrue() {
        assertEquals(-1, object.getUnbalancedBracketPosition("()"));
    }

    @Test
    public void whenUnbalancedBrackets_thenReturnsValue() {
        assertEquals(0, object.getUnbalancedBracketPosition(")()("));
    }

    @Test
    public void whenOpeningBracketsLess_thenReturnsClosingBracketValue() {
        assertEquals(2, object.getUnbalancedBracketPosition("())"));
    }

    @Test
    public void whenClosingBracketsLess_thenReturnsStringLength() {
        assertEquals(3, object.getUnbalancedBracketPosition("(()"));
    }
}
