package com.example.lesson18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Computer> catalogComputersMap;

    public static void main(String[] args) {
        catalogComputersMap = new HashMap<Integer, Computer>();
        ComputerStore cs = new ComputerStore();
        catalogComputersMap.put(1, new Computer("2 x 1.6 GHz", "4 GB", "512 GB", "GeForce 210", "350 Watt"));
        catalogComputersMap.put(2, new Computer("2 x 3.2 GHZ", "8 GB", "1 TB", "Radeon R7 370", "550 Watt"));
        catalogComputersMap.put(3, new Computer("2 x 3.7 GHz", "16 GB", "1 TB", "GeForce GTX 970", "550 Watt"));
        System.out.println("----- for-each -----");
        cs.printForEach(catalogComputersMap);
        System.out.println("\n" + "----- for-each and Lambda -----");
        cs.printForEachAndLambda(catalogComputersMap);
    }
}
