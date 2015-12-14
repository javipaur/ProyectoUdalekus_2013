/*
 * Base de Datos
 */
package oracle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.*;

/**
 * Clase para acceso a la Base de datos ORACLE
 * @author Javipaur
 */
public class Oracle {
private static ArrayList <LineaListado > listaSorteo;
private static Menor men1,men2,men3;
private static Persona perMen1,perMen2,perMen3,per;
private static Tutor tut;
private static Sorteo sorteo;
private static LineaListado lineaListado;
private static Connection conn;
private static CallableStatement cs;
private static String sql;
private static Statement  stmt;
private static ResultSet rset;
private static DatosConsulta daco;

/**
 * Insertar Solicitud datos de Tutor y Menor 1
 * 
 */

    public void InsertarSolicitud(Persona per, Tutor tut, Persona perMen1, Menor men1, Persona perMen2, Menor men2,Persona perMen3, Menor men3,int contadorMenor) 
            throws SQLException{
    Abrirconexion();    
    if(contadorMenor > 0){
        sql="{call insertarSolicitud1("
                + "?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?"
                + ")}";                
        
        stmt = conn.createStatement();
        cs = conn.prepareCall(sql);
        //--Persona Tutor --
        cs.setInt(1,per.getIdPersona());
        cs.setString(2,per.getNombre());
        cs.setString(3,per.getApellido1());
        cs.setString(4,per.getApellido2());
        cs.setString(5,per.getCalle());
        cs.setString(6,per.getNumero());
        cs.setString(7,per.getPiso());
        cs.setString(8,per.getLetra());
        cs.setString(9,per.getMunicipio());
        cs.setString(10,per.getProvincia());
        cs.setString(11,per.getCodPostal());
          //--Tutor Tutor --
        cs.setInt(12,tut.getIdTutor());
        cs.setString(13,tut.getDni());
        cs.setInt(14,tut.getTelefono1());
        cs.setInt(15,tut.getTelefono2());
        cs.setInt(16,tut.getTelefono3());
        cs.setInt(17,tut.getTelefono4());
         //--Persona Menor1 --               
        cs.setInt(18,perMen1.getIdPersona());      
        cs.setString(19,perMen1.getNombre());
        cs.setString(20,perMen1.getApellido1());
        cs.setString(21,perMen1.getApellido2());
        cs.setString(22,perMen1.getCalle());
        cs.setString(23,perMen1.getNumero());
        cs.setString(24,perMen1.getPiso());
        cs.setString(25,perMen1.getLetra());
        cs.setString(26,perMen1.getMunicipio());
        cs.setString(27,perMen1.getProvincia());
        cs.setString(28,perMen1.getCodPostal());
         //--Menor Menor1 -- 
        cs.setInt(29,men1.getIdMenor());
        cs.setString(30,men1.getDni());
        cs.setString(31,men1.getFechaNacimiento());
        cs.setString(32,men1.getCentroEstudios());
        cs.setString(33,men1.getModelo());
       
        cs.execute();
        CerrarConexion();       
    }
 /**
 * Insertar Solicitud datos de  Menor 2
 * 
 */    
     if(contadorMenor > 1){
        sql="{call insertarSolicitud2("
                + "?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?"
                + ")}";                
        stmt = conn.createStatement();
        cs = conn.prepareCall(sql);
               //--Persona Menor2 -- 
        cs.setInt(1,perMen2.getIdPersona());      
        cs.setString(2,perMen2.getNombre());
        cs.setString(3,perMen2.getApellido1());
        cs.setString(4,perMen2.getApellido2());
        cs.setString(5,perMen2.getCalle());
        cs.setString(6,perMen2.getNumero());
        cs.setString(7,perMen2.getPiso());
        cs.setString(8,perMen2.getLetra());
        cs.setString(9,perMen2.getMunicipio());
        cs.setString(10,perMen2.getProvincia());
        cs.setString(11,perMen2.getCodPostal());
         //--Menor Menor2 -- 
        cs.setInt(12,men2.getIdMenor());
        cs.setString(13,men2.getDni());
        cs.setString(14,men2.getFechaNacimiento());
        cs.setString(15,men2.getCentroEstudios());
        cs.setString(16,men2.getModelo());
        cs.execute();
        CerrarConexion();
        
    }
     /**
     * Insertar Solicitud datos de  Menor 3
    * 
    */  
    if(contadorMenor > 2){
        sql="{call insertarSolicitud3("
                + "?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?"
                + ")}";                
        stmt = conn.createStatement();
        cs = conn.prepareCall(sql);
               //--Persona Menor3 -- 
        cs.setInt(1,perMen3.getIdPersona());      
        cs.setString(2,perMen3.getNombre());
        cs.setString(3,perMen3.getApellido1());
        cs.setString(4,perMen3.getApellido2());
        cs.setString(5,perMen3.getCalle());
        cs.setString(6,perMen3.getNumero());
        cs.setString(7,perMen3.getPiso());
        cs.setString(8,perMen3.getLetra());
        cs.setString(9,perMen3.getMunicipio());
        cs.setString(10,perMen3.getProvincia());
        cs.setString(11,perMen3.getCodPostal());
         //--Menor Menor3 -- 
        cs.setInt(12,men3.getIdMenor());
        cs.setString(13,men3.getDni());
        cs.setString(14,men3.getFechaNacimiento());
        cs.setString(15,men3.getCentroEstudios());
        cs.setString(16,men3.getModelo());
        cs.execute();
        CerrarConexion();
      }
     }
    /**
    * Abrir Base de Datos
    * 
    */  
    private void Abrirconexion() {
    try{
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        //conexion ARRIAGA
        conn = DriverManager.getConnection("jdbc:oracle:thin:@server224:1521:orcl","proyecto","proyecto");
        
        //conexion Casa
        //conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Jpalac91");
        // driver@machineName:port:SID           ,  userid,  password
        //System.out.println("Abierta");
       }catch(SQLException e){System.out.println(e.getClass() + e.getMessage());}
      }
    /**
     * Cerrar Conexion
     * 
     */  
    private void CerrarConexion() throws SQLException{
       stmt.close();
    }
    
