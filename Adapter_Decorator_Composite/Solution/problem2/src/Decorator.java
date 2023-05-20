import java.util.ArrayList;

public abstract class Decorator extends Coffee{
    public abstract double getCost();
    public abstract String getDesc();
    public abstract Coffee getCoffee();
}
