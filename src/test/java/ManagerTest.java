import org.junit.Before;
import org.junit.Test;
import staff.manager.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob Smith", "JK1234", 30000.00, "Accounting");
    }

    @Test
    public void hasName() {
        assertEquals("Bob Smith", manager.getName());
    }

    @Test
    public void hasNINo() {
        assertEquals("JK1234", manager.getNationalInsuranceNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment() {
        assertEquals("Accounting", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(30500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
