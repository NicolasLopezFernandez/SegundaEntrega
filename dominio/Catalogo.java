package dominio;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class Catalogo implements Serializable{
    private ArrayList<Producto> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }
    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void annadirOrdenador(Producto producto) {
        catalogo.add(producto);
        System.out.println("Ordenador añadido al catalogo: " + producto);
    }
    public void annadirMovil(Producto moviles) {
        catalogo.add(moviles);
        System.out.println("Movil añadido al catalogo: "+ moviles);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de Ordenadores:");
            for (Producto producto : catalogo) {
                producto.mostrarInformacion();
            }
            for (Producto moviles : catalogo) {
                moviles.mostrarInformacion();
            }
        }
    }
    public static void grabar(Catalogo catalogo){
        try{
            ObjectOutputStream fo=new ObjectOutputStream (new FileOutputStream("catalogo.ser"));
            fo.writeObject(catalogo);
            fo.close();
        } catch (Exception e){
            System.out.println("error de escritura");
        }
    }
    public static Catalogo leer(){
        try{
            ObjectInputStream fi=new ObjectInputStream(new FileInputStream("catalogo.ser"));
            Catalogo c= (Catalogo) fi.readObject();
            fi.close();
            return c;
        } catch (Exception e){
            return new Catalogo();
        }
    }
}