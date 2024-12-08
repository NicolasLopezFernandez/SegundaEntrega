package Interfaz;
import dominio.*;

import java.util.Scanner;

public class Interfaz {
    private Catalogo catalogo;
    private Scanner scanner;

    public Interfaz() {
        this.catalogo = new Catalogo();
        this.scanner = new Scanner(System.in);
        Catalogo c = Catalogo.leer();
    }

public void menu() {
    int opc;
    do {
        System.out.println("1. Añadir Ordenador\n2. Lista de Ordenadores\n3. Añadir Movil\n4. Lista de Moviles\n5. Quitar Producto\n6. Modificar Producto\n7. Salir\nSelecciona un número de operación: ");
        opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc) {
            case 1:
                annadir();
                break;
            case 2:
                catalogo.mostrarCatalogo();
                break;
            case 3:
                annadir2();
                break;
            case 4:
                catalogo.mostrarCatalogo();
                break;
            case 5:
                quitar();
                break;
            case 6:
                modificar();
                break;
            case 7:
                System.out.println("Saliendo del programa");
                Catalogo.grabar(catalogo);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    } while (opc != 7);
}

public void quitar() {
    System.out.println("Introduce el índice del producto a quitar: ");
    int index = scanner.nextInt();
    scanner.nextLine();
    if (index >= 0 && index < catalogo.getCatalogo().size()) {
        catalogo.getCatalogo().remove(index);
        System.out.println("Producto eliminado.");
    } else {
        System.out.println("Índice no válido.");
    }
}

public void modificar() {
    System.out.println("Introduce el índice del producto a modificar: ");
    int index = scanner.nextInt();
    scanner.nextLine();
    if (index >= 0 && index < catalogo.getCatalogo().size()) {
        Producto producto = catalogo.getCatalogo().get(index);
        System.out.println("Introduce la nueva marca: ");
        String marca = scanner.nextLine();
        producto.setMarca(marca);

        System.out.println("Introduce la nueva cpu: ");
        String cpu = scanner.nextLine();
        producto.setCPU(cpu);

        System.out.println("Introduce la nueva gpu: ");
        String gpu = scanner.nextLine();
        producto.setGPU(gpu);

        System.out.println("Introduce la nueva ram (GB): ");
        int ram = scanner.nextInt();
        producto.setRAM(ram);

        System.out.println("Producto modificado.");
    } else {
        System.out.println("Índice no válido.");
    }
}

    public void annadir(){
        System.out.println("Introduce la marca: ");
        String marca = scanner.nextLine();
        System.out.println("Marca introducida: " + marca);

        System.out.println("Introduce la cpu: ");
        String cpu = scanner.nextLine();
        System.out.println("cpu introducida: " + cpu);

        System.out.println("Introduce la gpu: ");
        String gpu = scanner.nextLine();
        System.out.println("gpu introducida: " + gpu);

        System.out.println("Introduce la ram (GB): ");
        int ram = scanner.nextInt();
        System.out.println("ram introducida: " + ram);

        Producto newproducto = new Producto(marca, cpu, gpu, ram);
        catalogo.annadirOrdenador(newproducto);
    }
    public void annadir2 (){
        System.out.println("Introduce la marca: ");
        String marca = scanner.nextLine();
        System.out.println("Marca introducida: " + marca);

        System.out.println("Introduce la cpu: ");
        String cpu = scanner.nextLine();
        System.out.println("cpu introducida: " + cpu);

        System.out.println("Introduce la gpu: ");
        String gpu = scanner.nextLine();
        System.out.println("gpu introducida: " + gpu);

        System.out.println("Introduce la ram (GB): ");
        int ram = scanner.nextInt();
        System.out.println("ram introducida: " + ram);

        System.out.println("Introduce el precio ($): ");
        int precio = scanner.nextInt();
        System.out.println("Cuesta: " + precio);

        Producto newmoviles = new Moviles(marca, cpu, gpu, ram,precio);
        catalogo.annadirMovil(newmoviles);
    }
}
