import com.codebase.management.Director;
import com.codebase.management.Manager;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    @Before
    public void before(){
        director = new Director("Steve", "HU2342487Y", 32000,"Software", 502342);
    }

    @Test
    public void canDoubleBonus(){
        assertEquals(640, director.payBonus());
    }
}
