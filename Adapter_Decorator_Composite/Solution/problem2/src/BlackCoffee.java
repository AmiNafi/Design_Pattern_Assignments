import java.util.ArrayList;

public class BlackCoffee extends Coffee{
    public BlackCoffee() {
        desc = "Black Coffee with grinned coffee beans with water";
        ingredientslist.add(new Ingredients("Water", 0));
        ingredientslist.add(new Ingredients("Grinned Coffee Beans", 30));
    }
    @Override
    public ArrayList<Ingredients> getIngredientslist() {
        return ingredientslist;
    }

    @Override
    public double getCost() {
        return 130;
    }

    @Override
    public String getName() {
        return "Black Coffee";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
