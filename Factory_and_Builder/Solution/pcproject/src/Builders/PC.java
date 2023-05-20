package Builders;

import components.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PC {
    private Coolers cooler;
    private List<GraphicsCard> gcs;
    private PCProcessor pp;
    private ArrayList<Ram> rams;
    private Base base;
    private Integer totalPrice;
    private DVDDrive dvdDrive;
    private String type;


    public PC () {
        gcs = new ArrayList<>();
        rams = new ArrayList<>();
        totalPrice = 0;
        type = "";
    }
    public DVDDrive getDvdDrive() {
        return dvdDrive;
    }

    protected void setDvdDrive(DVDDrive dvdDrive) {
        this.dvdDrive = dvdDrive;
        if (dvdDrive != null) totalPrice += dvdDrive.getPrice();
    }


    protected void setCooler(Coolers cooler) {
        this.cooler = cooler;
        if (cooler != null) totalPrice += cooler.getPrice();
    }
    public void addRam(Ram ram) {
        rams.add(ram);
        if (ram != null) totalPrice += ram.getPrice();
    }
    public void addGC(GraphicsCard gc) {
        gcs.add(gc);
        if (gc != null) totalPrice += gc.getPrice();
    }
    protected void setPp(PCProcessor pp) {
        this.pp = pp;
        if (pp != null) totalPrice += pp.getPrice();
    }

    protected void setBase(Base base) {
        this.base = base;
        if (base != null) totalPrice += base.getPrice();
    }

    public Coolers getCooler() {
        return cooler;
    }
    public PCProcessor getPp() {
        return pp;
    }

    public Base getBase() {
        return base;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    protected void setTotalPrice(Integer price) {
        this.totalPrice = price;
    }
    public void printPC() {
        System.out.println("PC Details");
        System.out.println(type);
        System.out.println("Price : " + totalPrice);
        System.out.println(base.getName() + ": " + "BDT " + base.getPrice());
        if (pp != null) {
            System.out.println(pp.getType() + ": " + "BDT " + pp.getPrice());
        }
        if (cooler != null) {
            System.out.println(cooler.getType() + ": " + "BDT " + cooler.getPrice());
        }
        if (dvdDrive != null) {
            System.out.println(dvdDrive.getName() + ": " + "BDT " + dvdDrive.getPrice());
        }
        if (rams.size() > 0) {
            System.out.println("Rams : ");
            for (Ram ram : rams) {
                System.out.println(ram.getType() + ": " + "BDT " + ram.getPrice());
            }
        }
        if (gcs.size() > 0) {
            System.out.println("Graphics Cards : ");
            for (GraphicsCard gc : gcs) {
                System.out.println(gc.getType() + ": " + "BDT " + gc.getPrice());
            }
        }
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
