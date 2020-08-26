import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Stephen", "AB 12 34 56 C", 50000.00, "Marketing");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(55000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(50500.00, manager.getSalary(), 0.01);
    }
}
