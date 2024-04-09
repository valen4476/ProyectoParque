package co.edu.uniquindio.poo;

public class Parque {
    
private String nombre;
private String descripcion;
private Municipio municipio;

public Municipio getMunicipio() {
    return municipio;
}

public void setMunicipio(Municipio municipio) {
    this.municipio = municipio;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public Parque(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
}
}
