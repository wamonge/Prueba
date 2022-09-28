/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rivas
 */
public class Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = 0;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño de la matriz"));
        int suma1 = 0;
        int suma2 = 0;
        int[][] matriz = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor para la fila " + i + " y la columna " + j +" :"));
            }
        }
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i==j) {
                    suma1 = suma1 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i+j)==(tamaño-1)) {
                    suma2 = suma2 + matriz[i][j];
                }
            }
        }
        int total = 0;
        total = suma1 + suma2;
        JOptionPane.showMessageDialog(null, "La suma de la diagonal 1 es de: " + suma1 + "\nLa suma de la diagonal 2 es de: " + suma2 +
                "\nLa suma total (de las dos diagonales) es de: " + total);
    }
    
}
