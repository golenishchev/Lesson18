package com.example.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    private static Map<Integer, List<Computer>> catalogComputersMap;

    public static void main(String[] args) {
        catalogComputersMap = new HashMap<Integer, List<Computer>>();
        ComputerStore cs = new ComputerStore();
        List<Computer> catalogComputersListOne = new ArrayList<Computer>();
        List<Computer> catalogComputersListTwo = new ArrayList<Computer>();
        List<Computer> catalogComputersListThree = new ArrayList<Computer>();
        catalogComputersListOne.add(new Computer("2 x 1.6 GHz", "4 GB", "512 GB", "GeForce 210", "350 Watt"));
        catalogComputersListTwo.add(new Computer("2 x 3.2 GHZ", "8 GB", "1 TB", "Radeon R7 370", "550 Watt"));
        catalogComputersListThree.add(new Computer("2 x 3.7 GHz", "16 GB", "1 TB", "GeForce GTX 970", "550 Watt"));
        catalogComputersMap.put(1, catalogComputersListOne);
        catalogComputersMap.put(2, catalogComputersListTwo);
        catalogComputersMap.put(3, catalogComputersListThree);
        System.out.println("-------- for -------");
        cs.printByIndex(catalogComputersMap);
        System.out.println("----- for-each -----");
        cs.printForEach(catalogComputersMap);
        System.out.println("\n" + "----- for-each and Lambda -----");
        cs.printForEachAndLambda(catalogComputersMap);


    }
}
