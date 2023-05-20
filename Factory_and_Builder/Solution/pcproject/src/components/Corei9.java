package components;

public class Corei9 implements PCProcessor{
    @Override
    public String getType() {
        return "Intel Core i9";
    }

    @Override
    public Integer getPrice() {
        return 65000;
    }
}
