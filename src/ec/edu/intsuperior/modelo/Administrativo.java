/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Nelson
 */
public class Administrativo extends Persona {
    private Area area;
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(Area area, String cargo) {
        this.area = area;
        this.cargo = cargo;
    }

    public Administrativo(Area area, String cargo, String cedula, String apellido1, String apellido2, String nombre1, String nombre2, String email, String telefono, Date fechaNacimiento, TipoSangre tipoSangre, Ciudad ciudad) {
        super(cedula, apellido1, apellido2, nombre1, nombre2, email, telefono, fechaNacimiento, tipoSangre, ciudad);
        this.area = area;
        this.cargo = cargo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
