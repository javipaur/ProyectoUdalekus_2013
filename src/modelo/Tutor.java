/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Javipaur
 */
public class Tutor extends Persona{
   private Integer idTutor;         
   private String dni;             
   private Integer telefono1;       
   private Integer telefono2;       
   private Integer telefono3;       
   private Integer telefono4;      
   

    public Tutor() {
    }

    public Tutor(Integer idTutor, String dni, Integer telefono1, Integer telefono2, Integer telefono3, Integer telefono4) {
        this.idTutor = idTutor;
        this.dni = dni;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.telefono3 = telefono3;
        this.telefono4 = telefono4;
    }

    
    
    public Integer getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Integer idTutor) {
        this.idTutor = idTutor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(Integer telefono1) {
        this.telefono1 = telefono1;
    }

    public Integer getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(Integer telefono2) {
        this.telefono2 = telefono2;
    }

    public Integer getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(Integer telefono3) {
        this.telefono3 = telefono3;
    }

    public Integer getTelefono4() {
        return telefono4;
    }

    public void setTelefono4(Integer telefono4) {
        this.telefono4 = telefono4;
    }
    
    

   
}
