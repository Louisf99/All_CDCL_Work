import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordCollectionTesting {
    private WordCollection myWords;

    @Before
    public void before(){
        myWords = new WordCollection();
    }

   @Test
    public void canDoWordCount(){
        myWords.add("Hello");
       System.out.println(myWords.getArray()[0]);
        assertEquals(0, myWords.getWordCount());
   }


}
