import co.edu.uniquindio.poo.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica{

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

   
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
