/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn8;

/**
 *
 * @author LuisPc-Master
 */
public class Matriz {

    public void armar() {

        int[][] x = {{3, 6, 9, 12}, {15, 18, 21}, {24, 27, 30, 33, 36}, {39, 42}};

        for (int filas = 0; filas < x.length; filas++) {

            for (int columnas = 0; columnas < x[filas].length; columnas++) {
                System.out.print(x[filas][columnas] + " ");

            }

            System.out.println();

        }

        System.out.println("----------------------------");

        int num = 0;

        for (int filas = 0; filas < x.length; filas++) {
            num = num + 1;
            System.out.print("Fila " + num + "-->");

            for (int columnas = 0; columnas < x[filas].length; columnas++) {

                if (x[filas][columnas] % 2 == 0) {

                    System.out.print(x[filas][columnas] + " ");

                }

            }
            System.out.println();

        }
    }

}
