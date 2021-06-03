package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test for Computer class
 * @author lukas
 */
class ComputerTest {
    private Computer instance = null;

    /**
     * Before each test set up
     */
    @BeforeEach
    void setUp() {
        instance = new Computer("Dell Insipirion 2500", "DELL", 1,
                1493, "MSI", 1379, "MSI GTX 1060 TI","6 GB GDDR5",
                "ASUS","Intel",32,4, "DD4",
                "Linux", "100 - 240 V", "0 - 40 °C", 750, "Deepcool DQ750ST",
                2.5, 8, 3.7, "Intel i5-10700", 16,
                16, 1.35, 3200,
                900, "SATA III", "HDD");
    }

    /**
     * Test of getName method, of class Computer
     */
    @Test
    void getName() {
        System.out.println("getName");
        String expResult = "Dell Insipirion 2500";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Computer
     */
    @Test
    void setName() {
        System.out.println("setName");
        String name = "Random name";
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name,result);
    }

    /**
     * Test of getManufacturer method, of class Computer
     */
    @Test
    void getManufacturer() {
        System.out.println("getManufacturer");
        String expResult = "DELL";
        String result = instance.getManufacturer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturer method, of class Computer
     */
    @Test
    void setManufacturer() {
        System.out.println("setManufacturer");
        String name = "Random manufacturer";
        instance.setManufacturer(name);
        String result = instance.getManufacturer();
        assertEquals(name,result);
    }

    /**
     * Test of getId method, of class Computer
     */
    @Test
    void getId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Computer
     */
    @Test
    void setId() {
        System.out.println("setId");
        int id = 11;
        instance.setId(id);
        int result = instance.getId();
        assertEquals(id, result);
    }

    /**
     * Test of getGpu method, of class Computer
     */
    @Test
    void getGpu() {
        System.out.println("getGpu");
        assertEquals(1493, instance.getGpu().getBoostClock());
    }

    /**
     * Test of setGpu method, of class Computer
     */
    @Test
    void setGpu() {
        System.out.println("setGpu");
        GraphicCard gr = new GraphicCard();
        gr.setBoostClock(1000);
        instance.setGpu(gr);
        assertNotNull(instance.getGpu());
    }

    /**
     * Test of getMotherboard method, of class Computer
     */
    @Test
    void getMotherboard() {
        System.out.println("getMotherboard");
        assertEquals("Intel", instance.getMotherboard().getCompatibleCpuBrand());
    }

    /**
     * Test of setMotherboard method, of class Computer
     */
    @Test
    void setMotherboard() {
        System.out.println("setMotherboard");
        Motherboard gr = new Motherboard();
        gr.setCompatibleCpuBrand("Ryzen");
        instance.setMotherboard(gr);
        assertNotNull(instance.getMotherboard());
    }

    /**
     * Test of getPowerSupply method, of class Computer
     */
    @Test
    void getPowerSupply() {
        System.out.println("getPowerSupply");
        assertEquals(750, instance.getPowerSupply().getPowerWats());
    }

    /**
     * Test of setPowerSupply method, of class Computer
     */
    @Test
    void setPowerSupply() {
        System.out.println("setPowerSupply");
        PowerSupply gr = new PowerSupply();
        gr.setPowerWats(800);
        instance.setPowerSupply(gr);
        assertNotNull(instance.getPowerSupply());
    }

    /**
     * Test of getCpu method, of class Computer
     */
    @Test
    void getCpu() {
        System.out.println("getCpu");
        assertEquals(16, instance.getCpu().getThreads());
    }

    /**
     * Test of setCpu method, of class Computer
     */
    @Test
    void setCpu() {
        System.out.println("setCpu");
        Processor gr = new Processor();
        gr.setThreads(24);
        instance.setCpu(gr);
        assertNotNull(instance.getCpu());
    }

    /**
     * Test of getRam method, of class Computer
     */
    @Test
    void getRam() {
        System.out.println("getRam");
        assertEquals(16, instance.getRam().getCapacity());
    }

    /**
     * Test of setRam method, of class Computer
     */
    @Test
    void setRam() {
        System.out.println("setRam");
        Ram gr = new Ram();
        gr.setCapacity(24);
        instance.setRam(gr);
        assertNotNull(instance.getRam());
    }

    /**
     * Test of getStorage method, of class Computer
     */
    @Test
    void getStorage() {
        System.out.println("getStorage");
        assertEquals(900, instance.getStorage().getCapacity());
    }

    /**
     * Test of setStorage method, of class Computer
     */
    @Test
    void setStorage() {
        System.out.println("setStorage");
        Storage gr = new Storage();
        gr.setCapacity(1000);
        instance.setStorage(gr);
        assertNotNull(instance.getStorage());
    }

    /**
     * Test of getOperationSystem method, of class Computer
     */
    @Test
    void getOperationSystem() {
        System.out.println("getOperationSystem");
        String expResult = "Linux";
        String result = instance.getOperationSystem();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperationSystem method, of class Computer
     */
    @Test
    void setOperationSystem() {
        System.out.println("getOperationSystem");
        String name = "Some system";
        instance.setOperationSystem(name);
        // TODO review the generated test code and remove the default call to fail.
        String result = instance.getOperationSystem();
        assertEquals(name,result);
    }

    /**
     * Test of testToString method, of class Computer
     */
    @Test
    void testToString() {
        System.out.println("toString");
        String result = instance.toString();
        assertTrue(result.contains("name"));
        assertTrue(result.contains("manufacturer"));
        assertTrue(result.contains("id"));
        assertTrue(result.contains("gpu"));
        assertTrue(result.contains("motherboard"));
        assertTrue(result.contains("powerSupply"));
        assertTrue(result.contains("cpu"));
        assertTrue(result.contains("ram"));
        assertTrue(result.contains("storage"));
        assertTrue(result.contains("operationSystem"));

    }
}