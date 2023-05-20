package Builders;

import components.*;

public class GamingPCBuilder implements PCBuilder{
    private PC mypc;
    public GamingPCBuilder() {
        mypc = new PC();
    }

    @Override
    public void setType() {
        mypc.setType("Gaming PC");
    }

    @Override
    public void buildBase() {
        mypc.setBase(new Base());
    }


    @Override
    public void addCPUCooler() {
        mypc.setCooler(null);
    }

    @Override
    public void addDVDDrive() {
        mypc.setDvdDrive(null);
    }

    @Override
    public void addProcessor() {
        mypc.setPp(new AMD());
    }

    @Override
    public PC getPC() {
        return mypc;
    }
}
