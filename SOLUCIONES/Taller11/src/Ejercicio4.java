
/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro
 * procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del
 * cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor
 * del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el
 * siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar
 * el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para
 * obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera
 * el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado
 * en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento
 * calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se
 * necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @author Daniela Briceño
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombres;
        int ced, opt;
        double val, numk, inmu;
        System.out.print("Ingrese su nombre y apellido: ");
        nombres = tcl.nextLine();
        System.out.print("Ingrese su numero de cedula: ");
        ced = tcl.nextInt();
        System.out.println("Que desea hacer?");
        System.out.println("1. Revisar su planilla de luz");
        System.out.println("2. Precio Inmueble");
        System.out.print("Ingrese la opcion: ");
        opt = tcl.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Ingrese el valor del kilowaltio: ");
                val = tcl.nextDouble();
                System.out.print("Ingrese el numero de kilowaltios al mes: ");
                numk = tcl.nextDouble();
                System.out.println("Cliente " + nombres + " con cedula " + ced + " debe cancelar el valor de $" + valLuz(val, numk));
                break;
            case 2:
                System.out.print("Ingrese el valor del inmueble: ");
                inmu = tcl.nextDouble();
                System.out.println("Cliente " + nombres + " con cedula " + ced + " tiene un inmueble valorado en $" + inmu + " y tiene que pagar de precio $" + calcPrecio(inmu));
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }

    public static double valLuz(double val, double numk) {
        return (val * numk);
    }

    public static double calcPrecio(double inmu) {
        return (inmu - (inmu * 0.02));
    }
}
/**
 * run:
 * Ingrese su nombre y apellido: Daniela Briceno
 * Ingrese su numero de cedula: 1106076845
 * Que desea hacer?
 * 1. Revisar su planilla de luz
 * 2. Precio Inmueble
 * Ingrese la opcion: 1
 * Ingrese el valor del kilowaltio: 23
 * Ingrese el numero de kilowaltios al mes: 100
 * Cliente Daniela Briceno con cedula 1106076845 debe cancelar el valor de $2300.0
 * BUILD SUCCESSFUL (total time: 18 seconds)
 */
/**
 * run:
 * Ingrese su nombre y apellido: Daniela Briceno
 * Ingrese su numero de cedula: 1106076845
 * Que desea hacer?
 * 1. Revisar su planilla de luz
 * 2. Precio Inmueble
 * Ingrese la opcion: 2
 * Ingrese el valor del inmueble: 30000
* Cliente Daniela Briceno con cedula 1106076845 tiene un inmueble valorado en $30000.0 y tiene que pagar de precio $29400.0
* BUILD SUCCESSFUL (total time: 21 seconds)
 */