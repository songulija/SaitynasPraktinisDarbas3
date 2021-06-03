package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Ram class
 * @author lukas
 */
class RamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test of getCapacity method, of class Ram
     */
    @Test
    void getCapacity() {
        System.out.println("getCapacity");
        int capacity = 16;
        Ram instance = new Ram();

        instance.setCapacity(capacity);
        int expResult = 16;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Ram
     */
    @Test
    void setCapacity() {
        System.out.println("setCapacity");
        int capacity = 16;
        Ram instance = new Ram();

        instance.setCapacity(capacity);
        int expResult = 16;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemoryVoltage method, of class Ram
     */
    @Test
    void getMemoryVoltage() {
        System.out.println("getMemoryVoltage");
        double memoryVoltage = 1.35;
        Ram instance = new Ram();

        instance.setMemoryVoltage(memoryVoltage);
        double expResult = 1.35;
        double result = instance.getMemoryVoltage();
        assertEquals(expResult, result, 1.35);
    }

    /**
     * Test of setMemoryVoltage method, of class Ram
     */
    @Test
    void setMemoryVoltage() {
        System.out.println("setMemoryVoltage");
        double memoryVoltage = 1.35;
        Ram instance = new Ram();

        instance.setMemoryVoltage(memoryVoltage);
        double expResult = 1.35;
        double result = instance.getMemoryVoltage();
        assertEquals(expResult, result, 1.35);
    }

    /**
     * Test of getTacticalFrequency method, of class Ram
     */
    @Test
    void getTacticalFrequency() {
        System.out.println("getTacticalFrequency");
        int tacticalFrequency = 3200;
        Ram instance = new Ram();

        instance.setTacticalFrequency(tacticalFrequency);
        int expResult = 3200;
        int result = instance.getTacticalFrequency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTacticalFrequency method, of class Ram
     */
    @Test
    void setTacticalFrequency() {
        System.out.println("setTacticalFrequency");
        int tacticalFrequency = 3200;
        Ram instance = new Ram();

        instance.setTacticalFrequency(tacticalFrequency);
        int expResult = 3200;
        int result = instance.getTacticalFrequency();
        assertEquals(expResult, result);
    }

    /**
     * Test of testToString method, of class Ram
     */
    @Test
    void testToString() {
        System.out.println("toString");
        Ram instance = new Ram();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}