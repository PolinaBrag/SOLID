package Architecture.Solid;

public class FlyingCar extends Car implements CarWash, GasStation{

    protected FlyingCar(String mark, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String typeOfTransmission, String engineCapacity) {
        super(mark, model, color, bodyType, numberOfWheels, fuelType, typeOfTransmission, engineCapacity);
    }

    @Override
    public void wipingWindshield() {
        System.out.println("Flying car windshield is wiping");
        
    }

    @Override
    public void wipingLights() {
        System.out.println("Flying car lights is wiping");
        
    }

    @Override
    public void wipingMirrors() {
        System.out.println("Flying car mirorrs is wiping");
        
    }

    @Override
    public boolean refueling(String typeOfFuel) {
        if (typeOfFuel == this.getFuelType()){
            return true;
        }
        return false;
        
    }

    @Override
    public void move() {
        System.out.println("Car is flying");;
    }
    
}
