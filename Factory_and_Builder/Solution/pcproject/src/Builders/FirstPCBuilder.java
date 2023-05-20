package Builders;

import components.*;

public class FirstPCBuilder implements PCBuilder{
    private PC mypc;
    public FirstPCBuilder() {
        mypc = new PC();
    }

    @Override
    public void setType() {
        mypc.setType("First Type PC");
    }

    @Override
    public void buildBase() {
        mypc.setBase(new Base());
    }

    @Override
    public void addCPUCooler() {
        mypc.setCooler(new CPUCooler());
    }

    @Override
    public void addDVDDrive() {
        mypc.setDvdDrive(null);
    }

    @Override
    public void addProcessor() {
        mypc.setPp(new Corei5());
    }
    @Override
    public PC getPC() {
        return mypc;
    }
}
