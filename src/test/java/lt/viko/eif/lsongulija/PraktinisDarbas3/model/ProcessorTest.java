package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.AfterClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Processor class
 * @author lukas
 */
class ProcessorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterClass
    public static void tearDown() {
    }

    /**
     * Test of getName method, of class Processor
     */
    @Test
    void getName() {
        System.out.println("getName");
        Processor instance = new Processor();
        String name = "INTEL 99";
        instance.setName(name);
        String expResult = "INTEL 99";;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Processor
     */
    @Test
    void setName() {
        System.out.println("setName");
        String name = "INTEL 99";
        Processor instance = new Processor();
        instance.setName(name);
        String expResult = "INTEL 99";

        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCores method, of class Processor
     */
    @Test
    void getCores() {
        System.out.println("getCores");
        Processor instance = new Processor();
        int cores = 8;
        instance.setCores(cores);
        int expResult = 8;
        int result = instance.getCores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCores method, of class Processor
     */
    @Test
    void setCores() {
        System.out.println("setCores");
        int cores = 8;
        Processor instance = new Processor();
        instance.setCores(cores);
        int expResult = 8;
        int result = instance.getCores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getThreads method, of class Processor
     */
    @Test
    void getThreads() {
        System.out.println("getThreads");
        Processor instance = new Processor();

        int threads = 16;
        instance.setThreads(threads);
        int expResult = 16;
        int result = instance.getThreads();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreads method, of class Processor
     */
    @Test
    void setThreads() {
        System.out.println("setThreads");
        Processor instance = new Processor();
        int threads = 16;
        instance.setThreads(threads);
        int expResult = 16;
        int result = instance.getThreads();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBaseFrequency method, of class Processor
     */
    @Test
    void getBaseFrequency() {
        System.out.println("getBaseFrequency");
        double baseFrequency = 2.5;
        Processor instance = new Processor();

        instance.setBaseFrequency(baseFrequency);
        double expResult = 2.5;
        double result = instance.getBaseFrequency();
        assertEquals(expResult, result, 2.5);
    }

    /**
     * Test of setBaseFrequency method, of class Processor
     */
    @Test
    void setBaseFrequency() {
        System.out.println("setBaseFrequency");
        double baseFrequency = 4.5;
        Processor instance = new Processor();

        instance.setBaseFrequency(baseFrequency);
        double expResult = 4.5;
        double result = instance.getBaseFrequency();
        assertEquals(expResult, result, 4.5);
    }

    /**
     * Test of setBaseFrequency method, of class Processor
     */
    @Test
    void getMaxFrequency() {
        System.out.println("getMaxFrequency");
        double maxFrequency = 4.5;
        Processor instance = new Processor();

        instance.setMaxFrequency(maxFrequency);
        double expResult = 4.5;
        double result = instance.getMaxFrequency();
        assertEquals(expResult, result, 4.5);
    }

    /**
     * Test of setMaxFrequency method, of class Processor
     */
    @Test
    void setMaxFrequency() {
        System.out.println("setMaxFrequency");
        double maxFrequency = 4.5;
        Processor instance = new Processor();

        instance.setMaxFrequency(maxFrequency);
        double expResult = 4.5;
        double result = instance.getMaxFrequency();
        assertEquals(expResult, result, 4.5);
    }

    /**
     * Test of testToString method, of class Processor
     */
    @Test
    void testToString() {
        System.out.println("toString");
        Processor instance = new Processor();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}