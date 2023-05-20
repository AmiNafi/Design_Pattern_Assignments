package Builders;

import components.*;

public class ThirdPCBuilder implements PCBuilder{
    private PC mypc;
    public ThirdPCBuilder() {
        mypc = new PC();
    }

    @Override
    public void setType() {
        mypc.setType("Third Type PC");
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
        mypc.setDvdDrive(new DVDDrive());
    }

    @Override
    public void addProcessor() {
        mypc.setPp(new Corei9());
    }

    @Override
    public PC getPC() {
        return mypc;
    }
}
