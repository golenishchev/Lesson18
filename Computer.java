package com.example.lesson18;

public class Computer {
    private String processor;
    private String ram;
    private String hdd;
    private String videoCard;
    private String powerSupply;

    public Computer(String processor, String ram, String hdd, String videoCard, String powerSupply) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.powerSupply = powerSupply;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        String result = "Processor: ";
        result += getProcessor() + "\n";
        result += "RAM: " + getRam() + "\n";
        result += "HDD: " + getHdd() + "\n";
        result += "Video Card: " + getVideoCard() + "\n";
        result += "Power Supply: " + getPowerSupply();
        return result;
    }
}
