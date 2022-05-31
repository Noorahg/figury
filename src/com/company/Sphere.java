package com.company;

public class Sphere {
    private double radiuos;


    public Sphere(double radiuos) {
        this.radiuos = radiuos;
    }

    public double getRadiuos() {
        return radiuos;
    }

    public void setRadiuos(double radiuos) {
        this.radiuos = radiuos;
    }

    public double area(){
         double areaOfSphere=(4*Math.PI*Math.pow(radiuos,2));
        System.out.println("Площадь сферы: "+areaOfSphere);
         return  areaOfSphere;
    }

    public double volume(){
        double volumeOfSphere=(4*Math.PI*Math.pow(radiuos,3))/3;
        System.out.println("Объем сферы: "+volumeOfSphere);
        return volumeOfSphere;
    }


}
