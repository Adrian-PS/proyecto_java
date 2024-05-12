package Model1.Subpaquete;

import java.util.*;

public class Resenia {

    private String comentario;

    private double valoracion;

    private String fechaPublicacion;

    public Resenia(String comentario, double valoracion, String fechaPublicacion) {
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void borrarComentario() {
        this.comentario = "";
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String value) {
        comentario = value;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double value) {
        this.valoracion = value;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String value) {
        this.fechaPublicacion = value;
    }

}
