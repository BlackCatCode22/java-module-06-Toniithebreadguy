package jose.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to my Zoo Program!");

        String filePath = "animalNames.txt";
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Habitat lists for different animals
        List<Hyena> hyenaHabitat = new ArrayList<>();
        List<Lion> lionHabitat = new ArrayList<>();
        List<Tiger> tigerHabitat = new ArrayList<>();
        List<Bear> bearHabitat = new ArrayList<>();

        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        ArrayList<String> listOfBearNames = animalLists.getBearNameList();

        try (BufferedReader reader = new BufferedReader(new FileReader("arrivingAnimals.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                String[] arrayOfStrPartsOnComma = line.split(", ");
                String[] ageSexSpeciesParts = arrayOfStrPartsOnComma[0].split(" ");
                int age = Integer.parseInt(ageSexSpeciesParts[0]);
                String sex = ageSexSpeciesParts[3];
                String species = ageSexSpeciesParts[4];
                String birthSeason = arrayOfStrPartsOnComma[1].replace("born in ", "");
                String color = arrayOfStrPartsOnComma[2].replace(" color", "");
                int weight = Integer.parseInt(arrayOfStrPartsOnComma[3].replace(" pounds", ""));
                String origin = arrayOfStrPartsOnComma[4].replace("from ", "") + ", " + arrayOfStrPartsOnComma[5];
                String birthDate = Utilities.genBirthDay(age, birthSeason);

                if (species.equals("hyena")) {
                    String id = Utilities.genUniqueID("hyena", hyenaHabitat.size() + 1);
                    String name = listOfHyenaNames.remove(0);
                    Hyena hyena = new Hyena(sex, age, weight, name, id, birthDate, color, origin, Utilities.arrivalDate());
                    hyenaHabitat.add(hyena);
                    hyena.roar();
                    System.out.println();  // Adds a blank line for spacing
                } else if (species.equals("lion")) {
                    String id = Utilities.genUniqueID("lion", lionHabitat.size() + 1);
                    String name = listOfLionNames.remove(0);
                    Lion lion = new Lion(sex, age, weight, name, id, birthDate, color, origin, Utilities.arrivalDate());
                    lionHabitat.add(lion);
                    lion.roar();
                    System.out.println();  // Adds a blank line for spacing
                } else if (species.equals("tiger")) {
                    String id = Utilities.genUniqueID("tiger", tigerHabitat.size() + 1);
                    String name = listOfTigerNames.remove(0);
                    Tiger tiger = new Tiger(sex, age, weight, name, id, birthDate, color, origin, Utilities.arrivalDate());
                    tigerHabitat.add(tiger);
                    tiger.roar();
                    System.out.println();  // Adds a blank line for spacing
                } else if (species.equals("bear")) {
                    String id = Utilities.genUniqueID("bear", bearHabitat.size() + 1);
                    String name = listOfBearNames.remove(0);
                    Bear bear = new Bear(sex, age, weight, name, id, birthDate, color, origin, Utilities.arrivalDate());
                    bearHabitat.add(bear);
                    bear.roar();
                    System.out.println();  // Adds a blank line for spacing
                }
            }

            // Generate the zooPopulation.txt report
            ZooPopulationReport.generateZooPopulationReport(hyenaHabitat, lionHabitat, tigerHabitat, bearHabitat);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
