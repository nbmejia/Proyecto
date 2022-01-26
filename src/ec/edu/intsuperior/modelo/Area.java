/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Nelson
 */
public class Area {
    private String codigoArea;
    private String nombreArea;

    public Area() {
    }

    public Area(String codigoArea, String nombreArea) {
        this.codigoArea = codigoArea;
        this.nombreArea = nombreArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }
    
    
    
}
