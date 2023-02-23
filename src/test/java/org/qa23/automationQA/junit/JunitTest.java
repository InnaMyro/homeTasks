package org.qa23.automationQA.junit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {

    @Test
    public void divCorrect() {
        assertEquals(3, Junit.div(6,2));
    }
    @Test
    public void divCorrect1() {
        assertEquals(-3, Junit.div(6,-2));
    }
    @Test
   public void divInCorrect() throws ArithmeticException {
        assertThrows(ArithmeticException.class, ()->Junit.div(-6,0));
        //assertEquals(3, Junit.div(-6,0));
    }


}