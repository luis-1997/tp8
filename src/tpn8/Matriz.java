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
        int x[][];

        x = new int[4][];

        x[0] = new int[4];
        x[1] = new int[3];
        x[2] = new int[5];
        x[3] = new int[2];

        x[0][0] = 3;
        x[0][1] = 6;
        x[0][2] = 9;
        x[0][3] = 12;

        x[1][0] = 15;
        x[1][1] = 18;
        x[1][2] = 21;

        x[2][0] = 24;
        x[2][1] = 27;
        x[2][2] = 30;
        x[2][3] = 33;
        x[2][4] = 36;

        x[3][0] = 39;
        x[3][1] = 42;

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
