public class Cuadrado extends Rectangulo {
private Double lado;
    public Cuadrado(double ancho, double alto) {
        super(ancho, alto);
        
    }
    public Cuadrado(double lado) {
        super(lado, lado); 
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

   
    public void setLado(double lado) {
        this.lado = lado;
    }

}
