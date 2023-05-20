import java.util.ArrayList;

public class Mocha extends Decorator{
    String name;
    Coffee coffee;
    public Mocha(Coffee c) {
        coffee = c;
        name = "Mocha";
    }

    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        coffee.ingredientslist.add(new Ingredients("Chocolate sauce", 60));
        return coffee.ingredientslist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 60;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " added chocolate sauce";
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }

}
