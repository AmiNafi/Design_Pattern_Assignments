package Builders;


public interface PCBuilder {
    void setType();
    void buildBase();
    void addCPUCooler();
    void addDVDDrive();
    void addProcessor();
    PC getPC();
}