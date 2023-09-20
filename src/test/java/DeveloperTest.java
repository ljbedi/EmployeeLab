import com.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Euan", "JH5067891L", 50000D);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(0.6);
        assertEquals(50000.6, developer.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(500, developer.payBonus(), 0.0);
    }

}
