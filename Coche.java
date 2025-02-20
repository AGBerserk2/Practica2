class Coche
{
    private String marca;
    private String modelo;
    private int año;
    private double velocidad;
    
    public Coche()
    {
    
    }
    
    public Coche(String marca,String modelo)
    {
       this.marca = marca;
       this.modelo = modelo;
    }
    
    public Coche(String marca,String modelo,int año,double velocidad )
    {
       this.marca = marca;
       this.modelo = modelo;
       this.año = año;
       this.velocidad = velocidad;
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
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public void acelerar()
    {
        velocidad += 10;
    }
    
    public void acelerar(double velocidad)
    {
        this.velocidad += velocidad;
    }
    
    public void frenar()
    {
        velocidad = 0;
    }

    public void mostrarDatos()
    {
        System.out.println("Marca del auto: "+getMarca());
        System.out.println("Modelo del auto: "+getModelo());
        System.out.println("Año del auto: "+getAño());
        System.out.println("Velocidad del auto: "+getVelocidad()+ " Km/h");
        System.out.println("--------------------------------------------");
    }
    
}