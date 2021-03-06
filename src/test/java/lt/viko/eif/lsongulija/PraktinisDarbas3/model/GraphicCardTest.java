package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for GraphicCard class
 * @author lukas
 */
class GraphicCardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    /**
     * Test of getBrand method, of class GraphichCard
     */
    @Test
    void getBrand() {
        System.out.println("getBrand");
        String brand = "ASUS";
        GraphicCard instance = new GraphicCard();
        instance.setBrand(brand);
        String expResult = "ASUS";
        String result = instance.getBrand();
        assertEquals(expResult, result);
    }
    /**
     * Test of setBrand method, of class GraphichCard
     */
    @Test
    void setBrand() {
        System.out.println("setBrand");
        String brand = "ASUS";
        GraphicCard instance = new GraphicCard();
        instance.setBrand(brand);

        String expResult = "ASUS";
        String result = instance.getBrand();
        assertEquals(expResult, result);
    }
    /**
     * Test of getDescription method, of class GraphichCard
     */
    @Test
    void getDescription() {
        System.out.println("getDescription");

        String description = "MSI GTX 1060 TI";
        GraphicCard instance = new GraphicCard();
        instance.setDescription(description);
        String expResult = "MSI GTX 1060 TI";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    /**
     * Test of getDescription method, of class GraphichCard
     */
    @Test
    void setDescription() {
        System.out.println("setDescription");
        String description = "MSI GTX 1060 TI";
        GraphicCard instance = new GraphicCard();
        instance.setDescription(description);

        String expResult = "MSI GTX 1060 TI";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    /**
     * Test of getMemory method, of class GraphichCard
     */
    @Test
    void getMemory() {
        System.out.println("getMemory");
        String memory = "6 GB GDDR5";
        GraphicCard instance = new GraphicCard();
        instance.setMemory(memory);
        String expResult = "6 GB GDDR5";
        String result = instance.getMemory();
        assertEquals(expResult, result);
    }
    /**
     * Test of setMemory method, of class GraphichCard
     */
    @Test
    void setMemory() {
        System.out.println("setMemory");
        String memory = "6 GB GDDR5";
        GraphicCard instance = new GraphicCard();
        instance.setMemory(memory);

        String expResult = "6 GB GDDR5";
        String result = instance.getMemory();
        assertEquals(expResult, result);
    }
    /**
     * Test of getCoreClock method, of class GraphichCard
     */
    @Test
    void getCoreClock() {
        System.out.println("getCoreClock");
        int coreClock = 1379;
        GraphicCard instance = new GraphicCard();
        instance.setCoreClock(coreClock);
        int expResult = 1379;
        int result = instance.getCoreClock();
        assertEquals(expResult, result);
    }
    /**
     * Test of setCoreClock method, of class GraphichCard
     */
    @Test
    void setCoreClock() {
        System.out.println("setCoreClock");
        int coreClock = 1400;
        GraphicCard instance = new GraphicCard();
        instance.setCoreClock(coreClock);

        int expResult = 1400;
        int result = instance.getCoreClock();
        assertEquals(expResult, result);
    }
    /**
     * Test of getBoostClock method, of class GraphichCard
     */
    @Test
    void getBoostClock() {
        System.out.println("getBoostClock");
        int boostClock = 1493;
        GraphicCard instance = new GraphicCard();
        instance.setBoostClock(boostClock);
        int expResult = 1493;
        int result = instance.getBoostClock();
        assertEquals(expResult, result);
    }
    /**
     * Test of setBoostClock method, of class GraphichCard
     */
    @Test
    void setBoostClock() {
        System.out.println("setBoostClock");
        int boostClock = 1600;
        GraphicCard instance = new GraphicCard();
        instance.setBoostClock(boostClock);

        int expResult = 1600;
        int result = instance.getBoostClock();
        assertEquals(expResult, result);
    }
    /**
     * Test of testToString method, of class GraphichCard
     */
    @Test
    void testToString() {
        System.out.println("toString");
        GraphicCard instance = new GraphicCard();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}