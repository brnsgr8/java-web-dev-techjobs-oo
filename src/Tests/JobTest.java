package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertTrue(constructorTest.getEmployer().getValue()== "ACME");
        assertTrue(constructorTest.getLocation().getValue()== "Desert");
        assertTrue(constructorTest.getPositionType().getValue()== "Quality control");
        assertTrue(constructorTest.getCoreCompetency().getValue()== "Persistence");

    }

    @Test
    public void testJobsForEquality(){
    Job equalityTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job equalityTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(equalityTest1.equals(equalityTest2));
    }

}
