package human;


import animal.Air.Bird;
import animal.Dog;


public class Trainer {
    public String teach(Dog dog) {
        return dog.bark();
    }

    public String trainBird(Bird _bird) {
        return _bird.speak();
    }
}


