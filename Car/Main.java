package Car;

public class Main {
    public static void main(String[] args) {

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();
        // car.go();

        Vehicle[] racers = {car, bicycle, boat};
        for (Vehicle x : racers) {
            x.go();
        }


    }

}
