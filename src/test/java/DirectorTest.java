import org.junit.Before;
import org.junit.Test;
import staff.manager.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jim Kippen", "JK8910", 60000.00, "DevOps", 250000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jim Kippen", director.getName());
    }

    @Test
    public void hasNINo() {
        assertEquals("JK8910", director.getNationalInsuranceNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment() {
        assertEquals("DevOps", director.getDepartmentName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000.00);
        assertEquals(65000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(1200.00, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(250000.00, director.getBudget(), 0.01);
    }
}
