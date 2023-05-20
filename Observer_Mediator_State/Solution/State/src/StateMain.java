import java.util.Scanner;

public class StateMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0, price = 20, cnt = 10;
        Machine m = new Machine();
        StableState state = new StableState(m);
        m.setState(state);
        while (true) {
            if (m.getState() instanceof StableState) {
                if (cnt == 0) break;
                money = sc.nextInt();
            }
            else {
                int tmp = sc.nextInt();
                money += tmp;
            }
            if (money < price) {
                m.payless();
                System.out.println("Pay " + (price - money) + " more");
            }
            else if (money == price) {
                 m.payequal();
                System.out.println("Take your product");
                cnt--;
            }
            else if (money > price) {
                 m.paymore();
                System.out.println("Take your product and Change = " + (money - price));
                cnt--;
            }
        }
    }
}
