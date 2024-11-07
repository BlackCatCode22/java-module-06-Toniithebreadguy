package jose.zoo.com;

public class Hyena extends Animal {
    // Static variable to keep track of the number of hyenas created.
    static int numOfHyenas = 0;

    // Constructor with all the fields required by the superclass
    public Hyena(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin, String animalArrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin, animalArrivalDate);
        numOfHyenas++;
    }

    @Override
    public void roar() {
        System.out.println("The Hyena laughs");
    }
}