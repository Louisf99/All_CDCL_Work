import Exceptions.NullStringExceptions;
import behaviours.Pet;

import java.util.ArrayList;

public class PetShop{

    private ArrayList<Pet> stock = new ArrayList<Pet>();

    public PetShop(){
    }


    public Pet findPetByName(String searchName) throws NullStringExceptions {

        if(searchName == null){
            throw new NullStringExceptions("Cant search with no name!");
        }

        String searchLower = searchName.toLowerCase();
        for (Pet pet : stock){
            String petName = pet.getName().toLowerCase();
            if (petName.equals(searchLower)){
                return pet;
            }
        }
        return null;
    }

    public void addPet(Pet pet){
        stock.add(pet);
    }

}