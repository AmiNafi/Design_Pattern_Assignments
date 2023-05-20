package cars;

public class Toyota implements Car{

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getDriveTrain() {
        return "Rear-Wheel";
    }

    @Override
    public String getManufacturingCountry() {
        return "Japan";
    }
    @Override
    public String getEngine() {
        return "Hydrogen Fuel Cells";
    }

    @Override
    public String getName() {
        return "Toyota";
    }
}
