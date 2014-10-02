package ro.teamnet.radus.patterns.creational.builder;

public class Car {

    private final String name;      //required
    private final int maxSpeed;     //required
    private final double timeTo100KPH;      //required
    private final int numberOfDoors;    //optional
    private final int numberOfWheels;       //optional

    private Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.maxSpeed = carBuilder.maxSpeed;
        this.timeTo100KPH = carBuilder.timeTo100KPH;
        this.numberOfDoors = carBuilder.numberOfDoors;
        this.numberOfWheels = carBuilder.numberOfWheels;
    }

    public static class CarBuilder {
        private String name;
        private int maxSpeed;
        private double timeTo100KPH;
        private int numberOfDoors;
        private int numberOfWheels;

        public CarBuilder(String name, int maxSpeed, double timeTo100KPH) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.timeTo100KPH = timeTo100KPH;
        }

        public CarBuilder addNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public CarBuilder addNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
