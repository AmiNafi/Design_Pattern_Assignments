package Builders;

import components.*;

public class SecondPCBuilder implements PCBuilder{
    private PC mypc;
    public SecondPCBuilder(){
        mypc = new PC();
    }

    @Override
    public void setType() {
        mypc.setType("Second Type PC");
    }

    @Override
    public void buildBase() {
        mypc.setBase(new Base());
    }

    @Override
    public void addCPUCooler() {
        mypc.setCooler(new LiquidCooler());
    }

    @Override
    public void addDVDDrive() {
        mypc.setDvdDrive(null);
    }

    @Override
    public void addProcessor() {
        mypc.setPp(new Corei7());
    }

    @Override
    public PC getPC() {
        return mypc;
    }
}
