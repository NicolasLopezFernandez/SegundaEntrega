package dominio;

public class Producto {
    protected String GPU;
    protected String CPU;
    protected String Marca;
    protected int RAM;

    public Producto(String Marca, String GPU, String CPU, int RAM) {
        this.Marca = Marca;
        this.GPU = GPU;
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public void setMarca(String marca) {
        Marca = Marca;
    }

    public void setCPU(String CPU) {
        CPU = CPU;
    }

    public void setGPU(String GPU) {
        GPU = GPU;
    }

    public void setRAM(int RAM) {
        RAM = RAM;
    }

    public String getMarca() {
        return Marca;
    }

    public String getGPU() {
        return GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + Marca + " GPU: " + GPU + " CPU: " + CPU + " RAM: " + RAM);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(Marca).append(" GPU: ").append(GPU).append(" CPU: ").append(CPU).append(" RAM: ").append(RAM);
        return sb.toString();
    }
}
