public interface Subject {
    void notifyAllUser();
    void subscrive(Observer observer);
    void unsub(String name);
}
