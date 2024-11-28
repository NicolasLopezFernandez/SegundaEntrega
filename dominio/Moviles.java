package dominio;

public class Moviles extends Producto{
    private int precio;

    public Moviles(String Marca, String GPU, String CPU, int RAM , int precio) {
        super(Marca, GPU, CPU, RAM);
        this.precio = precio;
    }

    public Moviles(String Marca, String GPU, String CPU, int RAM) {
        super(Marca, GPU, CPU, RAM);
    }

    public void setPrecio(){
        precio = precio;
    }
    public int getPrecio (){
        return precio;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + Marca + "GPU: " + GPU + "CPU: " + CPU + "RAM: " + RAM +"Precio: "+precio);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(Marca).append("GPU: ").append(GPU).append("CPU: ").append(CPU).append("RAM: ").append(RAM).append("Precio: ").append(precio);
        return sb.toString();
    }
}

