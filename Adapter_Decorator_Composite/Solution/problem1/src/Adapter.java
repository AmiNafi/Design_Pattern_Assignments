public class Adapter implements Passenger{
    Imposter imposter;
    @Override
    public void study() {
        imposter.poison();
    }
    @Override
    public void maintenance() {
        imposter.damage();
    }
    public Adapter(Imposter im) {
        imposter = im;
        imposter.setIsadapted(true);
    }
}
