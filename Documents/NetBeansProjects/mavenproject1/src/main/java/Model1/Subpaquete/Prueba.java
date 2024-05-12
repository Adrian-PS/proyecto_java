
package Model1.Subpaquete;

import Model1.Biblioteca;


public class Prueba {

    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Adrian", "adrianps@medac.es", 0.0, "1234", new Tienda());
        Biblioteca biblio = new Biblioteca(user1);
    }
    
}
