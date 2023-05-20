package Builders;

import components.*;

public class Order {
    private Director director;
    public Order() {
        director = new Director();
    }
    public boolean makeOrder(String type) {
        if (type.equalsIgnoreCase("First")) {
            director.Construct(new FirstPCBuilder());
        }
        else if (type.equalsIgnoreCase("Second")) {
            director.Construct(new SecondPCBuilder());
        }
        else if (type.equalsIgnoreCase("Third")) {
            director.Construct(new ThirdPCBuilder());
        }
        else if (type.equalsIgnoreCase("Gaming")) {
            director.Construct(new GamingPCBuilder());
        }
        else {
            return false;
        }
        return true;
    }
    public boolean addRam(String ram) {
        if (ram.equalsIgnoreCase("2666")) {
            director.getPc().addRam(new Ram2666());
            return true;
        }
        else if (ram.equalsIgnoreCase("3200")) {
            director.getPc().addRam(new Ram3200());
            return true;
        }
        else return false;
    }
    public boolean addGC(String gc) {
        if (gc.equalsIgnoreCase("2GB")) {
            director.getPc().addGC(new GC2GB());
            return true;
        }
        else if (gc.equalsIgnoreCase("4GB")) {
            director.getPc().addGC(new GC4GB());
            return true;
        }
        return false;
    }
    public PC getPC() {
        return director.getPc();
    }
}
