package Architecture.Solid;

public class Programm {
    public static void main(String[] args) {
        Car fc = new FlyingCar("Летяга", "C2", "черный", "bodyType", 4, "diesel", "typeOfTransmission", "engineCapacity");
        fc.move();
        fc.gearShiftingHigh();

        Car cg = new CargoCar("mark", "model", "color", "bodyType", 4, "fuelType", "typeOfTransmission", "engineCapacity");
        cg.findingErrors();
        ((CargoCar)(cg)).fogLamps();
        cg.gearShiftingLow();

        Car dc = new DieselCar("mark", "model", "color", "bodyType", 4, "typeOfTransmission", "engineCapacity");
        System.out.println(((DieselCar)(dc)).refueling("petrol"));
        System.out.println(((DieselCar)(dc)).refueling("diesel"));

    }
}
