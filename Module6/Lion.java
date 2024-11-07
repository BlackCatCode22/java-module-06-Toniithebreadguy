package jose.zoo.com;

public class Lion extends Animal {
    // Static variable to keep track of the number of lions created.
    static int numOfLions = 0;

    // Constructor with all the fields required by the superclass
    public Lion(String sex, int age, int weight, String animalName,
                String animalID, String animalBirthDate, String animalColor,
                String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);
        numOfLions++;
    }

    @Override
    public void roar() {
        System.out.println("The Lion roars loudly!");
    }
}
