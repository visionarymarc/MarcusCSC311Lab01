public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;
    
    // Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    
    // Getter and Setter for numberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
    // Getter and Setter for color
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Getter and Setter for engineSize
    public float getEngineSize() {
        return engineSize;
    }
    
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    
    // Getter and Setter for fuelType
    public String getFuelType() {
        return fuelType;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
