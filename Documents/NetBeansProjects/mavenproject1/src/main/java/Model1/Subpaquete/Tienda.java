package Model1.Subpaquete;

import Model1.Juego;
import java.util.*;

public class Tienda {

    private ArrayList<Juego> listaJuegos;

    public Tienda() {
        listaJuegos = new ArrayList<Juego>();
       
    }
    public void publicarJuego(Juego nuevo) {
        this.listaJuegos.add(nuevo);
    }

    public void eliminarJuego(int indice) {
        this.listaJuegos.remove(indice);
    }

    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }

    
    
   

}
