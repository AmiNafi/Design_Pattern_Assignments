public class UnstableState implements State{
    Machine machine;
    UnstableState(Machine m) {
        machine = m;
    }
    @Override
    public void payless() {

    }

    @Override
    public void payequal() {
        machine.changeState(new StableState(machine));
    }

    @Override
    public void paymore() {
        machine.changeState(new StableState(machine));
    }
}
