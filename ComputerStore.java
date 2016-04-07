package com.example.lesson18;

import java.util.Map;

public class ComputerStore {

    // for-each
    // Map.Entry and HashMap.Entry give the same result
    public void printForEach(Map<Integer, Computer> catalogComputersMap) {
        for (Map.Entry<Integer, Computer> entry : catalogComputersMap.entrySet()) {
            System.out.println("\n" + "Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    //Java 8 only, forEach and Lambda. recommend!
    public void printForEachAndLambda(Map<Integer, Computer> catalogComputersMap) {
        catalogComputersMap.forEach((Integer, Computer) -> System.out.println("\nKey: " + Integer +
                "\nMultiple values:\n" + Computer));
    }
}
