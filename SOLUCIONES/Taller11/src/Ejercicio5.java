
import java.util.Scanner;

/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author Daniela Briceño
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f1, f2, c1, c2;
        System.out.print("Ingrese las filas y columnas de la primera matriz: ");
        f1 = tcl.nextInt();
        c1 = tcl.nextInt();
        System.out.print("Ingrese las filas y columnas de la segunda matriz: ");
        f2 = tcl.nextInt();
        c2 = tcl.nextInt();
        int matriz[][] = new int[f1][c1];
        int matriz2[][] = new int[f2][c2];
        matrices(matriz, matriz2);
        suma(matriz, matriz2, f1, c1, f2, c2);
        resta(matriz, matriz2, f1, c1, f2, c2);
        multiplicacion(matriz, matriz2, f1, c1, f2, c2);
    }
    
    public static void matrices(int matriz[][], int matriz2[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void suma(int matriz[][], int matriz2[][], int f1, int c1, int f2, int c2) {
        if (f1 == f2 && c1 == c2) {
            int plus[][] = new int[f1][c1];
            System.out.println("Suma de las Matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    plus[i][j] = matriz[i][j] + matriz2[i][j];
                    System.out.print(plus[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void resta(int matriz[][], int matriz2[][], int f1, int c1, int f2, int c2) {
        if (f1 == f2 && c1 == c2) {
            int minus[][] = new int[f1][c1];
            System.out.println("Resta de las Matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    minus[i][j] = matriz[i][j] - matriz2[i][j];
                    System.out.print(minus[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void multiplicacion(int matriz[][], int matriz2[][], int f1, int c1, int f2, int c2) {
        if (c1 == f2) {
            int times[][] = new int[f1][c2];
            System.out.println("Multiplicacion de Matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz[0].length; k++) {
                        times[i][j] += matriz[i][k] * matriz[k][j];
                    }
                    
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("No se pueden multiplicar");
        }
    }
}
/***
 * run:
 * Ingrese las filas y columnas de la primera matriz: 3 3
 * Ingrese las filas y columnas de la segunda matriz: 3 3
 * Matriz 1
 * 5 0 4  
 * 0 9 9  
 * 2 3 8  
 * Matriz 2
 * 5 4 5  
 * 0 8 7  
 * 5 4 8  
 * Suma de las Matrices
 * 10 4 9  
 * 0 17 16  
 * 7 7 16  
 * Resta de las Matrices
 * 0 -4 -1  
 * 0 1 2  
 * -3 -1 0  
 * Multiplicacion de Matrices
 * 33 12 52  
 * 18 108 153  
 * 26 51 99  
 * BUILD SUCCESSFUL (total time: 5 seconds)
 */