import java.util.ArrayList;

public class Espresso extends Decorator {
    Coffee coffee;
    String name;
    public Espresso(Coffee c) {
        name = "Espresso";
        coffee = c;
    }
    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        coffee.ingredientslist.add(new Ingredients("Dairy Cream", 40));
        return coffee.ingredientslist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 40;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " added dairy cream";
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
