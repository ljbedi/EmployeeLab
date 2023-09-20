import com.management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Euan", "JH5067891L", 50000D, "CodeClan");
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(0.6);
        assertEquals(50000.6, manager.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(500, manager.payBonus(), 0.0);
    }

}
