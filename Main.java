package com.example.lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    private static Map<Integer, String> catalogComputersMap;
    public static void main(String[] args) {
        Map<Integer, List<Computer>> catalogComputersMap = new HashMap<Integer, List<Computer>>();

        Computer myComp = new Computer("50 x 3.2 GHZ", "640 GB", "10 PetaBytes", "4 x Radeon Z0", "GigaWatt");
        ComputerStore cs = new ComputerStore();
        List<Computer> catalogComputersList = new ArrayList<Computer>();
        catalogComputersList.add(new Computer("2 x 1.6 GHz", "4 GB", "512 GB", "GeForce 210", "350 Watt"));
        catalogComputersList.add(new Computer("2 x 3.2 GHZ", "8 GB", "1 TB", "Radeon R7 370", "550 Watt"));
        catalogComputersList.add(new Computer("2 x 3.7 GHz", "16 GB", "1 TB", "GeForce GTX 970", "550 Watt"));
        System.out.println("-------- for -------");
        cs.printByIndex(catalogComputersList);

        System.out.println("----- for-each -----");
        cs.printForEach(catalogComputersList);
        System.out.println("----- for-each and Lambda -----");
        cs.printForEachAndLambda(catalogComputersMap);
        System.out.println("----- Hardware -----");
        System.out.println(myComp.getProcessor()); // null
        System.out.println(myComp.toString()); // null
    }
}
