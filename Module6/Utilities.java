package jose.zoo.com;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilities {

    public static String genBirthDay(int age, String season) {
        int birthYear = LocalDate.now().getYear() - age;
        String birthDate;

        switch (season.toLowerCase()) {
            case "spring": birthDate = birthYear + "-03-21"; break;
            case "summer": birthDate = birthYear + "-06-21"; break;
            case "fall": birthDate = birthYear + "-09-21"; break;
            case "winter": birthDate = birthYear + "-12-21"; break;
            default: birthDate = birthYear + "-01-01"; break;
        }
        return birthDate;
    }

    public static String genUniqueID(String species, int count) {
        String prefix = switch (species.toLowerCase()) {
            case "hyena" -> "Hy";
            case "lion" -> "Li";
            case "tiger" -> "Ti";
            case "bear" -> "Be";
            default -> "An";
        };
        return prefix + String.format("%02d", count);
    }

    public static String arrivalDate() {
        return LocalDate.now().toString();
    }

    public static AnimalNameListsWrapper createAnimalNameLists(String filePath) {
        ArrayList<String> hyenaNames = new ArrayList<>();
        ArrayList<String> lionNames = new ArrayList<>();
        ArrayList<String> tigerNames = new ArrayList<>();
        ArrayList<String> bearNames = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> currentList = null;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.equals("Hyena Names:")) {
                    currentList = hyenaNames;
                } else if (line.equals("Lion Names:")) {
                    currentList = lionNames;
                } else if (line.equals("Tiger Names:")) {
                    currentList = tigerNames;
                } else if (line.equals("Bear Names:")) {
                    currentList = bearNames;
                } else if (!line.isEmpty() && currentList != null) {
                    String[] names = line.split(",\\s*");
                    for (String name : names) {
                        currentList.add(name);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return new AnimalNameListsWrapper(hyenaNames, lionNames, tigerNames, bearNames);
    }
}
