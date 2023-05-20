import java.util.Scanner;

public class ObserverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Observer prem = new Premium("Naim");
        Observer reg = new Regular("Nafi");
        ABC abc = new ABC();
        abc.subscrive(prem);
        abc.subscrive(reg);
        while (true) {
            System.out.println("1.Operational\n2.Partially Down\n3.Fully Down");
            int inp;
            inp = sc.nextInt();
            if (inp - 1 == abc.getCur()) {
                System.out.println("Choose Different state");continue;
            }
            else {
                String st = "";
                if (abc.getCur() == 0) {
                    st += "Previous = Operational";
                }
                else if (abc.getCur() == 1) {
                    st += "Previous = Partially down";
                }
                else if (abc.getCur() == 2) {
                    st += "Previous = Fully down";
                }
                if (inp == 1) {
                    st += "\tCurrent = Operational";
                }
                else if (inp == 2) {
                    st += "\tCurrent = Partially down";
                }
                else st += "\tCurrent = Fully down";
                System.out.println(st);
                abc.setCur(inp - 1);
            }
        }
    }
}
