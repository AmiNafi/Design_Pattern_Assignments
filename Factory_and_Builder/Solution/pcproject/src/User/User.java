package User;

import Builders.Order;
import Builders.PC;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PC> orderlist = new ArrayList<>();
        String s;
        while (true) {
            System.out.println("Press O to open a new Order and Q to Quit and E to exit Order");
            s = sc.nextLine();
            if (s.equalsIgnoreCase("O")) {
                boolean orderMade = false;
                while (true) {
                    Order myorder = new Order();
                    String pctype;
                    System.out.println("Press E to exit");
                    System.out.println("PC Type?");
                    System.out.println("Options : Gaming, First, Second, Third");
                    pctype = sc.nextLine();
                    if (pctype.equalsIgnoreCase("E")) {
                        if (!orderMade) {
                            System.out.println("You must order an item before closing");
                            continue;
                        }
                        else {
                            System.out.println("Total PC : " + orderlist.size());
                            Integer sum = 0;
                            Integer count = 0;
                            for (PC pc : orderlist) {
                                count++;
                                System.out.println(count);
                                pc.printPC();
                                sum += pc.getTotalPrice();
                            }
                            System.out.println("Your Bill is " + sum);
                            orderlist.clear();
                            break;
                        }
                    }
                    if (!myorder.makeOrder(pctype)) {
                        System.out.println("Invalid Input!");
                        continue;
                    }
                    while (true) {
                        System.out.println("Press R to add Ram and G to add Graphics Card and Press C to Complete Order");
                        s = sc.nextLine();
                        if (s.equalsIgnoreCase("R")) {
                            System.out.println("Choose Ram 2666MHZ(2620) or 3200MHZ(2950)");
                            String type = sc.nextLine();
                            if (!myorder.addRam(type)) {
                                System.out.println("Invalid Input");
                                continue;
                            }
                        }
                        else if (s.equalsIgnoreCase("G")) {
                            System.out.println("Choose Graphics Card 2GB or 4GB");
                            String type = sc.nextLine();
                            if (!myorder.addGC(type)) {
                                System.out.println("Invalid Input");
                                continue;
                            }
                        }
                        else if (s.equalsIgnoreCase("C")) {
                            orderlist.add(myorder.getPC());
                            myorder.getPC().printPC();
                            orderMade = true;
                            break;
                        }
                        else {
                            System.out.println("Invalid Input");
                        }
                    }

                }
            }
            else if (s.equalsIgnoreCase("Q")) {
                return;
            }
        }
    }
}
