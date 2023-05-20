import java.util.ArrayList;

public class Examiner {
    ArrayList<Marks> marklist;
    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
        controller.setExaminer(this);
    }

    void getList (ArrayList<Marks> lst) {
        marklist = lst;
        controller.getList(marklist);
    }

    public void correctMark(Marks m) {
        m.mark = m.mark + (90 - m.mark) / 2;
    }
}
