package Architecture.Solid;

public class CargoCar extends Car {

    public CargoCar(String mark, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String typeOfTransmission, String engineCapacity) {
        super(mark, model, color, bodyType, numberOfWheels, fuelType, typeOfTransmission, engineCapacity);
    }
    
    public void fogLamps(){
        System.out.println("Foglamps turn on");
    }

    public void cargoTransportation(){
        System.out.println("Cargo car is  transporting cargo");
    }
}
