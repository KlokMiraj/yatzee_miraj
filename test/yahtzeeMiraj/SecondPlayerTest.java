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
public class SecondPlayerTest {
    
    public SecondPlayerTest() {
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
     * Test of mouseAndactionListener method, of class SecondPlayer.
     */
    @Test
    public void testMouseAndactionListener() {
        System.out.println("mouseAndactionListener");
        SecondPlayer instance = new SecondPlayer();
        instance.mouseAndactionListener();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of anotherPlayer method, of class SecondPlayer.
     */
    @Test
    public void testAnotherPlayer() {
        System.out.println("anotherPlayer");
        SecondPlayer instance = new SecondPlayer();
        instance.anotherPlayer();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of imageSelection method, of class SecondPlayer.
     */
    @Test
    public void testImageSelection() {
        System.out.println("imageSelection");
        ActionEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.imageSelection(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of imageDeselection method, of class SecondPlayer.
     */
    @Test
    public void testImageDeselection() {
        System.out.println("imageDeselection");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.imageDeselection(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of finishGame method, of class SecondPlayer.
     */
    @Test
    public void testFinishGame() {
        System.out.println("finishGame");
        SecondPlayer instance = new SecondPlayer();
        instance.finishGame();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of allTotal method, of class SecondPlayer.
     */
    @Test
    public void testAllTotal() {
        System.out.println("allTotal");
        SecondPlayer instance = new SecondPlayer();
        instance.allTotal();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of actionPerformed method, of class SecondPlayer.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mouseClicked method, of class SecondPlayer.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mousePressed method, of class SecondPlayer.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mouseReleased method, of class SecondPlayer.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mouseEntered method, of class SecondPlayer.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mouseExited method, of class SecondPlayer.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        SecondPlayer instance = new SecondPlayer();
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
