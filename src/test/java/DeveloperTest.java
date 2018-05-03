import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Clare Thomson", "JK567", 35000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Clare Thomson", developer.getName());
    }

    @Test
    public void hasNINo() {
        assertEquals("JK567", developer.getNationalInsuranceNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(500.00);
        assertEquals(35500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(350.00, developer.payBonus(), 0.01);
    }

    @Test
    public void payRiseCannotBeNegative() {
        developer.raiseSalary(-500.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeName() {
        developer.setName("John Thomson");
        assertEquals("John Thomson", developer.getName());
    }

    @Test
    public void cannotHaveNullName(){
        developer.setName(null);
        assertEquals("Clare Thomson", developer.getName());
    }
}
