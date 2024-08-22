package ventavehiculo1;

public class Vehiculo {

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return modelo + "," + marca + ","+ tipo + "," + año + "," + cilindrada + "," + ejes + "," + valor;
    }


    public Vehiculo(String modelo, String marca, String tipo, int año, int cilindrada, int ejes, int valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.año = año;
        this.cilindrada = cilindrada;
        this.ejes = ejes;
        this.valor = valor;

    }
    private String modelo;
    private String marca;
    private String tipo;
    private int año;
    private int cilindrada;
    private int ejes;
    private int valor;

    public Vehiculo(String data) {
        String[] parts = data.split(",");
        this.marca = parts[0];
        this.modelo = parts[1];
        this.tipo = parts[2];
        this.año = Integer.parseInt(parts[3]);
        this.cilindrada = Integer.parseInt(parts[4]);
        this.valor = Integer.parseInt(parts[5]);
        this.ejes = Integer.parseInt(parts[6]);
    }

}
