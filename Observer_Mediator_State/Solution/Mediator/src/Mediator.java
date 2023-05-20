import java.util.ArrayList;

public class Mediator {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Examiner examiner = new Examiner();
        examiner.setController(controller);
        ArrayList<Marks> lst = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student s = new Student(i + 1);
            s.setController(controller);
            students.add(s);
            int val = 50 + (int)(50 * Math.random());
            Marks m = new Marks(i + 1, val);
            lst.add(m);
        }
        examiner.getList(lst);
        for (Student student : students) {
            student.showMark();
            student.reExamine();
        }
        System.out.println("After Re-examine");
        for (Student student : students) {
            student.showMark();
        }
    }
}
