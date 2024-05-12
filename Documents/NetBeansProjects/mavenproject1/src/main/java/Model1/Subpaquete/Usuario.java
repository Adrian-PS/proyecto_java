package Model1.Subpaquete;

import Model1.Biblioteca;
import Model1.Carrito;
import Model1.Chat;
import Model1.Juego;
import Model1.Mensaje;
import java.util.*;

public class Usuario implements UserInterface {

    private String nombre;

    private String email;

    private double saldo;

    private String password;

    private Biblioteca biblioteca;

    private Carrito carrito;

    private ArrayList<Usuario> amigoslista;

    private ArrayList<Chat> chats;
    
    private Tienda tienda;

    public Usuario(String nombre, String email, double saldo, String password , Tienda tienda) {
        this.nombre = nombre;
        this.email = email;
        this.saldo = saldo;
        this.password = password;

        this.biblioteca = new Biblioteca(this);
        this.carrito = new Carrito(this);
        this.amigoslista = new ArrayList<Usuario>();
        this.chats = new ArrayList<Chat>();
        this.tienda = tienda;
    }
    

    public boolean validarUsuario(String nombre , String pass) {
        return nombre.equals(this.nombre) && pass.equals(this.password);
    }

    @Override
    public Juego buscarJuego(int indice) {
        return this.tienda.getListaJuegos().get(indice);
    }

    public Juego obtenerJuego(int indice) {
        return this.carrito.getListajuegos().get(indice);
    }

    public void instalarJuego() {
        System.out.println("Juego instalado");
    }

    @Override
    public void desinstalarJuego() {
        System.out.println("Juego desinstalado");
    }

    @Override
    public void ejecutarJuego() {
        System.out.println("Abriendo el juego");
    }

    @Override
    public void aniadirFavorito(Juego fav) {
        //esto pertenece a biblioteca, no se usara
    }

    @Override
    public void aniadirAmigo(Usuario nuevo) {
        amigoslista.add(nuevo);
    }

    @Override
    public void eliminarAmigo(Usuario aeliminar) {
        amigoslista.remove(aeliminar);
    }

    @Override
    public void bloquearAmigo(Usuario a) {
        System.out.println(a.getNombre()+" ha sido bloqueado");
    }

    public void iniciarChat(Usuario[] miembros) {
       chats.add(new Chat(miembros,"8/4/2024"));
    }

    @Override
    public void enviarMensaje(Chat objetivo,Mensaje nuevo) {
        objetivo.setMensajes(nuevo);
    }

    @Override
    public void escribirResenia(Juego juego, String comentario, double valoracion, String fechapublicacion) {
        Resenia reseniaUser = new Resenia(comentario, valoracion, fechapublicacion);
        boolean dentro=false;
        int i=0;
        do {
            if (juego.getResenias()[i]==null) {
                juego.getResenias()[i]=reseniaUser;
                dentro=true;
            }
        } while (!dentro&&i<juego.getResenias().length);
    }

    public void reembolsarJuego(Juego juego) {
        this.saldo+=juego.getPrecio();
    }

    @Override
    public void darValoracion(Resenia resenia, double valoracion) {
        resenia.setValoracion(valoracion);
    }

    public ArrayList<Usuario> getamigosLista() {
        return this.amigoslista;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    public String getPassword() {
        
        return this.password;
    }

    public void setPassword(String contrasenia) {
        this.password=contrasenia;
    }

    @Override
    public Biblioteca getBiblioteca() {
        return this.biblioteca;
    }

    public void setBiblioteca(Biblioteca biblio) {
        this.biblioteca=biblio;
    }

    @Override
    public Carrito getCarrito() {
        return this.carrito;
    }

    public void setCarrito(Carrito carro) {
        this.carrito=carro;
    }

    public void setAmigoslista(ArrayList<Usuario> nueva) {
        this.amigoslista=nueva;
    }

    @Override
    public ArrayList<Chat> getChats() {
        
        return this.chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats=chats;
    }

}
