import FigurasGeometricas.Circulo;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.Triangulo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----Creación Cuadrado----");
        Cuadrado c1 = new Cuadrado();
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        c1.setLado(sc.nextDouble());
        // Mostrar el lado, área y perímetro del cuadrado
        System.out.println("Lado del cuadrado: " + c1.getLado());
        System.out.println("Área del cuadrado: " + c1.calcularArea());
        System.out.println("Perímetro del cuadrado: " + c1.calcularPerimetro());

        System.out.println("----Creacion Rectangulo-----");
        Rectangulo r1 = new Rectangulo();
        System.out.print("Ingrese el valor del ancho del rectangulo: ");
        r1.setAncho(sc.nextDouble());
        System.out.print("Ingrese el valor del largo del rectangulo: ");
        r1.setLargo(sc.nextDouble());
        // Mostrar el ancho , largo , área y perímetro
        System.out.println("Ancho del rectangulo: " + r1.getAncho());
        System.out.println("Largo del rectangulo: " + r1.getLargo());
        System.out.println("El Area de rectangulo: " + r1.calcularAreaRectangulo());
        System.out.println("El perimetro del rectangulo: " + r1.calcularPerimetroRectangulo());

        System.out.println("----Creacion Circulo----");
        Circulo cir1 = new Circulo();
        System.out.println("Ingrese el valor del radio del cirulo: ");
        cir1.setRadio(sc.nextDouble());
        //Mostrar el radio, area y perimetro del circulo
        System.out.println("Radio del cirulo: " + cir1.getRadio());
        System.out.println("El area del cirulo es: " + cir1.calcularAreaCiruclo());
        System.out.println("El perimetro del cirulo es: " + cir1.calcularPerimetroCiruclo());

        System.out.println("----Creacion Triangulo----");
        Triangulo t1 = new Triangulo();
        System.out.println("Ingrese el valor del lado 1 del triangulo: ");
        t1.setLado1(sc.nextDouble());
        System.out.println("Ingrese el valor del lado 2 del triangulo: ");
        t1.setLado2(sc.nextDouble());
        System.out.println("Ingrese el valor del lado 3 del triangulo: ");
        t1.setLado3(sc.nextDouble());
        // Mostrar los lados del triiangulo, el area y el perimetro
        System.out.println("Lado 1 del triangulo: " + t1.getLado1());
        System.out.println("Lado 2 del triangulo: " + t1.getLado2());
        System.out.println("Lado 3 del triangulo: " + t1.getLado3());
        System.out.println("El perimetro del triangulo es: "+ t1.CalcularPerimetroTriangulo());
        System.out.println("EL Area de triangulo es: "+ t1.CalcularAreaTriangulo());



    }
}