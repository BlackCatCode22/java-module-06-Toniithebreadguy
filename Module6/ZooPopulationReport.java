package jose.zoo.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ZooPopulationReport {

    public static void generateZooPopulationReport(List<Hyena> hyenas, List<Lion> lions, List<Tiger> tigers, List<Bear> bears) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("zooPopulation.txt"))) {

            // Write Hyena Habitat
            writer.write("Hyena Habitat:\n");
            for (Hyena hyena : hyenas) {
                writer.write(hyena.getID() + "; " + hyena.getName() + "; birth date: " + hyena.getBirthDate() + "; "
                        + hyena.getColor() + "; " + hyena.getSex() + "; " + hyena.getWeight() + " pounds; from "
                        + hyena.getOrigin() + "; arrived " + hyena.getArrivalDate() + "\n");
            }

            // Write Lion Habitat
            writer.write("\nLion Habitat:\n");
            for (Lion lion : lions) {
                writer.write(lion.getID() + "; " + lion.getName() + "; birth date: " + lion.getBirthDate() + "; "
                        + lion.getColor() + "; " + lion.getSex() + "; " + lion.getWeight() + " pounds; from "
                        + lion.getOrigin() + "; arrived " + lion.getArrivalDate() + "\n");
            }

            // Write Tiger Habitat
            writer.write("\nTiger Habitat:\n");
            for (Tiger tiger : tigers) {
                writer.write(tiger.getID() + "; " + tiger.getName() + "; birth date: " + tiger.getBirthDate() + "; "
                        + tiger.getColor() + "; " + tiger.getSex() + "; " + tiger.getWeight() + " pounds; from "
                        + tiger.getOrigin() + "; arrived " + tiger.getArrivalDate() + "\n");
            }

            // Write Bear Habitat
            writer.write("\nBear Habitat:\n");
            for (Bear bear : bears) {
                writer.write(bear.getID() + "; " + bear.getName() + "; birth date: " + bear.getBirthDate() + "; "
                        + bear.getColor() + "; " + bear.getSex() + "; " + bear.getWeight() + " pounds; from "
                        + bear.getOrigin() + "; arrived " + bear.getArrivalDate() + "\n");
            }
        }
    }
}
