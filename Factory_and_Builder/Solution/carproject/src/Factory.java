import cars.BMW;
import cars.Car;
import cars.Tesla;
import cars.Toyota;

public class Factory {
    public Car getCar(String location) {
        if (location.equalsIgnoreCase("Asia")) {
            return new Toyota();
        }
        else if (location.equalsIgnoreCase("Europe")) {
            return new BMW();
        }
        else if (location.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        return null;
    }
}