     /**
     * Insertar datos del Sorteo
     * 
     */  
    public void InsertarSorteo(int numSorteo,int cadencia) throws SQLException{
    Abrirconexion();    
    sql="{call insertarSorteo("
                + "?,?"
                + ")}";               
    stmt = conn.createStatement();
    cs = conn.prepareCall(sql);
     //--Datos Sorteo --
    cs.setInt(1,numSorteo);
    cs.setInt(2,cadencia);
          
    cs.execute();
    CerrarConexion();       
}
     /**
     * Traer datos del Sorteo
     * 
     */  
    public void TraerDatosSorteo() {
    try{
         Abrirconexion();
         stmt = conn.createStatement();
         rset = stmt.executeQuery("select substr(fechasorteo,1,18), numero,cadencia  from Sorteo");
         while (rset.next()){
           sorteo = new Sorteo();
           sorteo.setFechaSorteo(rset.getString(1));
           sorteo.setNumero(rset.getInt(2));
           sorteo.setCadencia(rset.getInt(3));
        }
       CerrarConexion();
      }catch(SQLException e){System.out.println(e.getClass() + e.getMessage());}
   }
    /**
     * Devuelve  Sorteo
     * 
     */  
    public Sorteo getSorteo() {
        return sorteo;
    }
    
     /**
     * Traer tabla Sorteo
     * 
     */  
    public ArrayList<LineaListado> TraerTablaSorteo() {
    
     try {  
         
        listaSorteo = new ArrayList <LineaListado>();
        Abrirconexion();
        //ListadoSorteo
       stmt = conn.createStatement();  
       rset = stmt.executeQuery("select idsolicitud||'-'||secuencia,nordensorteo||'-'||secuencia, substr(fechacita,1,10)||' '|| horacita, z.apellido1||', '||z.apellido2||', '||z.nombre from solicitudes x, menor y, persona z where x.idMenor = y.idmenor and  y.idpersona = z.idpersona");
         while (rset.next()){
           lineaListado = new LineaListado();  
           lineaListado.setNumSolicitud(rset.getString(1));
           lineaListado.setNumOrden(rset.getString(2));
           lineaListado.setCita(rset.getString(3));
           lineaListado.setNombre(rset.getString(4));
           listaSorteo.add(lineaListado);
         // System.out.println ("Traer Sorteo "+rset.getString(1)+" "+rset.getString(2)+" "+rset.getString(3)+" "+rset.getString(4));
        }
         CerrarConexion();
         return listaSorteo;
        }catch(SQLException e){System.out.println(e.getClass() + e.getMessage());}
        return null;
    }
    
