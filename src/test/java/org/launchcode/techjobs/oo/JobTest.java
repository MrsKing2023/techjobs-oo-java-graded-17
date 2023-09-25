package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

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
        Job six = new Job(
                "Web Developer",
                new Employer("LaunchCode"),
                new Location("StL"),
                new PositionType("Back-end developer"),
                new CoreCompetency("Java"));
        String linebreak = System.lineSeparator();
        String firstChar = String.valueOf(six.toString().substring(0,1));
        String lastChar = String.valueOf(six.toString().substring(six.toString().length()-1));
        assertEquals(true, six.toString().startsWith(System.lineSeparator()));
        assertEquals(true, six.toString().endsWith(System.lineSeparator()));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job seven = new Job("Barista",
            new Employer("Starbucks"),
            new Location("King of Prussia"),
            new PositionType("Coffee Maker"),
            new CoreCompetency("brew coffee") );

    String expectedString = System.lineSeparator() +
        "ID: " + seven.getId() + System.lineSeparator() +
                "Name: Barista"  + System.lineSeparator() +
                "Employer: Starbucks" + System.lineSeparator() +
                "Location: King of Prussia" + System.lineSeparator() +
                "Position Type: Coffee Maker" + System.lineSeparator() +
                "Core Competency: brew coffee" +
                System.lineSeparator();
    assertEquals(expectedString, seven.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job eight = new Job("",
                new Employer("Cap One"),
                new Location("Philadelphia"),
                new PositionType("Reserved"),
                new CoreCompetency("") );

        String expectedString = System.lineSeparator() +
                "ID: " + eight.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Cap One" + System.lineSeparator() +
                "Location: Philadelphia" + System.lineSeparator() +
                "Position Type: Reserved" + System.lineSeparator() +
                "Core Competency: Data not available" +
                System.lineSeparator();
        assertEquals(expectedString, eight.toString());
    }

}
