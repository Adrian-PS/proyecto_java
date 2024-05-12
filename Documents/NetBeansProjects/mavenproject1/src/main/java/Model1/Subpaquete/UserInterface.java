/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model1.Subpaquete;

import Model1.Biblioteca;
import Model1.Carrito;
import Model1.Chat;
import Model1.Juego;
import Model1.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public interface UserInterface {

    void aniadirAmigo(Usuario nuevo);

    void aniadirFavorito(Juego fav);

    void bloquearAmigo(Usuario a);

    Juego buscarJuego(int indice);

    void darValoracion(Resenia resenia, double valoracion);

    void desinstalarJuego();

    void ejecutarJuego();

    void eliminarAmigo(Usuario aeliminar);

    void enviarMensaje(Chat objetivo, Mensaje nuevo);

    void escribirResenia(Juego juego, String comentario, double valoracion, String fechapublicacion);

    Biblioteca getBiblioteca();

    Carrito getCarrito();

    ArrayList<Chat> getChats();
    
}
