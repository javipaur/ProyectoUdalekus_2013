 /*
 * Progrma Principal MAIN
 * 
 */
package controlador;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.*;
import oracle.*;
import vista.*;

/**
 *
 * @author 7BPROG08
 */
public class Main {
private static ArrayList <LineaListado > listaSorteo;
private static ConsultaSolicitud ins;
private static Inicio i;
private static Menor men1,men2,men3;
private static PanelSolicitud sol1,sol2,sol3;
private static Persona perMen1,perMen2,perMen3,per;
private static Tutor tut;
private static Sorteo sorteo;
private static DatosConsulta daco;
private static LineaListado lineaListado;
private static PanelSolicitud so;
private static VisualizaSolicitud vso;
private static PanelGeneral pg;
private static Oracle ora;
private static Calendar lcitas[]; 
private static Integer  lorden[];



    /**
     * @param args Sin argumentos
     */
    public static void main(String[] args) {
        i= new Inicio();
        i.setVisible(true);
        /*
        * Barra de carga inicial
        */
        final Inicio it=new Inicio();
        int value=0;
        it.setVisible(true);
        for(int i=0;i<= 100;i++){ 
          final int percent=i;
          try{
                SwingUtilities.invokeLater(new Runnable(){
                    public void run(){it.updateBar(percent);}
                    });
                java.lang.Thread.sleep(50);
            }catch(InterruptedException e){;}        
        }
        pg =new PanelGeneral();pg.setVisible(true);
        pg.setVisible(true);  
        i.dispose();
        it.dispose();
}
        /*
        * Mostar Solicitud
        */
    public static void MostrarSolicitud() {
        so=new PanelSolicitud();
        so.setVisible(true);
    }
        /*
        * Inscripcion Final
        */
    public static void inscripcionfinal() {
     so.setVisible(false);
    }
        /*
        * Mostar Panel General
        */
    public static void MostrarPanelGeneral() {
        so.dispose();
        pg=new PanelGeneral();
        pg.setVisible(true);
        pg.setLocationRelativeTo(null);
    }
        /*
        * Generar Objeto Tutor
        */
    public static void GenerarObjetoTutor(String no, String ap1, String ap2, String dn1, String call, String num, String pis, String let, String mun, String pro, String cp, int tel1, int tel2, int tel3, int tel4) {
      per=new Persona(0,no,ap1, ap2,call,num,pis,let,mun,pro,cp);
      tut=new Tutor(0, dn1, tel1, tel2, tel3, tel4);
      }
        /*
        * Generar Objeto Menor1
        */
    public static void GenerarObjetoMenor1(String no, String ap1, String ap2, String dn1, String fecNac, String cal, String num, String let, String pis, String mun, String prov, String cp, String centro, String mod) {
      perMen1=new Persona(0,no,ap1, ap2,cal,num,pis,let,mun,prov,cp);
      men1=new Menor(0, dn1, fecNac, centro,  mod);
    }
        /*
        * Generar Objeto Menor2
        */
    public static void GenerarObjetoMenor2(String no, String ap1, String ap2, String dn1, String fecNac, String cal, String num, String let, String pis, String mun, String prov, String cp, String centro, String mod) {
      perMen2=new Persona(0,no,ap1, ap2,cal,num,pis,let,mun,prov,cp);
      men2=new Menor(0, dn1, fecNac, centro,  mod);
    }
        /*
        * Generar Objeto Menor3
        */
    public static void GenerarObjetoMenor3(String no, String ap1, String ap2, String dn1, String fecNac, String cal, String num, String let, String pis, String mun, String prov, String cp, String centro, String mod) {
      perMen3=new Persona(0,no,ap1, ap2,cal,num,pis,let,mun,prov,cp);
      men3=new Menor(0, dn1, fecNac, centro,  mod);
    }
        /*
        * Inseertar Solicitud
        */

    public static void InsertarSolicitud(int contadorMenor) throws SQLException{
       ora= new Oracle(); 
       ora.InsertarSolicitud(per,tut,perMen1,men1,perMen2,men2,perMen3,men3,contadorMenor);
    }
        /*
        * Mostrar Consulta
        */

