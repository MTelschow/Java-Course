package Exercises.Constructors.constructors_inheritance;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }
}
