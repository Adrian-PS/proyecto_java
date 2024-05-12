package Model1;

import Model1.Subpaquete.Usuario;
import java.util.*;

public class Biblioteca {
    private Usuario propietario;

    private ArrayList <Juego> listajuegos;

    private ArrayList <Juego> favoritos;

    public Biblioteca(Usuario propietario) {
        this.propietario = propietario;
        listajuegos = new ArrayList<Juego>();
        favoritos = new ArrayList<Juego>();
    }

    public void aniadirJuego(Juego nuevo) {
        
        if (buscarJuego(nuevo)) {
            this.listajuegos.add(nuevo);
            System.out.println("El juego "+nuevo.getNombre()+" ha sido añadido a la biblioteca.");
        }
        else{
            System.out.println("El juego "+nuevo.getNombre()+" no se ha añadido");
        }    
    }
    
    private boolean buscarJuego(Juego nuevo){
        boolean encontrado=false;
        
        if (propietario.getCarrito().getListajuegos().contains(nuevo)) {
            encontrado=true;
            
        }
        return encontrado;
    }

    public void vaciarBiblioteca() {
        listajuegos.clear();
    }

    public void eliminarJuego(int indice) {
        listajuegos.remove(indice);
    }

    public Usuario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Usuario value) {
        this.propietario = value;
    }

    public ArrayList <Juego> getListajuegos() {
        return this.listajuegos;
    }

    public ArrayList <Juego> getFavoritos() {
        return favoritos;
    }

    

}