    public static void MostrarConsulta() {
        pg.dispose();
        pg.setVisible(false);
        ins = new ConsultaSolicitud();
        ins.setVisible(true);
    }
        /*
        * Listado de los Resultados del Sorteo
        */
    public static void ListadoResultadoSorteo() {
        try{
                // Creación de un fichero pdf
                Document documento = new Document(PageSize.LETTER); 
               /*Definimos el nombre del archivo de salida con extension .PDF*/ 
               String file="listadoSorteo.pdf"; 
               /*a traves del siguiente metodo (getInstance)y un flujo de salida del paquete .io asociamos el documento de iText con el archivo de java*/
               PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream(file));
               // Abrimos el documento y agregamos los elementos en el orden que deben aparecer*/ 
                documento.open(); 
                // Encabezado formado por dos imagenes y un texto.
                // Primera imagen
              Image imagen1=Image.getInstance(("imagen02.png"));
              imagen1.setAlignment(Image.LEFT | Image.TEXTWRAP);
              documento.add(imagen1); 
                
                // Segunda imagen
             Image imagen2=Image.getInstance(("imagen01.png"));
             imagen2.setAlignment(Image.RIGHT | Image.TEXTWRAP);
             documento.add(imagen2);
                
                 // Texto
                String encabezado="UDA ARABA 2013"+"\n"+ "ZOZKETAKO EMAITZEN ZERRENDA/LISTADO RESULTADO DEL SORTEO"+"\n"+"UDALEKUAK/UDALEKUAK"+ "\n";
                Font fuente= new Font(Font.getFamily("ARIAL"), 10, Font.BOLD);
                Paragraph linea = new Paragraph(encabezado,fuente);
                documento.add(linea); 
                
                // Datos varios del sorteo
                ora= new Oracle();
                ora.TraerDatosSorteo();
                sorteo = new Sorteo();    
                sorteo = ora.getSorteo();
                String fecha= sorteo.getFechaSorteo(); 
                Integer numero=sorteo.getNumero();
                Integer cadencia= sorteo.getCadencia();            
                
                // Ni que decir tiene que estos datos hay que extraerlos de la bd
                String datosSorteo="\n" + "\n" + "\nFecha Sorteo: " + fecha + "\n" + "Num. Comienzo: " + numero +"\n" + "Cadencia: "+ cadencia +"\n"+"\n";
                fuente= new Font(Font.getFamily("ARIAL"), 8, Font.BOLD);
                Paragraph datos= new Paragraph(datosSorteo,fuente);
                datos.setAlignment(1);//el 1 es para centrar
                documento.add(datos); 
                
                // Número de pagina
                Phrase n= new Phrase(String.format("Página %d", writer.getCurrentPageNumber()));
                documento.add(n);
                
       
                // Tabla para mostrar los datos
                PdfPTable tabla=new PdfPTable(4);
                tabla.setWidthPercentage(100);
                
                PdfPCell celda1 =new PdfPCell (new Paragraph("Num. Inscrip.",FontFactory.getFont("arial",10,Font.BOLD,BaseColor.RED)));
                PdfPCell celda2 =new PdfPCell (new Paragraph("Num. sorteo",FontFactory.getFont("arial",10,Font.BOLD,BaseColor.RED)));
                PdfPCell celda3 =new PdfPCell (new Paragraph("Cita",FontFactory.getFont("arial",10,Font.BOLD,BaseColor.RED)));
                PdfPCell celda4 =new PdfPCell (new Paragraph("Participante",FontFactory.getFont("arial",10,Font.BOLD,BaseColor.RED)));
                
                tabla.addCell(celda1);
                tabla.addCell(celda2);
                tabla.addCell(celda3);
                tabla.addCell(celda4);
                
                 // LLenar la tabla con el resultado de la consulta
                 listaSorteo = ora.TraerTablaSorteo();
                 for (int x=0;x <listaSorteo.size();x++){
                 tabla.addCell(listaSorteo.get(x).getNumSolicitud());
                 tabla.addCell(listaSorteo.get(x).getNumOrden());
                 tabla.addCell(listaSorteo.get(x).getCita());
                 tabla.addCell(listaSorteo.get(x).getNombre());
                 }
                 documento.add(tabla);
                
                // Cerramos el documento
                
                documento.close();
    JOptionPane.showMessageDialog(null,"PDF Generado");
         }
    catch(Exception e){}
    }
        /*
        *  Sorteo
        */
    public static void Sorteo() throws ParseException, SQLException {
     
 //  Calendar cal=Calendar.getInstance();
 //  Date date=cal.getTime();    
   int maxSolicitud=0;
   int orden = 1;
   //----------------Establecer en numero de solicitudes ------------------------------------
   ora= new Oracle();
   maxSolicitud=ora.MaxSolicitudes();
   System.out.println("Numero de Solicitudes: "+maxSolicitud);
   //-----------------Realizar el Sorteo --------------
   int numSorteo = (int)(Math.random()* maxSolicitud);
   if (numSorteo == 0) numSorteo=1;
   int cadencia = (int)(Math.random()*(9-3)+3);
   if (cadencia == 0) cadencia=3;
   if (cadencia > maxSolicitud) cadencia=3;
   System.out.println("Resultados del Sorteo: Numero= "+numSorteo+" Cadencia: " + cadencia);
   //--------------INSERTAR SORTEO ---------------------------------     
    ora.InsertarSorteo(numSorteo,cadencia);    
   //-----------------Fecha de Inicio de citasa --------------
   String fechaInicial = "27-05-2013 09:00:00.0"; 
   SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy hh:mm"); 
   //Convertimos la cadena a Date
   Date fechaIni = sdt.parse(fechaInicial);
   System.out.println("Comienzo de citas: "+sdt.format(fechaIni));
   //-----------------------------------------------
   Calendar lcitas[]; 
   Integer  lorden[]; 
   
   lcitas = new Calendar[maxSolicitud+1];
   lorden = new Integer[maxSolicitud+1];
  
   Calendar cita = Calendar.getInstance();
   cita.setTime(fechaIni);
   
   int aaaa=cita.get(Calendar.YEAR);
   int MM=cita.get(Calendar.MONTH);
   int dd=cita.get(Calendar.DAY_OF_MONTH);
   int hh=cita.get(Calendar.HOUR_OF_DAY);
   int mm=cita.get(Calendar.MINUTE);
   int ss=cita.get(Calendar.SECOND);
  
   
   Calendar cita0 = Calendar.getInstance();
   cita0.set(0,0,0,0,0,0);
    //--------------Inicializa Arrays a 0 --------------------------------- 
   for (int x = 0; x <maxSolicitud; x++){
        lcitas[x]=cita0;
        lorden[x]=0;
      }
   //System.out.println("Tabla Inicializada");
    //--------------Asigna dias y horas --------------------------------- 
   for (int x = numSorteo; orden <=  maxSolicitud; x=x+cadencia){
   if (x >  maxSolicitud){
       x = (x-maxSolicitud);
      }
   cita = Calendar.getInstance();
   cita.set(aaaa,MM,dd,hh,mm,ss);   
   
            lcitas[x]=cita;
            lorden[x]=orden;
            orden ++;
   
   if (lcitas[x].get(Calendar.HOUR_OF_DAY) >= 14 && lcitas[x].get(Calendar.MINUTE) >= 45){
        mm=0;
        dd= dd+1;
     } else
        mm=mm+15;
 //--------------Se salta el fin de semana ---------------------------------   
   if (cita.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
       dd= dd+2;  
      }
   } 
 //--------------Repercute y visualiza citas ---------------------------------      
for (int x = 1; x < lcitas.length; x++)
    {
        if (lorden[x] != 0  && lorden[x] != null){
           Date fechacita=lcitas[x].getTime();
           sdt = new SimpleDateFormat("hh:mm");
           String horaS=sdt.format(fechacita);
           sdt = new SimpleDateFormat("dd-MM-yyyy");
           String fechaS=sdt.format(fechacita); 
           sdt = new SimpleDateFormat("dd-MM-yyyy hh:mm");
           //--------------Updatear Solicitudes ---------------------------------     
           ora.UpdateaSolicitud(x,lorden[x],fechaS,horaS); 
           //--------------Visualizar Solicitudes ---------------------------------  
           System.out.println("La solicitud: "+ x + " Nº Orden: "+lorden[x]+" Cita: "+sdt.format(fechacita));
        }
     
   } 
   JOptionPane.showMessageDialog(null,"Numero de Solicitudes: "+maxSolicitud+
           "\n Resultados del Sorteo:\n     Numero= "+numSorteo+
           "\n     Cadencia: " + cadencia+
           "\n Comienzo de citas: "+sdt.format(fechaIni)+"\n");   
   
   }
        /*
        * Mostrar Consulta Solicitud
        */   
    
       public static void MostrarConsultasolicitud(String dni, String fecha) throws SQLException {
       ora= new Oracle();
//       cso.dispose();
       if (ora.VisualizarSolicitud(dni, fecha)== true){
           daco=ora.getDatosConsulta();
           vso=new VisualizaSolicitud(daco);
           vso.setVisible(true);
           
           }
       else{
       String Mensaje= "No existen Datos para la consulta realizada";    
       vso=new VisualizaSolicitud(Mensaje);
       vso.setVisible(true);
       
            }
    }
       
       /*
        * Mostrar  Panel Consulta2
        */

    public static void MostrarConsulta2() {
       vso.dispose();
       ins.setVisible(true);
    }
        /*
        * Volver a Panel general
        */

    public static void VolverPanelGeneral() {
        ins.dispose();
        pg.setVisible(true);
    }
        /*
        * Volver a Panel general2
        */

    public static void VolverPanelGeneral2() {
       vso.dispose();
       ins.dispose();
       pg.setVisible(true);
    }
}