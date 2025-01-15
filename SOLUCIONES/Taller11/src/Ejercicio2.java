/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular
 * el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada
 * procedimiento/función debe recibir los datos necesarios y generar el valor
 * correspondiente. Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se
 * llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento
 * obtenerAreaCuadrado.
 *   El área del cuadrado es igual a lado x lado x lado x lado
 *   El área del triángulo es igual a (base x altura)/2
 *   El área del rectángulo es igual a base x altura
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;
public class Ejercicio2 {
    static double rptAreat, rptArear, rptAreac;
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double b, h, l;
        System.out.print("Ingrese base, altura y uno de los lados del cuadrado: ");
        b = tcl.nextDouble();
        h = tcl.nextDouble();
        l = tcl.nextDouble();
        areaTriangulo(b, h);
        System.out.println("El area del triangulo de base: [" + b + "] y altura: [" + h + "] es: " + rptAreat);
        areaRectangulo(b, h);
        System.out.println("El area del rectangulo base: [" + b + "] y altura: [" + h + "] es: " + rptArear);
        areaCuadrado(l);
        System.out.println("El area del circulo de lado: [" + l + "] es: " + rptAreac);
    }

    public static void areaTriangulo(double base, double altura) {
        rptAreat = (base * altura) / 2;
    }

    public static void areaRectangulo(double lado1, double lado2) {
        rptArear = (lado1 * lado2);
    }

    public static void areaCuadrado(double columna1) {
        rptAreac = (columna1 * columna1 * columna1 * columna1);
    }
}
/**
 * run:
 * Ingrese base, altura y uno de los lados del cuadrado: 3 4 5
 * El area del triangulode base: [3.0] y altura: [4.0] es: 6.0
 * El area del rectangulo base: [3.0] y altura: [4.0] es: 12.0
 * El area del circulo de lado: [5.0] es: 625.0
 * BUILD SUCCESSFUL (total time: 2 seconds)

 */