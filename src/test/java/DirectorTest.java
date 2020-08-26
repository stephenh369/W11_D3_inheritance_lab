import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Jeff", "ZZ 00 11 22 S", 100000.00, "Head Office", 1000000.00);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(110000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(101000.00, director.getSalary(), 0.01);
    }
}
