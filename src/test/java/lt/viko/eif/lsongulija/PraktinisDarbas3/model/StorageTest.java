package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Storage class
 * @author lukas
 */
class StorageTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    /**
     * Test of getStorageType method, of class Storage
     */
    @Test
    void getStorageType() {
        System.out.println("getStorageType");
        String type = "HDD";
        Storage instance = new Storage();
        instance.setStorageType(type);
        String expResult = "HDD";
        String result = instance.getStorageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStorageType method, of class Storage
     */
    @Test
    void setStorageType() {
        System.out.println("setStorageType");
        String storageType = "HDD";
        Storage instance = new Storage();

        instance.setStorageType(storageType);

        String expResult = "HDD";
        String result = instance.getStorageType();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCapacity method, of class Storage
     */
    @Test
    void getCapacity() {
        System.out.println("getCapacity");
        int capacity = 800;
        Storage instance = new Storage();
        instance.setCapacity(capacity);
        int expResult = 800;
        int result = instance.getCapacity();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCapacity method, of class Storage
     */
    @Test
    void setCapacity() {
        System.out.println("setCapacity");
        int capacity = 700;
        Storage instance = new Storage();
        instance.setCapacity(capacity);

        int expResult = 700;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConnectionType method, of class Storage
     */
    @Test
    void getConnectionType() {
        System.out.println("getConnectionType");
        String connectionType = "SATA III";
        Storage instance = new Storage();
        instance.setConnectionType(connectionType);
        String expResult = "SATA III";
        String result = instance.getConnectionType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setConnectionType method, of class Storage
     */
    @Test
    void setConnectionType() {
        System.out.println("setConnectionType");
        String connectionType = "SATA III";
        Storage instance = new Storage();
        instance.setConnectionType(connectionType);

        String expResult = "SATA III";
        String result = instance.getConnectionType();
        assertEquals(expResult, result);
    }

    /**
     * Test of testToString method, of class Storage
     */
    @Test
    void testToString() {
        System.out.println("toString");
        Storage instance = new Storage();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}