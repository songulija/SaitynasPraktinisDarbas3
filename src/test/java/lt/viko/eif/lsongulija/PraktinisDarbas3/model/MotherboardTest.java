package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Motherboard class
 * @author lukas
 */
class MotherboardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test of getBrand method, of class Motherboard
     */
    @Test
    void getBrand() {
        System.out.println("getBrand");
        String brand = "ASUS";
        Motherboard instance = new Motherboard();
        instance.setBrand(brand);
        String expResult = "ASUS";

        String result = instance.getBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBrand method, of class Motherboard
     */
    @Test
    void setBrand() {
        System.out.println("setBrand");
        String brand = "ASUS";
        Motherboard instance = new Motherboard();
        instance.setBrand(brand);

        String expResult = "ASUS";

        String result = instance.getBrand();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCompatibleCpuBrand method, of class Motherboard
     */
    @Test
    void getCompatibleCpuBrand() {
        System.out.println("getCompatibleCpuBrand");
        String compCPU = "Intel";
        Motherboard instance = new Motherboard();
        instance.setCompatibleCpuBrand(compCPU);
        String expResult = "Intel";
        String result = instance.getCompatibleCpuBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompatibleCpuBrand method, of class Motherboard
     */
    @Test
    void setCompatibleCpuBrand() {
        System.out.println("setCompatibleCpuBrand");
        String compatibleCpuBrand = "Razen";
        Motherboard instance = new Motherboard();
        instance.setCompatibleCpuBrand(compatibleCpuBrand);

        String expResult = "Razen";
        String result = instance.getCompatibleCpuBrand();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRamType method, of class Motherboard
     */
    @Test
    void getRamType() {
        System.out.println("getRamType");
        String ramType = "DD4";
        Motherboard instance = new Motherboard();
        instance.setRamType(ramType);
        String expResult = "DD4";
        String result = instance.getRamType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRamType method, of class Motherboard
     */
    @Test
    void setRamType() {
        System.out.println("setRamType");
        String ramType = "DD5";
        Motherboard instance = new Motherboard();
        instance.setRamType(ramType);

        String expResult = "DD5";
        String result = instance.getRamType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxRams method, of class Motherboard
     */
    @Test
    void getMaxRams() {
        System.out.println("getMaxRams");
        int maxRams = 16;
        Motherboard instance = new Motherboard();
        instance.setMaxRams(maxRams);
        int expResult = 16;
        int result = instance.getMaxRams();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxRams method, of class Motherboard
     */
    @Test
    void setMaxRams() {
        System.out.println("setMaxRams");
        int maxRams = 32;
        Motherboard instance = new Motherboard();
        instance.setMaxRams(maxRams);

        int expResult = 32;
        int result = instance.getMaxRams();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemorySlotsNumer method, of class Motherboard
     */
    @Test
    void getMemorySlotsNumer() {
        System.out.println("getMemorySlotsNumer");
        int number = 4;
        Motherboard instance = new Motherboard();
        instance.setMemorySlotsNumer(number);
        int expResult = 4;
        int result = instance.getMemorySlotsNumer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemorySlotsNumer method, of class Motherboard
     */
    @Test
    void setMemorySlotsNumer() {
        System.out.println("setMemorySlotsNumer");
        int memorySlotsNumer = 8;
        Motherboard instance = new Motherboard();
        instance.setMemorySlotsNumer(memorySlotsNumer);

        int expResult = 8;
        int result = instance.getMemorySlotsNumer();
        assertEquals(expResult, result);
    }

    /**
     * Test of testToString method, of class Motherboard
     */
    @Test
    void testToString() {
        System.out.println("toString");
        Motherboard instance = new Motherboard();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}