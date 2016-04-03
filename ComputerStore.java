package com.example.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ComputerStore {
    private Map<Integer, Computer> catalogComputersMap;

    public void printByIndex(List<Computer> catalogComputersList) {
        for (int i = 0; i < catalogComputersList.size(); i++) {
            System.out.println(catalogComputersList.get(i));
        }
    }

    /* for-each */
    public void printForEach(List<Computer> catalogComputersList) {
        for (Computer hardware : catalogComputersList) {
            System.out.println(hardware);
        }
    }

    //Java 8 only, forEach and Lambda. recommend!
    public void printForEachAndLambda(Map<Integer, List<Computer>> catalogComputersMap) {
        System.out.println("\nExample 4...");
        catalogComputersMap.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
    }
}
