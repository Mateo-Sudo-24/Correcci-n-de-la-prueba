package FigurasGeometricas;
import java.lang.Math;
public class Circulo {
    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularPerimetroCiruclo() {
        return (2 * Math.PI * radio);
    }
    public double calcularAreaCiruclo() {
        return Math.PI * radio * radio;
    }

}
