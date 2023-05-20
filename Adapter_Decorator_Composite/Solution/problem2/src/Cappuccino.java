import java.util.ArrayList;

public class Cappuccino extends Decorator{
    Coffee coffee;
    String name;
    public Cappuccino(Coffee c) {
        coffee = c;
        name = "Cappuccino";
    }
    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        coffee.ingredientslist.add(new Ingredients("Cinnamon Powder", 50));
        return coffee.ingredientslist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 50;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " added cinnamon powder";
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
