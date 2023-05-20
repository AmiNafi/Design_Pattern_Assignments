package components;

public class Corei7 implements PCProcessor{
    @Override
    public String getType() {
        return "Intel Core i7";
    }

    @Override
    public Integer getPrice() {
        return 37000;
    }
}
