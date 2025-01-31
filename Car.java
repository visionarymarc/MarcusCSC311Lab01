public class Car extends Vehicle {
    // Constructor for Car
    public Car(int numberOfWheels, String color, float engineSize, String fuelType) {
        // Call the superclass constructor with the required arguments
        super(numberOfWheels, color, engineSize, fuelType);
    }
    
    // Method to make the car honk
    public void honk() {
        System.out.println("Honk, honk!");
    }
    
    // Method to display all attributes of the car
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine size: " + getEngineSize() + " L");
        System.out.println("Fuel type: " + getFuelType());
    }
}
