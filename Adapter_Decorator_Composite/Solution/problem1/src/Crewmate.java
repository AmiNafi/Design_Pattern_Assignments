public class Crewmate implements Passenger{
    private int id;
    public Crewmate(int num) {
        id = num;
        System.out.println(num + "th crewmate is entering");
    }
    @Override
    public void study() {
        System.out.println(id + "th crewmate is studying");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void maintenance() {
        System.out.println(id + "th crewmate is doing maintenance");
    }
}
