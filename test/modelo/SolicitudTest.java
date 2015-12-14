/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javipaur
 */
public class SolicitudTest {
    
    public SolicitudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdSolicitud method, of class Solicitud.
     */
    @Test
    public void testGetIdSolicitud() {
        System.out.println("getIdSolicitud");
        Solicitud instance = new Solicitud();
        Integer expResult = null;
        Integer result = instance.getIdSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSolicitud method, of class Solicitud.
     */
    @Test
    public void testSetIdSolicitud() {
        System.out.println("setIdSolicitud");
        Integer idSolicitud = null;
        Solicitud instance = new Solicitud();
        instance.setIdSolicitud(idSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSecuencia method, of class Solicitud.
     */
    @Test
    public void testGetSecuencia() {
        System.out.println("getSecuencia");
        Solicitud instance = new Solicitud();
        Integer expResult = null;
        Integer result = instance.getSecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSecuencia method, of class Solicitud.
     */
    @Test
    public void testSetSecuencia() {
        System.out.println("setSecuencia");
        Integer secuencia = null;
        Solicitud instance = new Solicitud();
        instance.setSecuencia(secuencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSolicitud method, of class Solicitud.
     */
    @Test
    public void testGetFechaSolicitud() {
        System.out.println("getFechaSolicitud");
        Solicitud instance = new Solicitud();
        Date expResult = null;
        Date result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaSolicitud method, of class Solicitud.
     */
    @Test
    public void testSetFechaSolicitud() {
        System.out.println("setFechaSolicitud");
        Date fechaSolicitud = null;
        Solicitud instance = new Solicitud();
        instance.setFechaSolicitud(fechaSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getnOrdenSorteo method, of class Solicitud.
     */
    @Test
    public void testGetnOrdenSorteo() {
        System.out.println("getnOrdenSorteo");
        Solicitud instance = new Solicitud();
        Integer expResult = null;
        Integer result = instance.getnOrdenSorteo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setnOrdenSorteo method, of class Solicitud.
     */
    @Test
    public void testSetnOrdenSorteo() {
        System.out.println("setnOrdenSorteo");
        Integer nOrdenSorteo = null;
        Solicitud instance = new Solicitud();
        instance.setnOrdenSorteo(nOrdenSorteo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCita method, of class Solicitud.
     */
    @Test
    public void testGetFechaCita() {
        System.out.println("getFechaCita");
        Solicitud instance = new Solicitud();
        Date expResult = null;
        Date result = instance.getFechaCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCita method, of class Solicitud.
     */
    @Test
    public void testSetFechaCita() {
        System.out.println("setFechaCita");
        Date fechaCita = null;
        Solicitud instance = new Solicitud();
        instance.setFechaCita(fechaCita);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraCita method, of class Solicitud.
     */
    @Test
    public void testGetHoraCita() {
        System.out.println("getHoraCita");
        Solicitud instance = new Solicitud();
        String expResult = "";
        String result = instance.getHoraCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraCita method, of class Solicitud.
     */
    @Test
    public void testSetHoraCita() {
        System.out.println("setHoraCita");
        String horaCita = "";
        Solicitud instance = new Solicitud();
        instance.setHoraCita(horaCita);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
