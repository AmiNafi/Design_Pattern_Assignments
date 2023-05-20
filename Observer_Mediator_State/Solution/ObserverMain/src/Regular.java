import java.util.Scanner;

public class Regular implements Observer{
    private int extra;
    private boolean upgraded;

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public boolean isUpgraded() {
        return upgraded;
    }

    public void setUpgraded(boolean upgraded) {
        this.upgraded = upgraded;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    Regular(String nm) {
        name = nm;
        upgraded = false;
        extra = 0;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public void update(int pre, int cur) {
        Scanner sc = new Scanner(System.in);
        int inp;

        if (pre == 0 && cur == 2) {
            while (true) {
                System.out.println("1.Pay $20 to use DEF\n2.Don't pay");
                inp = sc.nextInt();
                if (inp != 1 && inp != 2) continue;
                else break;
            }
            if (inp == 1) {
                setUpgraded(true);
                extra++;
                System.out.println("Data is copied to DEF");
            }
            else {
                System.out.println("Server not available!!");
            }
        }
        else if (cur == 0 && (pre == 1 || pre == 2)) {
            if (isUpgraded()) {
                System.out.println("Bill : " + 20 * extra);
                setUpgraded(false);
                extra = 0;
            }
            System.out.println("ABC is Alive!");
        }
        else if (pre == 1 && cur == 2) {
            if (isUpgraded()) {
                System.out.println("Now DEF");
            }
            else {
                System.out.println("Server not available");
            }
        }
        else if (pre == 2 && cur == 1) {
            if (isUpgraded()) {
                System.out.println("Now DEF");
            }
            else System.out.println("Only ABC");
        }
        else if (pre == 0 && cur == 1) {
            while (true) {
                System.out.println("1.Continue like this\n2.Pay $20 to upgrade");
                inp = sc.nextInt();
                if (inp != 1 && inp != 2) continue;
                else break;
            }
            if (inp == 1) {
                System.out.println("Only ABC");
                setUpgraded(false);
            }
            else {
                System.out.println("Data is copied to DEF.");
                setUpgraded(true);
                extra++;
            }
        }

    }


}
