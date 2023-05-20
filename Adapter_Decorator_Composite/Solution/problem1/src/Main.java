import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Passenger> plist = new ArrayList<Passenger>();
        String[] mons ={"Monster 1","Monster 2","Monster 3","Monster 4","Monster 5","Monster 6","Monster 7", "Monster 8"};
        String[] ship ={"Ship A","Ship B","Ship C","Ship D"};
        Random random = new Random();
        int crew = random.nextInt(20) + 10;
        System.out.println(ship[random.nextInt(3)] + " will start");
        for (int i = 0; i < crew; i++) {
            if (random.nextInt(3) == 0) {
                int id = random.nextInt(mons.length - 1);
                Imposter imposter = new Imposter(mons[id]);
                imposter.damage();
                imposter.poison();
                Passenger disguisedimp = new Adapter(imposter);
                plist.add(disguisedimp);
            }
            else {
                Crewmate crewmate = new Crewmate(i);
                plist.add(crewmate);
            }
        }
        System.out.println(ship[random.nextInt(3)] + " is running");
        int tot = random.nextInt(50) + 20;
        for (int i = 0; i < tot; i++) {
            int id = random.nextInt(crew - 1);
            if (random.nextBoolean()) {
                plist.get(id).study();
            }
            else plist.get(id).maintenance();
        }
    }
}
