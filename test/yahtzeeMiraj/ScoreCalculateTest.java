/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzeeMiraj;

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
public class ScoreCalculateTest {
    
    public ScoreCalculateTest() {
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
     * Test of getRandom method, of class ScoreCalculate.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.getRandom();
        assertEquals(expResult, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of firstDdiceImage method, of class ScoreCalculate.
     */
    @Test
    public void testFirstDdiceImage() {
        System.out.println("firstDdiceImage");
        ScoreCalculate instance = new ScoreCalculate();
        instance.firstDdiceImage();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of generateDiceImage method, of class ScoreCalculate.
     */
    @Test
    public void testGenerateDiceImage() {
        System.out.println("generateDiceImage");
        ScoreCalculate instance = new ScoreCalculate();
        instance.generateDiceImage();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesAces method, of class ScoreCalculate.
     */
    @Test
    public void testValuesAces() {
        System.out.println("valuesAces");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesAces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesTwos method, of class ScoreCalculate.
     */
    @Test
    public void testValuesTwos() {
        System.out.println("valuesTwos");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesTwos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesThrees method, of class ScoreCalculate.
     */
    @Test
    public void testValuesThrees() {
        System.out.println("valuesThrees");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesThrees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesFours method, of class ScoreCalculate.
     */
    @Test
    public void testValuesFours() {
        System.out.println("valuesFours");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesFours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesFives method, of class ScoreCalculate.
     */
    @Test
    public void testValuesFives() {
        System.out.println("valuesFives");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesFives();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of valuesSixs method, of class ScoreCalculate.
     */
    @Test
    public void testValuesSixs() {
        System.out.println("valuesSixs");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesSixs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of valuesThreeofakinds method, of class ScoreCalculate.
     */
    @Test
    public void testValuesThreeofakinds() {
        System.out.println("valuesThreeofakinds");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesThreeofakinds();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of valuesFourofakinds method, of class ScoreCalculate.
     */
    @Test
    public void testValuesFourofakinds() {
        System.out.println("valuesFourofakinds");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesFourofakinds();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of valuesFullHouse method, of class ScoreCalculate.
     */
    @Test
    public void testValuesFullHouse() {
        System.out.println("valuesFullHouse");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesFullHouse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valuessmallStraight method, of class ScoreCalculate.
     */
    @Test
    public void testValuessmallStraight() {
        System.out.println("valuessmallStraight");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuessmallStraight();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of valueslargeStraight method, of class ScoreCalculate.
     */
    @Test
    public void testValueslargeStraight() {
        System.out.println("valueslargeStraight");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valueslargeStraight();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of valuesYahtzeee method, of class ScoreCalculate.
     */
    @Test
    public void testValuesYahtzeee() {
        System.out.println("valuesYahtzeee");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesYahtzeee();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of valuesChance method, of class ScoreCalculate.
     */
    @Test
    public void testValuesChance() {
        System.out.println("valuesChance");
        ScoreCalculate instance = new ScoreCalculate();
        int expResult = 0;
        int result = instance.valuesChance();
        assertEquals(expResult, result);
        
    }
    
}
