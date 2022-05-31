package com.company;

public class Konus {
    private  int radious ;
    private int height;


    public Konus(int radious, int height) {
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

    public  double area(){
        double areaOfCone=Math.PI*Math.pow(radious,2);
        System.out.println("Площадь сферы:"+areaOfCone);
        return areaOfCone;
    }

    public double volume(){
        double volumeOfCone =Math.PI*radious*radious*height/3;
        System.out.println("Площадь сферы:"+volumeOfCone);
        return volumeOfCone;
    }


}
