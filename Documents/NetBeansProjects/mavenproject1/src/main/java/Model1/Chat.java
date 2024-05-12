package Model1;

import Model1.Subpaquete.Usuario;
import java.util.*;

public class Chat {

    private Usuario miembros[];

    private ArrayList<Mensaje> mensajes;

    private String fechaCreacion;

    public Chat(Usuario[] miembros, String fechaCreacion) {
        this.miembros = miembros;
        this.mensajes = new ArrayList<>();
        this.fechaCreacion = fechaCreacion;
    }

    public Mensaje getMensaje(int indice) {
        return mensajes.get(indice);
    }

    public void borrarMensaje(int indice) {
        this.mensajes.get(indice);
    }

    public Usuario[] getMiembros() {
        return miembros;
    }

    public void setMiembros(Usuario[] value) {
        this.miembros = value;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(Mensaje value) {
        mensajes.add(value);
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String value) {
        this.fechaCreacion = value;
    }

}
