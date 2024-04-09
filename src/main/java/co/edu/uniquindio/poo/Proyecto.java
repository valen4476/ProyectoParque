package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {
private String nombre;
private Double costoTotal;
private Collection <Parque> parques;
private Collection<Zona> zonas;
public Proyecto(Collection<Zona> zonas) {
    this.zonas = zonas;
}

public Collection<Zona> getZonas() {
    return zonas;
}

public void setZonas(Collection<Zona> zonas) {
    this.zonas = zonas;
}

public Proyecto(Double costoTotal) {
    this.costoTotal = costoTotal;
}

public Double getCostoTotal() {
    return costoTotal;
}

public void setCostoTotal(Double costoTotal) {
    this.costoTotal = costoTotal;
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Collection<Parque> getParques() {
    return parques;
}

public void setParques(Collection<Parque> parques) {
    this.parques = parques;
}

public Proyecto(String nombre){
    assert nombre != null;
    parques = new LinkedList<>();
    this.nombre=nombre;
}

public void agregarParque(Parque parque){
    assert verificarParqueExiste(parque.getDescripcion()) == false;
    parques.add(parque);
}
private boolean verificarParqueExiste(String descripcion){
    boolean existe = false;
    for(Parque parque : parques){
        if(parque.getDescripcion().equals(descripcion)){
            existe = true;
        }
    }
    return existe;
}
public void agregarZona(Zona zona){
    assert verificarZonaExiste(zona.getNombre()) == false;
    zonas.add(zona);
}
private boolean verificarZonaExiste(String nombre){
    boolean existe = false;
    for(Zona zona : zonas){
        if(zona.getNombre().equals(nombre)){
            existe = true;
        }
    }
    return existe;
}


}
