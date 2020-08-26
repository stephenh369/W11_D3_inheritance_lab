import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jimmy", "CD 45 67 89 E", 30000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(30300.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        developer.setName("Rudy");
        assertEquals("Rudy", developer.getName());
    }

    @Test
    public void cannotSetNameNull() {
        developer.setName(null);
        assertEquals("Jimmy", developer.getName());
    }
}
