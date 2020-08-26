import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bob", "FG 98 67 32 T", 25000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(25250.00, databaseAdmin.getSalary(), 0.01);
    }
}
