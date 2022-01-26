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
public class TipoSangre {
    private String codigoSangre;
    private String tipoSangre;

    public TipoSangre() {
    }

    public TipoSangre(String codigoSangre, String tipoSangre) {
        this.codigoSangre = codigoSangre;
        this.tipoSangre = tipoSangre;
    }

    public void setCodigoSangre(String codigoSangre) {
        this.codigoSangre = codigoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getCodigoSangre() {
        return codigoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    
    
}
