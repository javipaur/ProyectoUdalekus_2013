/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Javipaur
 */
public class Solicitud {
  private Integer idSolicitud;   
  private Integer secuencia;      
  private Date fechaSolicitud; 
  private Integer nOrdenSorteo;   
  private Date fechaCita;      
  private String horaCita;  

    public Solicitud() {
    }

    public Solicitud(Integer idSolicitud, Integer secuencia, Date fechaSolicitud, Integer nOrdenSorteo, Date fechaCita, String horaCita) {
        this.idSolicitud = idSolicitud;
        this.secuencia = secuencia;
        this.fechaSolicitud = fechaSolicitud;
        this.nOrdenSorteo = nOrdenSorteo;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getnOrdenSorteo() {
        return nOrdenSorteo;
    }

    public void setnOrdenSorteo(Integer nOrdenSorteo) {
        this.nOrdenSorteo = nOrdenSorteo;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
  
  
}
