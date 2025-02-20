public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        coche1.setAño(2012);
        coche1.setMarca("HONDA");
        coche1.setModelo("ACCORD");
        coche1.acelerar();
        coche1.mostrarDatos();
        coche1.frenar();
        coche1.mostrarDatos();
        Coche coche2 = new Coche("TOYOTA", "HIGHLANDER");
        
        coche2.setAño(2020);
        coche2.acelerar(35);
        coche2.mostrarDatos();
        coche2.frenar();
        coche2.mostrarDatos();
        
        Coche coche3 = new Coche("CHEVROLET", "CAMARO", 2010, 75);
        coche3.mostrarDatos();
        coche3.frenar();
        coche3.mostrarDatos();
    }
}