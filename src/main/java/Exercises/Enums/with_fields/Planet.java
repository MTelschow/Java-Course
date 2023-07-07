package Exercises.Enums.with_fields;

public enum Planet {
    MERCURY("Mercury", 8),
    VENUS("Venus", 10),
    EARTH("Earth", 20);

    private final String name;
    private final double distanceFromSun;

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    private Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

}
