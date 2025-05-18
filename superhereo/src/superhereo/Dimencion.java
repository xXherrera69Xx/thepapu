package superhereo;

public class Dimencion {

    private double alto;
    private double ancho;
    private double profundidad;

    // Constructor
    public Dimencion() {
        this.alto = 0.0;
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }


    public Dimencion(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    // Getters
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    // Setters
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }


    public double getVolumen() {
        return alto * ancho * profundidad;
    }


    @Override
    public String toString() {
        return "Alto: " + alto + " cm\n" +
               "Ancho: " + ancho + " cm\n" +
               "Profundidad: " + profundidad + " cm\n" +
               "Volumen máximo: " + getVolumen() + " cm³";
    }
}
