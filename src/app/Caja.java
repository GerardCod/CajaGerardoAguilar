package app;

/**
 * Clase para la representación de una caja.
 * @author Gerardo Aguilar
 * @version 1.0  24/01/2022
 */
public class Caja {
    private Double ancho;
    private Double alto;
    private Double profundidad;

    /**
     * Crea una caja vacía.
     */
    public Caja() {
    }

    /**
     * Crea una caja con las medidas enviadas por parámetro.
     * @param ancho ancho de la caja.
     * @param alto altura de la caja.
     * @param profundidad profundidad de la caja.
     */
    public Caja(Double ancho, Double alto, Double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * Realiza el cálculo del volumen de la caja con base en la fórmula V = l * b * h
     * @return el volumen de la caja.
     */
    public Double obtenerVolumen() {
        return ancho * alto * profundidad;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", profundidad=" + profundidad +
                '}';
    }
}
