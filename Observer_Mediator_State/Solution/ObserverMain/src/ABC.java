import java.util.ArrayList;

public class ABC implements Subject{
    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    private ArrayList<Observer> observers;
    private int cur, pre;
    ABC() {
        observers = new ArrayList<>();
        cur = 0;
        pre = 0;
    }
    public void changeState (int s) {
        setPre(this.cur);
        setCur(s);
        notifyAllUser();
    }

    @Override
    public void notifyAllUser() {
        for (Observer o : observers) {
            o.update(pre, cur);
        }
    }

    @Override
    public void subscrive(Observer observer) {

    }

    @Override
    public void unsub(String name) {
        Observer odel = null;
        for (Observer o : observers) {
            if (name.equalsIgnoreCase(o.getName())) odel = o;
        }
        if (odel == null) {
            System.out.println("Not Subscribed");
        }
        else {
            observers.remove(odel);
            System.out.println("Unsub Successful");
        }
    }
}
