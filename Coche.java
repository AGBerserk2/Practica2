public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private int velocidad;

    public Coche() {
    }

    public void frenar() {
        velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public double acelerar(double velocidad) {
        this.velocidad += velocidad;

        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
