package InstrumentsTest;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;
import Shop.*;
import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(ItemType.Instruments, InstrumentCategory.Strings, GuitarType.Electric, 4, 50, 100);
    }
    @Test
    public void hasSection(){
        assertEquals(ItemType.Instruments, guitar.getSection());
    }

    @Test
    public void hasCategory(){
        assertEquals(InstrumentCategory.Strings, guitar.getCategory());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.Electric, guitar.getGuitarType());
    }

    @Test
    public void getNoStrings(){
        assertEquals(4, guitar.getStrings());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(50, guitar.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(100, guitar.getSellingPrice(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(50, guitar.getMarkup(), 0);
    }

    @Test
    public void canPlay(){
        assertEquals("Plays guitar sound", guitar.play("Plays guitar sound"));
    }


    }

