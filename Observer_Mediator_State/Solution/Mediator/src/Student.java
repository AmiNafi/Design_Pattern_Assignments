public class Student {
    private Integer id, mark;
    Controller controller;

    Student(Integer i) {
        id = i;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public void setController(Controller controller) {
        this.controller = controller;
        controller.addStudent(this);
    }

    public void reExamine () {
        controller.reExamine(id, mark);
    }
    void showMark() {
        System.out.println("Student id = " + id + " Mark = " + mark);
    }
}
