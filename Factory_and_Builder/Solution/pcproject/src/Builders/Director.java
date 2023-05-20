package Builders;

import components.GraphicsCard;
import components.Ram;

public class Director {
    PCBuilder myBuilder;
    public void Construct(PCBuilder pc) {
        myBuilder = pc;
        myBuilder.setType();
        myBuilder.buildBase();
        myBuilder.addProcessor();
        myBuilder.addCPUCooler();
        myBuilder.addDVDDrive();
    }
    public void addRam(Ram ram) {
        myBuilder.getPC().addRam(ram);
    }
    public void addGraphicsCard(GraphicsCard gc) {
        myBuilder.getPC().addGC(gc);
    }
    public PC getPc() {
        return myBuilder.getPC();
    }
}
