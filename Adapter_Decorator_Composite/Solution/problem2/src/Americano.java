import java.util.ArrayList;

public class Americano extends Decorator{
    Coffee coffee;
    String name;
    public Americano(Coffee c) {
        coffee = c;
        name = "Americano";
    }

    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        coffee.ingredientslist.add(new Ingredients("Extra Grinned coffee beans", 30));
        return coffee.ingredientslist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " added extra grined beans";
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
