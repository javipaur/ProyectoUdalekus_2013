/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javipaur
 */
public class LineaListado {
 private  String numSolicitud;
 private  String numOrden;
 private  String cita; 
 private  String nombre;

    public LineaListado() {
    }

    public String getCita() {
        return cita;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public String getNumSolicitud() {
        return numSolicitud;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    public void setNumSolicitud(String numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public LineaListado(String numSolicitud, String numOrden, String cita, String nombre) {
        this.numSolicitud = numSolicitud;
        this.numOrden = numOrden;
        this.cita = cita;
        this.nombre = nombre;
    }

}
