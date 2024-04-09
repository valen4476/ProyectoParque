package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
