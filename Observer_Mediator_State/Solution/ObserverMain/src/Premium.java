import java.util.Scanner;

public class Premium implements Observer{
    private String name;

    public boolean isBoth() {
        return both;
    }

    public void setBoth(boolean both) {
        this.both = both;
    }

    private boolean both;
    Premium(String nm) {
        this.name = nm;
        both = false;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(int pre, int cur) {

        if (pre == 0 && cur == 2) {
            setBoth(false);
            System.out.println("Only DEF");
        }
        else if (pre == 2 && cur == 1) {
            System.out.println("Now DEF");
        }
        else if (pre == 1 && cur == 0) {
            setBoth(false);
            System.out.println("Only ABC");
        }
        else if (pre == 1 && cur == 2) {
            if (isBoth()) {
                setBoth(false);
            }
            System.out.println("Now DEF");
        }
        else if (pre == 2 && cur == 0) {
            System.out.println("ABC available to use!");
        }
        else if (pre == 0 && cur == 1) {
            int inp;
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1. Use both\n2.Single(DEF)");
                inp = sc.nextInt();
                if (inp != 1 && inp != 2) {
                    System.out.println("Invalid");
                }
                else break;
            }
            if (inp == 1) {
                setBoth(true);
                System.out.println("Set to both");
            }
            else {
                System.out.println("Only DEF");
            }
        }
    }

    @Override
    public String getName() {
        return null;
    }
}
