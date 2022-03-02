package pets;

import Exceptions.OffensiveNameException;
import behaviours.Pet;

public class Dog implements Pet {
    private String name;

    public Dog(String name) throws OffensiveNameException{
        if(name.equalsIgnoreCase("hitler"))
            throw new OffensiveNameException("dont call your dog hitler");
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
