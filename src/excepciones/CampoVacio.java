/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Javipaur
 */
public class CampoVacio extends Exception {
private String mensaje;

    public CampoVacio() {
        
    }
   
    public CampoVacio(String mensaje) {
        this.mensaje = "El campo "+mensaje+" es obligatorio";
    }

    public String getMensaje() {
        return mensaje;
    }

   

  
   
    
}
