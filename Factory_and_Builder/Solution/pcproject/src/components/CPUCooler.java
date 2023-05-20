package components;

public class CPUCooler implements Coolers{
    @Override
    public String getType() {
        return "CPU Cooler";
    }

    @Override
    public Integer getPrice() {
        return 36000;
    }
}
