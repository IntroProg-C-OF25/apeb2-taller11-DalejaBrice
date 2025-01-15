
/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9
 * el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la
 * función se la debe llamar desde un método principal. Los parámetros necesarios
 * para llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double n1, n2, n3, n4, promedio;
        System.out.println("Ingrese sus notas: ");
        n1 = tcl.nextDouble();
        n2 = tcl.nextDouble();
        n3 = tcl.nextDouble();
        n4 = tcl.nextDouble();
        promedio = promedios(n1, n2, n3, n4);
        System.out.println("El promedio es: " + promedio);
        System.out.println("Su promedio es " + notas(promedio));
    }

    public static double promedios(double nt1, double nt2, double nt3, double nt4) {
        return (nt1 + nt2 + nt3 + nt4) / 4;
    }

    public static String notas(double promedio) {
        if (promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else {
            return "Sobresaliente";
        }
    }
}
/**
 * run:
* Ingrese sus notas: 
 * 3,2 4,8 9,10 10
 * El promedio es: 6.775
 * Su promedio es Bueno
 * BUILD SUCCESSFUL (total time: 16 seconds)
 */
