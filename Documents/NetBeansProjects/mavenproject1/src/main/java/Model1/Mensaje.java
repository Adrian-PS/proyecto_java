package Model1;

import Model1.Subpaquete.Usuario;
import java.util.*;

public class Mensaje {

    private Usuario emisor;

    private String contenido;

    private String fechaemision;

    public Mensaje(Usuario emisor, String contenido, String fechaemision) {
        this.emisor = emisor;
        this.contenido = contenido;
        this.fechaemision = fechaemision;
    }

    public void borrarContenido() {
        this.contenido = "";
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario value) {
        this.emisor = value;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String value) {
        this.contenido = value;
    }

    public String getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(String value) {
        this.fechaemision = value;
    }

}
