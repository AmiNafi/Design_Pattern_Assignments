public class Machine {


    private State state;
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public void changeState(State s) {
        state = s;
    }
    public void payless() {
        state.payless();
    }
    public void paymore() {
        state.paymore();
    }
    public void payequal() {
        state.payequal();
    }
}
