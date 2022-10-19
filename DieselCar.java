package Architecture.Solid;

public class DieselCar extends Car implements GasStation {

    protected DieselCar(String mark, String model, String color, String bodyType, int numberOfWheels,
            String typeOfTransmission, String engineCapacity) {
        super(mark, model, color, bodyType, numberOfWheels, "diesel", typeOfTransmission, engineCapacity);
    }

    @Override
    public boolean refueling(String typeOfFuel) {
        if (typeOfFuel == this.getFuelType()){
            return true;
        }
        return false;
    }
    
}
