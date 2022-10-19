package Architecture.Solid;

public class PetrolCar extends Car implements GasStation{

    protected PetrolCar(String mark, String model, String color, String bodyType, int numberOfWheels,
            String typeOfTransmission, String engineCapacity) {
        super(mark, model, color, bodyType, numberOfWheels, "petrol", typeOfTransmission, engineCapacity);
    }

    @Override
    public boolean refueling(String typeOfFuel) {
        if (typeOfFuel == this.getFuelType()){
            return true;
        }
        return false;
    }
    
}
