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
public class Menor extends Persona{
 private Integer idMenor;       
 private String  dni;            
 private String  fechaNacimiento; 
 private String  centroEstudios;  
 private String  modelo;          
    

    public Menor() {
    }

    public Menor(Integer idMenor, String dni, String fechaNacimiento, String centroEstudios, String modelo) {
        this.idMenor = idMenor;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.centroEstudios = centroEstudios;
        this.modelo = modelo;
    }

    public Integer getIdMenor() {
        return idMenor;
    }

    public void setIdMenor(Integer idMenor) {
        this.idMenor = idMenor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public void setCentroEstudios(String centroEstudios) {
        this.centroEstudios = centroEstudios;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
