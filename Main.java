import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        int velocidad;
        Scanner scan = new Scanner(System.in);

        coche.setMarca("TOYOTA");
        coche.setAño(2010);
        coche.setModelo("CAMRY");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Velocidad: " + coche.getVelocidad());

        coche.acelerar();
        System.out.println("Velocidad: " + coche.getVelocidad());
        
        System.out.println("Ingrese la Velocidad que desea aumentar");
        velocidad = scan.nextInt();
        coche.acelerar(velocidad);
        
        System.out.println("Velocidad: " + coche.getVelocidad());
        coche.frenar();
        
        System.out.println("Velocidad: " + coche.getVelocidad());

        scan.close();
    }
}