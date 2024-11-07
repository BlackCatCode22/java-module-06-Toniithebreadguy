package jose.zoo.com;

public abstract class Animal {
    protected String sex;
    protected int age;
    protected int weight;
    protected String animalName;
    protected String animalID;
    protected String animalBirthDate;
    protected String animalColor;
    protected String animalOrigin;
    protected String animalArrivalDate;

    // Parameterized constructor
    public Animal(String sex, int age, int weight, String animalName, String animalID, String animalBirthDate, String animalColor, String animalOrigin, String animalArrivalDate) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthDate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalArrivalDate = animalArrivalDate;
    }

    // No-argument constructor with default values
    public Animal() {
        this.sex = "";
        this.age = 0;
        this.weight = 0;
        this.animalName = "";
        this.animalID = "";
        this.animalBirthDate = "";
        this.animalColor = "";
        this.animalOrigin = "";
        this.animalArrivalDate = "";
    }

    public abstract void roar();

    public String getID() {
        return animalID;
    }

    public String getName() {
        return animalName;
    }

    public String getBirthDate() {
        return animalBirthDate;
    }

    public String getColor() {
        return animalColor;
    }

    public String getSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return animalOrigin;
    }

    public String getArrivalDate() {
        return animalArrivalDate;
    }
}
