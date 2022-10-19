package Architecture.Solid;

public abstract class Car {
    
    private String mark; 
    private String model; 
    private String color; 
    private String bodyType; 
    private int numberOfWheels; 
    private String fuelType; 
    private String typeOfTransmission;
    private String engineCapacity; 

    protected Car(String mark, String model, String color, String bodyType, int numberOfWheels, String fuelype,
    String typeOfTransmission, String engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelype;
        this.typeOfTransmission = typeOfTransmission;
        this.engineCapacity = engineCapacity;
    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void findingErrors(){
        System.out.println("Errors not found");
    }

    public void gearShiftingHigh(){
        System.out.println("Car gear shifting high");
    }

    public void gearShiftingLow(){
        System.out.println("Car gear shifting low");
    }

    public void turnOnLights(){
        System.out.println("Car lights turn on");
    }

    public void turnOnWipers(){
        System.out.println("Car wipers turn on");
    }

    public void turnOffWipers(){
        System.out.println("Car wipers turn off");
    }

    public String getFuelType() {
        return fuelType;
    }

}
