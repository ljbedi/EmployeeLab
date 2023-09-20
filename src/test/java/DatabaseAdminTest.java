import com.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Euan", "JH5067891L", 50000D);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(0.6);
        assertEquals(50000.6, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.0);
    }

}
