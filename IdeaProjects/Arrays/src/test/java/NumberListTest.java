import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before(){

        Vector v = new Vector();
        v.add(6);
        v.add("Hello");
        //vectors are syncronised and also allow multiple different types of values whereas ArrayLists only allow one data type to be stored


        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(3, myNumbers.getNumbers());
    }

    @Test
    public void canAddValue(){
        myNumbers.addNumber(12);
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        myNumbers.addNumber(10);
        myNumbers.addNumber(10);
        myNumbers.addNumber(10);
        myNumbers.addNumber(10);
        assertEquals(46, myNumbers.getTotal());
    }
}
