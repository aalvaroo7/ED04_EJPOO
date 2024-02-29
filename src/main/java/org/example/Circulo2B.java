package org.example;
public class Circulo2B {
    private double cx;
    private double cy;
    private double radio;

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getRadio() {
        return radio;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo2B{" +
                "cx=" + cx +
                ", cy=" + cy +
                ", radio=" + radio +
                '}';
    }
}