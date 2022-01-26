/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelson
 */
public class Aplicacion {

    static ArrayList<Integer> listaNumeros = new ArrayList<>();

    public static void main(String[] args) {
        AplicacionAdministrativo administrativo= new AplicacionAdministrativo();
        administrativo.setVisible(true);
    }

//        String op;
//        do {
//            op = JOptionPane.showInputDialog("Ingresa una opción:\n"
//                    + "1.- Ingresar Numeros\n"
//                    + "2.- Mostrar Numeros del ArrayList\n"
//                    + "3.- Promedio numeros\n"
//                    + "4.- Salir");
//            switch (op) {
//                case "1":
//                    ingresarNumeros();
//                    break;
//                case "2":
//                    mostrarNumeros();
//                    break;
//                case "3":
//                    promedioNumeros();
//                    break;
//
//            }
//
//        } while (!op.equals("4"));
//
//    }
//
//    public static void ingresarNumeros() {
//        try {
//            listaNumeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero a la lista")));
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void mostrarNumeros() {
//       JOptionPane.showMessageDialog(null,listaNumeros.toString());
//
//    }
//
//    public static void promedioNumeros() {
//        int acu=0;
//        for (Integer valor : listaNumeros) {
//            acu+=valor;
//            
//        }
//        System.out.println("la suma total es: "+acu);
//
//    }
}
