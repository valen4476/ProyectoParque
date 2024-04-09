package co.edu.uniquindio.poo;

public enum Material {

    ARENA(10000),
    GRAMASINTETICA(35000),
    GRAMANATURAL(20000),
    ASFALTO(40000);

   

private final int valorMetroCuadrado;

private Material(int valorMetroCuadrado) {
    this.valorMetroCuadrado = valorMetroCuadrado;
}


public int getValorMetroCuadrado() {
    return valorMetroCuadrado;
}
}
