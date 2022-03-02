import java.io.FileNotFoundException;
import java.io.FileReader;

public class Runner{

    public static void main(String[] args){
        ExampleTryCatch myProgram = new ExampleTryCatch();
        myProgram.run();

//        Runner mainMethod = new Runner();
//        mainMethod.testStuff();

    }
private void testStuff(){
        try {


            int one = 1;
            int zero = 0;
          System.out.println(one / zero);
            FileReader fileReader = new FileReader("");
        }
        catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
            System.out.println("file not found " + fileNotFoundException.getMessage());

        }
        catch (ArithmeticException arithmeticException){
            System.out.println("no stop it!");
        }
        catch (Exception exception){
            System.out.println( exception.getMessage());
        }
}
}