    /**
     * Obtener max de solicitudes
     * 
     */  
    public int MaxSolicitudes() {
        int maxSol=0;
        try{
         Abrirconexion();
         stmt = conn.createStatement();
         rset = stmt.executeQuery("select max(idSolicitud) from Solicitudes");
         while (rset.next()){
         maxSol= (rset.getInt(1));
         }
       CerrarConexion();  
       return maxSol;
       }catch(SQLException e){System.out.println(e.getClass() + e.getMessage());}
        return 0;
   }   

     /**
     * Regrabar datos sorteo en solicitudes
     * 
     */  
    
    public void UpdateaSolicitud(int idSolicitud, Integer nOrden, String fechaS, String horaS) throws SQLException {
         Abrirconexion();
     sql="{call  updateSolicitud("
                + "?,?,?,?"
                + ")}";               
    stmt = conn.createStatement();
    cs = conn.prepareCall(sql);
     //--Datos Sorteo --
    cs.setInt(1,idSolicitud);
    cs.setInt(2,nOrden);
    cs.setString(3,fechaS);
    cs.setString(4,horaS);
          
    cs.execute();
    CerrarConexion();    
    
    }
    
    /**
     * Visualizar Solicitud
     * 
     */  
    public boolean VisualizarSolicitud(String Cdni, String Cfecha) throws SQLException {
     try{
       int idTutor=0;  
       Abrirconexion();
       String plantilla ="select dni, "
                 + "nombre||' '||apellido1||' '||apellido2, "
                 + "t.idTutor "
                 + "from Tutor t, Persona p "
                 + "where t.dni= ? "
                 + "and  t.idPersona=p.idPersona";
            PreparedStatement ps = conn.prepareStatement(plantilla);
            ps.setString(1,Cdni);
	    rset=ps.executeQuery();
      while (rset.next()){
         daco =new DatosConsulta();
         daco.setDniT(rset.getString(1));
         daco.setNombreT(rset.getString(2));
         idTutor=(rset.getInt(3));
         }
         if (idTutor == 0) {return false;} 
         plantilla="select distinct nordensorteo,"
                 + "fechaCita||' a las '||HoraCita,"
                 + "TO_CHAR(fechanacimiento,'dd/MM/yyyy'), "
                 + "nombre||' '||apellido1||' '||apellido2, "
                 + "idSolicitud, "
                 + "TO_CHAR(fechaSolicitud,'dd/MM/yyyy') "
                 + "from Solicitudes s, Persona p, Menor m "
                 + "where s.idTutor = ? "
                 + "and m.idPersona = p.idPersona "
                 + "and m.idTutor = s.idTutor ";
         ps = conn.prepareStatement(plantilla);
         ps.setInt(1,idTutor);
         daco.setNombreP2(" ");
         daco.setFechaNacimiento(" ");
         rset=ps.executeQuery();
         while (rset.next()){
            daco.setnOrden(rset.getString(1));
            daco.setCita(rset.getString(2));
           // daco.setFechaNacimiento(rset.getString(3));
            daco.setnSolicitud(rset.getString(5));
            daco.setFechaSolicitud(rset.getString(6));
            if (rset.getString(3).compareTo(Cfecha)== 0){
                daco.setNombreP(rset.getString(4));
                daco.setFechaNacimiento(rset.getString(3));
               }
            else{
                if (daco.getNombreP2()== " ") daco.setNombreP2(rset.getString(4));
                     else
                    daco.setNombreP3(rset.getString(4));
                 
                }
       } 
       //CerrarConexion(); 
       return true;
       }catch(SQLException e){System.out.println(e.getClass() + e.getMessage());}
       return false;   
    }
    /**
     * Devuelve Datos de Consulta
     * 
     */  
    public DatosConsulta getDatosConsulta() {
        return(daco);
    }    
}