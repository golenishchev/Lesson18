package com.example.lesson18;

import java.util.List;
import java.util.Map;

public class ComputerStore {
    /* for */
    public void printByIndex(Map<Integer, List<Computer>> catalogComputersMap) {
        for (int i = 0; i < catalogComputersMap.size(); i++) {
            System.out.println(catalogComputersMap.get(i));
        }
    }

    /* for-each */
    public void printForEach(Map<Integer, List<Computer>> catalogComputersMap) {
        for (Map.Entry<Integer, List<Computer>> entry : catalogComputersMap.entrySet()) {
            System.out.println("\n" + "Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    //Java 8 only, forEach and Lambda. recommend!
    public void printForEachAndLambda(Map<Integer, List<Computer>> catalogComputersMap) {
        catalogComputersMap.forEach((k, v) -> System.out.println("\nKey: " + k + "\nMultiple values:\n" + v));
    }
}
