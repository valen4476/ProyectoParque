package co.edu.uniquindio.poo;

public class Zona {
private String nombre;
private Material material;
private FiguraGeometrica figuraGeometrica;

public FiguraGeometrica getFiguraGeometrica() {
    return figuraGeometrica;
}

public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
    this.figuraGeometrica = figuraGeometrica;
}

public Material getMaterial() {
    return material;
}

public void setMaterial(Material material) {
    this.material = material;
}

public Zona(String nombre) {
    this.nombre = nombre;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
}
