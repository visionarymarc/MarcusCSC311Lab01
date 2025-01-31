public class Lab01 {
    public static void main(String[] args) {
        // Instantiate a Vehicle object
        Vehicle myVehicle = new Vehicle(2, "Red", 0.25f, "Electric");

        // Test Vehicle getter methods
        System.out.println("Vehicle Information:");
        System.out.println("Number of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("Color: " + myVehicle.getColor());
        System.out.println("Engine Size: " + myVehicle.getEngineSize() + "L");
        System.out.println("Fuel Type: " + myVehicle.getFuelType());

        // Test Vehicle setter attributes
        myVehicle.setColor("Blue");
        myVehicle.setEngineSize(0.3f);

        System.out.println("\nUpdated Vehicle Information:");
        System.out.println("New Color: " + myVehicle.getColor());
        System.out.println("New Engine Size: " + myVehicle.getEngineSize() + "L");

        // Instantiate a Car object with required parameters
        Car myCar = new Car(4, "Silver", 2.0f, "Gasoline");
        
        // Set Car attributes using Vehicle setters
        myCar.setNumberOfWheels(4);
        myCar.setColor("Silver");
        myCar.setEngineSize(2.0f);
        myCar.setFuelType("Gasoline");

        // Test Car methods
        System.out.println("\nCar Information:");
        myCar.displayInfo();

        // Test honk method
        System.out.println("\nTesting honk method:");
        myCar.honk();

        // Modify Car attributes
        myCar.setColor("Black");

        System.out.println("\nUpdated Car Information:");
        myCar.displayInfo();
    }
}
