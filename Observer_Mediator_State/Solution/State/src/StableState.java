public class StableState implements State{
    private Machine machine;
    StableState(Machine m) {
        machine = m;
    }
    @Override
    public void payless() {
        machine.changeState(new UnstableState(machine));
    }

    @Override
    public void payequal() {
    }

    @Override
    public void paymore() {
    }
}
