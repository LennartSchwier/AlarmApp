package de.neuefische.jan.j1exercises2409;

public enum AlarmLevel {

    RED("red", 0),
    YELLOW("yellow", 30),
    GREEN("green", 60);

    private final String name;
    private final int maxCapacity;

    AlarmLevel(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
