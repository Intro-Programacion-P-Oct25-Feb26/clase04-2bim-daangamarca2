/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo045 {

    public static void main(String[] args) {
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3;
        arreglo3 = obtenerMatriz(arreglo1, arreglo2);
        double[][] arreglo4;
        arreglo4 = obtenerMatriz2(arreglo1, arreglo2);

        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
    }

    public static int[][] obtenerMatriz(int[][] a, int[][] b) {
        int[][] z = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                z[i][j] = obtenerMultiplicacion(a[i][j], b[i][j]);
            }
        }
        return z;
    }

    public static int[][] obtenerMatriz2(int[][] a, int[][] b) {
        int[][] z2 = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                z2[i][j] = obtenerMultiplicacion(a[i][j], b[i][j]);
            }
        }
        return z2;
    }
    
    public static void obtenerReporte(int[][] matriz) {
        String cadena = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                cadena = String.format("%s%d\t", cadena, matriz[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        return a * b;
    }

    public static int obtenerPotencia(int a, int b) {
        double potencia;
        potencia = Math.pow(a, b);
        return (int) potencia;
    }
}
