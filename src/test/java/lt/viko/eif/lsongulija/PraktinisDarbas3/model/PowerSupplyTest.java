package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for PowerSuply class
 * @author lukas
 */
class PowerSupplyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test of getProducer method, of class PowerSupply
     */
    @Test
    void getProducer() {
        System.out.println("getProducer");
        String producer = "Deepcool DQ750ST";
        PowerSupply instance = new PowerSupply();
        instance.setProducer(producer);
        String expResult = "Deepcool DQ750ST";
        String result = instance.getProducer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProducer method, of class PowerSupply
     */
    @Test
    void setProducer() {
        System.out.println("setProducer");
        String producer = "Deepcool DQ750ST";
        PowerSupply instance = new PowerSupply();
        instance.setProducer(producer);

        String expResult = "Deepcool DQ750ST";
        String result = instance.getProducer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerWats method, of class PowerSupply
     */
    @Test
    void getPowerWats() {
        System.out.println("getPowerWats");
        int powerWats = 750;
        PowerSupply instance = new PowerSupply();
        instance.setPowerWats(powerWats);
        int expResult = 750;
        int result = instance.getPowerWats();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPowerWats method, of class PowerSupply
     */
    @Test
    void setPowerWats() {
        System.out.println("setPowerWats");
        int powerWats = 800;
        PowerSupply instance = new PowerSupply();
        instance.setPowerWats(powerWats);

        int expResult = 800;
        int result = instance.getPowerWats();
        assertEquals(expResult, result);

    }

    /**
     * Test of getInputVoltage method, of class PowerSupply
     */
    @Test
    void getInputVoltage() {
        System.out.println("getInputVoltage");
        String inputVoltage = "100 - 240 V";
        PowerSupply instance = new PowerSupply();
        instance.setInputVoltage(inputVoltage);
        String expResult = "100 - 240 V";
        String result = instance.getInputVoltage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInputVoltage method, of class PowerSupply
     */
    @Test
    void setInputVoltage() {
        System.out.println("setInputVoltage");
        String inputVoltage = "100 - 240 V";
        PowerSupply instance = new PowerSupply();
        instance.setInputVoltage(inputVoltage);

        String expResult = "100 - 240 V";
        String result = instance.getInputVoltage();
        assertEquals(expResult, result);

    }

    /**
     * Test of getOperatingTemperature method, of class PowerSupply
     */
    @Test
    void getOperatingTemperature() {
        System.out.println("getOperatingTemperature");
        String operatingTemperature = "0 - 40 °C";
        PowerSupply instance = new PowerSupply();
        instance.setOperatingTemperature(operatingTemperature);
        String expResult = "0 - 40 °C";
        String result = instance.getOperatingTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperatingTemperature method, of class PowerSupply
     */
    @Test
    void setOperatingTemperature() {
        System.out.println("setOperatingTemperature");
        String operatingTemperature = "0 - 40 °C";
        PowerSupply instance = new PowerSupply();
        instance.setOperatingTemperature(operatingTemperature);

        String expResult = "0 - 40 °C";
        String result = instance.getOperatingTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of testToString method, of class PowerSupply
     */
    @Test
    void testToString() {
        System.out.println("toString");
        PowerSupply instance = new PowerSupply();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);

    }
}