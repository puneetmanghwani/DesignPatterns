package NullObjectPattern;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating " + vehicle.getSeatingCapacity());
        System.out.println("Fuel " + vehicle.getTankCapacity());
    }
}
