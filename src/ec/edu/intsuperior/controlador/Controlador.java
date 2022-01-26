/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Alumno;
import ec.edu.intsuperior.modelo.Region;
import ec.edu.intsuperior.modelo.TipoSangre;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nelson
 */
public class Controlador {
    Alumno alumno= new Alumno();
    Region region= new Region();
   static Scanner leer= new Scanner(System.in);
    
    public static void menu(){
        int op=0;
        do {            
            System.out.println("Ingresa una opción: \n"
                + "1.- Crear Región\n"
                + "2.- Crear Provincia....\n"
                + "0.- Salir");
            op=leer.nextInt();
                    
        } while (op!=0);
        
    }
     ArrayList<TipoSangre> listadoTipo= new ArrayList<>();
     
    public void ingresarTiposSangre(TipoSangre tipo){
       listadoTipo.add(tipo);
    }
  
}
