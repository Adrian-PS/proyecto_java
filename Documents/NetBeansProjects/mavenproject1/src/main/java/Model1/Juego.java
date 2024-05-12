package Model1;

import Model1.Subpaquete.Resenia;
import java.util.*;

public class Juego {

    private String nombre;

    private double precio;

    private double peso;

    public String fechapublicacion;

    public Resenia resenias[];

    public Juego(String nombre, double precio, double peso, String fechapublicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fechapublicacion = fechapublicacion;
        this.resenias = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double value) {
        this.precio = value;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double value) {
        this.peso = value;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String value) {
        this.fechapublicacion = value;
    }

    public Resenia[] getResenias() {
        return resenias;
    }

    public void setResenias(Resenia[] value) {
        this.resenias = value;
    }

}
