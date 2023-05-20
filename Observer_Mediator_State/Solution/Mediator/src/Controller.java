import java.util.ArrayList;

public class Controller {
    ArrayList<Marks> marklist;
    ArrayList<Student> students;
    Examiner examiner;
    Controller() {
        students = new ArrayList<>();
    }
    public void getList(ArrayList<Marks> m) {
        marklist = m;
        for (Marks cur : marklist) System.out.println("ID = " + cur.id + " Mark = " + cur.mark);
        correctMakrs(getErrorList(m.size()));
        for (Student student : students) {
            for (Marks marks : marklist) {
                if (student.getId().equals(marks.id)) student.setMark(marks.mark);
            }
        }
    }
    private void correctMakrs(ArrayList<Integer> m) {
        for (int i = 0; i < m.size(); i++) {
            System.out.println("ID = " + marklist.get(m.get(i)).id + " Previous Mark = " + marklist.get(m.get(i)).mark);
            marklist.get(m.get(i)).mark = marklist.get(m.get(i)).mark + (100 - marklist.get(m.get(i)).mark) / 2;
            System.out.println("Updated Mark = " + marklist.get(m.get(i)).mark);
        }

    }
    public ArrayList<Integer> getErrorList(Integer x) {
        double prob = 0.55;
        ArrayList <Integer> ret = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            double cur = Math.random();
            if (cur <= prob) ret.add(i);
        }
        return ret;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void setExaminer(Examiner examiner) {
        this.examiner = examiner;
    }

    public void reExamine(Integer id, Integer mark) {
        for (Marks marks : marklist) {
            if (marks.id.equals(id)) {
                examiner.correctMark(marks);
                for (Student student : students) {
                    if (student.getId().equals(marks.id)) student.setMark(marks.mark);
                }
                break;
            }
        }
    }
}
