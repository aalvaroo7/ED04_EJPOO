package org.example;
public class Circulo2D {
    private int cx, cy;
    private double radio;

    public Circulo2D() { // constructor por defecto
        cx = 0;
        cy = 0;
        radio = 1.0;
    }

    public Circulo2D(int cx, int cy, double radio) { // constructor totalmente parametrizado
        this.cx = cx;
        this.cy = cy;
        this.radio = radio;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo2D{" +
                "cx:" + cx +
                ", cy:" + cy +
                ", radio:" + radio +
                '}';
    }

    public void copiarDeCirculo(Circulo2D c) {
        this.cx = c.getCx();
        this.cy = c.getCy();
        this.radio = c.getRadio();
    }

    public Circulo2D obtenerCopia() {
        return new Circulo2D(cx, cy, radio);
    }

    public boolean equals(Circulo2D c) {
        return this.cx == c.getCx() && this.cy == c.getCy() && this.radio == c.getRadio();
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public boolean estaDentro(int x, int y) {
        return Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2)) < radio;
    }

    public Circulo2D obtenerCirculoQueLoContiene(Circulo2D c) {
        if (this.radio >= c.getRadio()) {
            return this;
        } else {
            return c;
        }
    }
}
if(this.radio >=c.getRadio()){
        return this.radio >= c.getRadio()
    else
        return c;
    }



