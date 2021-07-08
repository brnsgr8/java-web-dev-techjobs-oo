package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId(){
        Job blankJob1 = new Job();
        Job blankJob2 = new Job();

        assertFalse(blankJob1.equals(blankJob2));

    }
    @Test
    public void testJobConstructorSetsAllFields(){
       Job constructorTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(constructorTest.getName()== "Product tester");
        assertTrue(constructorTest.getEmployer().getValue() == "ACME");
        assertTrue(constructorTest.getLocation().getValue() == "Desert");
        assertTrue(constructorTest.getPositionType().getValue() == "Quality control");
        assertTrue(constructorTest.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testJobsForEquality(){
    Job equalityTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job equalityTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(equalityTest1.equals(equalityTest2));
    }

    @Test
    // Checking for blank lines as the beginning and ending of the job listing
    public void testForToStringBlankLines(){
        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String stringTest = jobTest.toString();

        assertEquals('\n', stringTest.charAt(0));
        assertTrue(stringTest.charAt(stringTest.length()-1) == '\n');
        System.out.println();

    }

    @Test
    public void testAllEmptyFieldsButName() {
        Job job = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertEquals("\nID: " + job.getId()+ "\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n", job.toString());
    }
}
