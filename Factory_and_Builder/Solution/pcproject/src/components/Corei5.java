package components;

public class Corei5 implements PCProcessor{
    @Override
    public String getType() {
        return "Intel Core i5";
    }

    @Override
    public Integer getPrice() {
        return 20000;
    }
}
