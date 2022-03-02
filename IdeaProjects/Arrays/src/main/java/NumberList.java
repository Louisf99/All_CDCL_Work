import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> testNumbers){
        this.numbers = testNumbers;
    }

    public int getNumbers(){
        return this.numbers.size();
    }

    public void addNumber(int numberToAdd){
        numbers.add(numberToAdd);
    }


    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }


    public int getNumberCount() {
        return this.numbers.size();
    }

    public int getTotal(){
        int total = 0;

//                for(int i=0;i < numbers.size(); i++){
//                    total += numbers.get(i);
//                }

        for(int number: this.numbers)
        {
            total += number;
        }
                return total;
    }



}
