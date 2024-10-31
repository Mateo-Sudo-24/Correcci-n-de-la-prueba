package FigurasGeometricas;

public class Rectangulo {
    private double ancho;
    private double largo;

    public Rectangulo() {
        this.ancho = 0.0;
        this.largo = 0.0;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double calcularPerimetroRectangulo() {
        return  2*ancho + 2*largo;
    }
    public double calcularAreaRectangulo() {
        return ancho * largo;
    }
}
