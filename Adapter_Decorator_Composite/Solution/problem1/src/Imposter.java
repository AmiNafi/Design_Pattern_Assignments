public class Imposter implements actions {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsadapted() {
        return isadapted;
    }

    public void setIsadapted(boolean isadapted) {
        this.isadapted = isadapted;
    }

    private String name;
    private boolean isadapted;
    public Imposter(String nm) {
        name = nm;
        System.out.println(name + "is entering");
        isadapted = false;
    }
    @Override
    public void damage() {
        if (!isadapted) {
            System.out.println(name + " is damaging ship");
        }
        else {
            System.out.println(name + " is doing maintenance ;)");
        }
    }

    @Override
    public void poison() {
        if (!isadapted) {
            System.out.println(name + " is poisoning");
        }
        else {
            System.out.println(name + " is studying ;)");
        }
    }
}
