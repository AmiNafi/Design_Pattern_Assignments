package cars;

public class BMW implements Car{
    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getDriveTrain() {
        return "Rear-wheel";
    }

    @Override
    public String getManufacturingCountry() {
        return "Germany";
    }

    @Override
    public String getEngine() {
        return "Electric Engine";
    }

    @Override
    public String getName() {
        return "BMW";
    }
}
