package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.System.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
      Job one = new Job();
      Job two = new Job();
      assertNotEquals(one.getId(), two.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(three.getEmployer() instanceof Employer);
        assertTrue(three.getLocation() instanceof Location);
        assertTrue(three.getPositionType() instanceof PositionType);
        assertTrue(three.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(three.getName() instanceof String);

        assertEquals(three.getName(), "Product tester");
        assertEquals(three.getEmployer().getValue(), "ACME");
        assertEquals(three.getLocation().getValue(), "Desert");
        assertEquals(three.getPositionType().getValue(), "Quality control");
        assertEquals(three.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        Job four = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job five = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(four, five);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job six = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence" ));
        String blankLine = six.toString();
        assertEquals(String.valueOf(blankLine.charAt(0)), System.lineSeparator());
        assertEquals(String.valueOf(blankLine.charAt(blankLine.length())), System.lineSeparator());
    }

}
