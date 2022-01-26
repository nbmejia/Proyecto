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
public class Provincia {
    private String idProvincia;
    private String nombreProvincia;
    private Region region;

    public Provincia() {
    }

    public Provincia(String idProvincia, String nombreProvincia, Region region) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.region = region;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
    
}
