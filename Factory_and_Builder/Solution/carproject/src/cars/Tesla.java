package cars;

public class Tesla implements Car{
    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getDriveTrain() {
        return "All wheels";
    }

    @Override
    public String getManufacturingCountry() {
        return "US";
    }

    @Override
    public String getEngine() {
        return "Electric";
    }

    @Override
    public String getName() {
        return "Tesla";
    }
}
