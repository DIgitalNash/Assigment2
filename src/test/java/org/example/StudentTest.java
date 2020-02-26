package org.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentTest {

    /**
     * Rigorous Test :-)
     */

    private Student stud = new Student("Nash");
    //Test for object equality
    @Test
    public void testGetName() throws Exception
    {
        assertEquals("Rocky", stud.getName());
    }

    //Test for object identity
    @Test
    public void testPetRock() throws Exception{
        Student stud2 = new Student("Nash");
        assertSame(stud, stud2);
    }

    //Failing test
    @Test
    public void testFailGetName() throws Exception {
        assertEquals("Jesse",stud.getName());
    }

    //Timeout test
    @Test (timeout = 1)
    public void testPassed() throws Exception {
        assertFalse(stud.passed());
    }

    @Ignore("Incomplete method")
    @Test
    public void testPassedAfterAss() throws Exception {
        stud.assigmentDone();
        assertTrue(stud.passed());
    }


}



