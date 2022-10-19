package Architecture.Solid;

public class CleaningCar extends Car {

    public CleaningCar(String mark, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String typeOfTransmission, String engineCapacity) {
        super(mark, model, color, bodyType, numberOfWheels, fuelType, typeOfTransmission, engineCapacity);
    }

    public void cleaningStreet(){
        System.out.println("Car is cleaning street");
    }
    
}
