/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";
        char[][] letra = new char[4][2];
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                letra[f][c] = estudiantes[f][c].charAt(0);
                switch (letra[f][c]) {
                    case 'S':
                    case 'P':
                    case 'T':
                        cadena = String.format("%s%s\n", cadena,
                                estudiantes[f][c]);

                        break;
                }
            }
        }
        System.out.printf("%s", cadena);

    }

}
