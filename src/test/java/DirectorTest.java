import com.management.Director;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Euan", "JH5067891L", 50000D, "CodeClan", 1000000);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(0.6);
        assertEquals(50000.6, director.getSalary(), 0.0);
    }

    @Test
    public void noNegativeRaises() {
        assertEquals(50000, director.getSalary(), 0.0);
        director.raiseSalary(-2.5);
        assertEquals(50000, director.getSalary(), 0.0 );
    }

    @Test
    public void payBonus() {
        assertEquals(1000, director.payBonus(), 0.0);
    }

    @Test
    public void getBudget() {
        assertEquals(1000000, director.getBudget(), 0.0);
    }

    @Test
    public void setName() {
        assertEquals("Euan", director.getName());
        director.setName(null);
        assertEquals("Euan", director.getName());
    }

}
