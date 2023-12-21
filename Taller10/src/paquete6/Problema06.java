/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";
        String estudiante;
        int caracter;
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                estudiante = estudiantes[f][c];
                caracter = estudiante.length();
                if (caracter == 11) {
                    cadena = String.format("%s%s \n", cadena,
                            estudiante);
                }
            }
        }
        System.out.printf("%s", cadena);
    }

}
