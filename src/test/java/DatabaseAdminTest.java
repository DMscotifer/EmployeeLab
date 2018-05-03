import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Helen Jones", "JK678", 29000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Helen Jones", admin.getName());
    }

    @Test
    public void hasNINo() {
        assertEquals("JK678", admin.getNationalInsuranceNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(29000.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(500.00);
        assertEquals(29500.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(290.00, admin.payBonus(), 0.01);
    }

}
