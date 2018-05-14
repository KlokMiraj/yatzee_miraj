/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
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
public class OnePlayerTest {
    
    public OnePlayerTest() {
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
     * Test of mouseAndactionListener method, of class OnePlayer.
     */
    @Test
    public void testMouseAndactionListener() {
        System.out.println("mouseAndactionListener");
        OnePlayer instance = new OnePlayer();
        instance.mouseAndactionListener();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of imageSelection method, of class OnePlayer.
     */
    @Test
    public void testImageSelection() {
        System.out.println("imageSelection");
        ActionEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.imageSelection(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of imageDeselection method, of class OnePlayer.
     */
    @Test
    public void testImageDeselection() {
        System.out.println("imageDeselection");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.imageDeselection(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of finishGame method, of class OnePlayer.
     */
    @Test
    public void testFinishGame() {
        System.out.println("finishGame");
        OnePlayer instance = new OnePlayer();
        instance.finishGame();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of allTotal method, of class OnePlayer.
     */
    @Test
    public void testAllTotal() {
        System.out.println("allTotal");
        OnePlayer instance = new OnePlayer();
        instance.allTotal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of actionPerformed method, of class OnePlayer.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mouseClicked method, of class OnePlayer.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mousePressed method, of class OnePlayer.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mouseReleased method, of class OnePlayer.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class OnePlayer.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class OnePlayer.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        OnePlayer instance = new OnePlayer();
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
