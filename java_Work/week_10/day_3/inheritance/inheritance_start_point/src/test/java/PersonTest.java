import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersonTest {

    Person person;


    @Before
    public void before(){
        person = new Person("Simon", "RoS");
    }


    @Test
    public void hasName(){
        assertEquals("Simon", person.getName());
    }


    @Test
    public void hasCohort(){
        assertEquals("RoS", person.getCohort());
    }


    @Test
    public void canChangeName(){
        person.setName("Tony");
        assertEquals("Tony", person.getName());
    }


    @Test
    public void canChangeCohort(){
        person.setCohort("CodeClan");
        assertEquals("CodeClan", person.getCohort());
    }


    @Test
    public void canTalk(){
        assertEquals("I Love Java", person.talk("Java"));
    }

}
