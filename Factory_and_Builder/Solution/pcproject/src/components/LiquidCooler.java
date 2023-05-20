package components;

public class LiquidCooler implements Coolers{
    @Override
    public String getType() {
        return "Liquid Cooler";
    }

    @Override
    public Integer getPrice() {
        return 17000;
    }
}
