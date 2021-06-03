package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotherboardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

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

    @Test
    void testToString() {
        System.out.println("toString");
        Motherboard instance = new Motherboard();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}