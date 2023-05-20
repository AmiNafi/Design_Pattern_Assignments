import cars.Car;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        Factory myFactory = new Factory();
        Car myCar = myFactory.getCar(location);
        if (myCar == null) {
            System.out.println("No car available");
        }
        else {
            System.out.println("Car Name: " + myCar.getName());
            System.out.println("Color: " + myCar.getColor());
            System.out.println("Engine: " + myCar.getEngine());
            System.out.println("Manufacturing Country: " + myCar.getManufacturingCountry());
            System.out.println("Drive Train " + myCar.getDriveTrain());
        }
    }
}
