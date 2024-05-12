package Model1;

import Model1.Subpaquete.Usuario;
import java.util.*;

public class Carrito {

    private Usuario propietario;

    private ArrayList <Juego> listajuegos;

    private double preciototal;

    public Carrito(Usuario propietario) {
        this.propietario = propietario;
        this.preciototal = 0;
        this.listajuegos = new ArrayList<Juego>();
    }

    

    public void aniadirJuego(Juego nuevo) {
        this.listajuegos.add(nuevo);
        System.out.println("Se ha añadido "+nuevo.getNombre()+" al carrito.");
        this.preciototal+=nuevo.getPrecio();
    }

    public void vaciarCarrito() {
        listajuegos.clear();
        this.preciototal = 0;
    }

    public void efectuarCompra() {
        double saldo = propietario.getSaldo();
        if(saldo >= preciototal){
            for (int i = 0; i < this.listajuegos.size(); i++) {
                propietario.getBiblioteca().aniadirJuego(listajuegos.get(i));
            }
            this.propietario.setSaldo(this.propietario.getSaldo()-this.preciototal);
            vaciarCarrito();
            
        }
    }

    public void eliminarJuego(int indice) {
        this.listajuegos.remove(indice);
    }

    public Usuario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Usuario value) {
        this.propietario = value;
    }

    public ArrayList <Juego> getListajuegos() {
        return listajuegos;
    }

    

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double value) {
        this.preciototal = value;
    }

}
