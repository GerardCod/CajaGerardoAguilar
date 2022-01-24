package app;

/**
 * Clase principal para validar el funcionamiento de la caja.
 */
public class CajaMain {
    public static void main(String[] args) {
        Caja caja = new Caja();
        caja.setAncho(3.0);
        caja.setAlto(6.0);
        caja.setProfundidad(9.0);

        System.out.println("Volumen de la caja 1: " + caja.obtenerVolumen());

        Caja caja2 = new Caja(4.0, 2.0, 8.0);
        System.out.println("Volumen de la caja 2: " + caja2.obtenerVolumen());
    }
}
