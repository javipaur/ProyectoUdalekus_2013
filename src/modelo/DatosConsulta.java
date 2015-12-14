/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jpalac
 */
public class DatosConsulta {
  
 private String  dniT;            
 private String  nombreT; 
 private String  fechaNacimiento;  
 private String  nombreP;
 private String  nSolicitud; 
 private String  fechaSolicitud;  
 private String  nombreP2; 
 private String  nombreP3;
 private String  nOrden;
 private String  cita;

    public String getCita() {
        return cita;
    }

    public String getDniT() {
        return dniT;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getNombreP2() {
        return nombreP2;
    }

    public String getNombreP3() {
        return nombreP3;
    }

    public String getNombreT() {
        return nombreT;
    }

    public String getnOrden() {
        return nOrden;
    }

    public String getnSolicitud() {
        return nSolicitud;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public void setDniT(String dniT) {
        this.dniT = dniT;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setNombreP2(String nombreP2) {
        this.nombreP2 = nombreP2;
    }

    public void setNombreP3(String nombreP3) {
        this.nombreP3 = nombreP3;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public void setnOrden(String nOrden) {
        this.nOrden = nOrden;
    }

    public void setnSolicitud(String nSolicitud) {
        this.nSolicitud = nSolicitud;
    }

    public DatosConsulta() {
    }

    public DatosConsulta(String dniT, String nombreT, String fechaNacimiento, String nombreP, String nSolicitud, String fechaSolicitud, String nombreP2, String nombreP3, String nOrden, String cita) {
        this.dniT = dniT;
        this.nombreT = nombreT;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreP = nombreP;
        this.nSolicitud = nSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.nombreP2 = nombreP2;
        this.nombreP3 = nombreP3;
        this.nOrden = nOrden;
        this.cita = cita;
    }
 
}
  