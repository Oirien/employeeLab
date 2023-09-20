import com.codebase.management.Manager;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Steve", "HU2342487Y", 32000,"Software");
    }

    @Test
    public void hasName(){
        assertEquals("Steve", manager.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HU2342487Y", manager.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(32000, manager.getSalary());
    }
    @Test
    public void hasDeptName(){
        assertEquals("Software", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(200.55);
        assertEquals(32200, manager.getSalary());
    }
    @Test
    public void canHaveBonus(){
        assertEquals(320, manager.payBonus());
    }
    @Test
    public void canChangeName(){
        manager.setName("Bill");
        assertEquals("Bill", manager.getName());
    }
    @Test
    public void cannotNegativelyRaiseSalary(){
        manager.raiseSalary(-200.55);
        assertEquals(32000, manager.getSalary());
    }


}
