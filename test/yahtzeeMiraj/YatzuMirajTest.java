/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miraj
 */
public class YatzuMirajTest {
    
    public YatzuMirajTest() {
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
     * Test of design method, of class YatzuMiraj.
     */
    @Test
    public void testDesign() {
        System.out.println("design");
        YatzuMiraj instance = new YatzuMiraj();
        instance.design();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiP method, of class YatzuMiraj.
     */
    @Test
    public void testMultiP() {
        System.out.println("multiP");
        YatzuMiraj instance = new YatzuMiraj();
        instance.multiP();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class YatzuMiraj.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        YatzuMiraj.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of actionPerformed method, of class YatzuMiraj.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        YatzuMiraj instance = new YatzuMiraj();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
