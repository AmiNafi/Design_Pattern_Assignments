import java.util.ArrayList;

public class MilkCoffee extends Coffee {
    public MilkCoffee() {
        desc = "Coffee with Milk and grinned coffee beans";
        ingredientslist.add(new Ingredients("Grinned Coffee Beans", 30));
        ingredientslist.add(new Ingredients("Milk", 50));
    }
    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        return ingredientslist;
    }

    @Override
    public double getCost() {
        return 180;
    }

    @Override
    public String getName() {
        return "Milk Coffee";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
