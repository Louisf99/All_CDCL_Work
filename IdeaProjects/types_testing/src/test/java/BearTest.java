import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear ( "Baloo", 25, 96.62);
    }


    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }


    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }


    @Test
    public void hasWeight(){
        assertEquals(96.62, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfWeightHigherThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernate(){
        bear = new Bear("Baloo", 25, 60);
        assertEquals(false, bear.readyToHibernate());
    }


}
