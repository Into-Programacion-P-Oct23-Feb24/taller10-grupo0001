/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double total = 0;
        double[][] ventas = new double[2][5];
        for (int f = 0; f < ventas.length; f++) {
            System.out.println("Ingrese las ventas diarias de 5 dias de "
                    + vendedores[f]);
            for (int c = 0; c < ventas[f].length; c++) {
                ventas[f][c] = entrada.nextDouble();
            }
        }
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                total = total + ventas[f][c];
            }
        }
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa realizado "
                + "un total de %.2f en ventas.\n", vendedores[0], vendedores[1],
                total);
    }
}
