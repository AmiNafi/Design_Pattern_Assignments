import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean select[] = {false, false, false, false};
    public static void  printlist () {
        System.out.println("Select your coffee");
        System.out.println("1. Americano");
        System.out.println("2. Espresso");
        System.out.println("3. Cappuccino");
        System.out.println("4. Mocha");
        System.out.println("Press 0 to exit");
    }
    public static Integer quantity(Coffee coffee) {
        System.out.println(coffee.getName() + " amount : ");
        Integer ret = Integer.parseInt(sc.nextLine());
        return ret;
    }
    public static void main(String[] args) {
        ArrayList<Integer> amounts = new ArrayList<>();
        ArrayList<Coffee> coffees = new ArrayList<>();
        Coffee coffee;
        Integer am;
        for (int i = 0; i < 4; i++) {
            amounts.add(0);
        }
        for (int i = 0; i < 4; i++) {
            coffees.add(null);
        }
        while (true) {
            printlist();
            int id;

            id = Integer.parseInt(sc.nextLine());
            if (id == 1) {
                coffee = new Americano(new BlackCoffee());
            }
            else if (id == 2) {
                coffee = new Espresso(new BlackCoffee());
            }
            else if (id == 3) {
                coffee = new Cappuccino(new MilkCoffee());
            }
            else if (id == 4) {
                coffee = new Mocha(new MilkCoffee());
            }
            else if (id == 0) {
                break;
            }
            else coffee = new BlackCoffee();
            am = quantity(coffee);
            if (!select[id - 1]) {
                coffees.set(id - 1, coffee);
                amounts.set(id - 1, amounts.get(id - 1) + am);
                select[id - 1] = true;
            }
            else {
                amounts.set(id - 1, amounts.get(id - 1) + am);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (coffees.get(i) == null) continue;
            coffee = coffees.get(i);
            am = amounts.get(i);
            System.out.println(coffee.getName());
            System.out.println(coffee.getDesc());
            System.out.println("Ingredients : ");
            for (Ingredients ig : coffee.getIngredientslist()) {
                System.out.println(ig);
            }
            System.out.println("Quantity = " + am);
            System.out.println("Cost = " + coffee.getCost() * am);
        }
    }
}
