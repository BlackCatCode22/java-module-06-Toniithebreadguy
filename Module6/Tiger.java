package jose.zoo.com;

public class Tiger extends Animal {
    // Track the number of tigers created.
    static int numOfTigers = 0;

    // Constructor with all fields.
    public Tiger(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);
        numOfTigers++;
    }

    public void roar() {
        System.out.println("The tiger roars loudly!");
    }
}
