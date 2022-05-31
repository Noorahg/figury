package com.company;

public class Silindr {

    private  int radious ;
    private int height;

    public Silindr(int radious, int height) {
        this.radious = radious;
        this.height = height;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area(){
        double areaOfCylinder=2*Math.PI*radious*(radious+height);
        System.out.println("Площадь цилиндра: "+areaOfCylinder);
        return areaOfCylinder;
    }

    public  double volume(){
        double volumeOfCylinder=Math.PI*Math.pow(radious,2)*height;
        System.out.println("Объем сферы: "+volumeOfCylinder);
        return volumeOfCylinder;
    }
}
