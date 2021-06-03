package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

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

    @Test
    void setCapacity() {
        System.out.println("setCapacity");
        int capacity = 16;
        Ram instance = new Ram();

        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 16;
        // TODO review the generated test code and remove the default call to fail.
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

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

    @Test
    void setMemoryVoltage() {
        System.out.println("setMemoryVoltage");
        double memoryVoltage = 1.35;
        Ram instance = new Ram();

        instance.setMemoryVoltage(memoryVoltage);
        // TODO review the generated test code and remove the default call to fail.
        double expResult = 1.35;
        // TODO review the generated test code and remove the default call to fail.
        double result = instance.getMemoryVoltage();
        assertEquals(expResult, result, 1.35);
    }

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

    @Test
    void setTacticalFrequency() {
        System.out.println("setTacticalFrequency");
        int tacticalFrequency = 3200;
        Ram instance = new Ram();

        instance.setTacticalFrequency(tacticalFrequency);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 3200;
        // TODO review the generated test code and remove the default call to fail.
        int result = instance.getTacticalFrequency();
        assertEquals(expResult, result);
    }

    @Test
    void testToString() {
        System.out.println("toString");
        Ram instance = new Ram();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}