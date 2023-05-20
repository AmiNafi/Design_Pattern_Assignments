import java.util.ArrayList;

public abstract class Coffee {
    public ArrayList<Ingredients> ingredientslist;
    public Coffee () {
        ingredientslist = new ArrayList<>();
    }
    public abstract ArrayList<Ingredients> getIngredientslist();
    public abstract double getCost();
    public abstract String getName();
    String desc;

    public abstract String getDesc();

}
