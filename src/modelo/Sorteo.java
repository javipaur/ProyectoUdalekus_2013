/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Timestamp;

/**
 *
 * @author javipaur
 */
public class Sorteo {
 private  String fechaSorteo;
 private  Integer numero;
 private  Integer cadencia; 

public Sorteo() {
    }

    public Integer getCadencia() {
        return cadencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setCadencia(Integer cadencia) {
        this.cadencia = cadencia;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(String fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public Sorteo(String fechaSorteo, Integer numero, Integer cadencia) {
        this.fechaSorteo = fechaSorteo;
        this.numero = numero;
        this.cadencia = cadencia;
    }

}
