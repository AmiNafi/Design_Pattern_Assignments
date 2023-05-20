public class Ingredients {
    int price;
    String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredients(String nm, int p) {
        name = nm;
        price = p;
    }
    @Override
    public String toString() {
        return "Name = " + name + " and Price = " + price;
    }
}
