package jose.zoo.com;

import java.util.ArrayList;

public class AnimalNameListsWrapper {
    private ArrayList<String> hyenaNameList;
    private ArrayList<String> lionNameList;
    private ArrayList<String> tigerNameList;
    private ArrayList<String> bearNameList;

    public AnimalNameListsWrapper(ArrayList<String> hyenaNames, ArrayList<String> lionNames, ArrayList<String> tigerNames, ArrayList<String> bearNames) {
        this.hyenaNameList = hyenaNames;
        this.lionNameList = lionNames;
        this.tigerNameList = tigerNames;
        this.bearNameList = bearNames;
    }

    public ArrayList<String> getHyenaNameList() {
        return hyenaNameList;
    }

    public ArrayList<String> getLionNameList() {
        return lionNameList;
    }

    public ArrayList<String> getTigerNameList() {
        return tigerNameList;
    }

    public ArrayList<String> getBearNameList() {
        return bearNameList;
    }
}
