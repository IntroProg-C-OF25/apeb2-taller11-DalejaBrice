/**
 * Generar los procedimientos y/o funciones que impriman los valor pares,
 * impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) 
 * o método(s) deben ser invocados desde el método principal (quien es el único 
 * responsable de gestionar las entradas/salidas); además el método debe recibir 
 * como parámetro un arreglo bidimensional.
 * @author Daniela Briceño
 */
import java.util.Scanner ;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFilas = 0, limColum = 0;
        System.out.print("Inrese el limite de filas y columnas: ");
        limFilas = tcl.nextInt();
        limColum = tcl.nextInt();
        int matriz[][] = new int[limFilas][limColum];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedio(matriz);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("ELEMENTOS PARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" ") : " ");
                /*if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j]+ " ");
                }*/
            }
            System.out.println("");
        }
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + (" ") : " ");
                /*if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j]+ " ");
                }*/
            }
            System.out.println("");
        }
    }

    public static void presentarPromedio(int matriz[][]) {
        int sumaMatriz = 0, prom = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        prom = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("PROMEDIO DE LA MATRIZ: " + prom);
    }

}
/**
 * run:
 * Inrese el limite de filas y columnas: 3 3
 * MATRIZ GENERADA: 
 * 5 3 2 
 * 0 1 5 
 * 2 5 9 
 * ELEMENTOS PARES DE LA MATRIZ
 *   2 
 * 0   
 * 2   
 * ELEMENTOS IMPARES DE LA MATRIZ
 * 5 3  
 *  1 5 
 *  5 9 
 * PROMEDIO DE LA MATRIZ: 3
 BUILD SUCCESSFUL (total time: 2 seconds)

 */