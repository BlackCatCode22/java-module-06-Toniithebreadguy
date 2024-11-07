package jose.zoo.com;

public class Bear extends Animal {
    // Static variable to keep track of the number of bears created.
    static int numOfBears = 0;

    // Constructor with all the fields required by the superclass
    public Bear(String sex, int age, int weight, String animalName,
                String animalID, String animalBirthDate, String animalColor,
                String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);
        numOfBears++;
    }

    @Override
    public void roar() {
        System.out.println("The Bear roars loudly!");
    }
}
