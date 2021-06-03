package lt.viko.eif.lsongulija.PraktinisDarbas3.repo;

import lt.viko.eif.lsongulija.PraktinisDarbas3.model.Computer;
import org.junit.jupiter.api.Test;

import java.util.List;
/**
 * Test for ComputerRepository class
 * @author lukas
 */
import static org.junit.jupiter.api.Assertions.*;

class ComputerRepositoryTest {
    private ComputerRepository instance = new ComputerRepository();
    /**
     * Test of getComputers method from ComputerRepository class
     */
    @Test
    void getComputers() {
        System.out.println("getPhones");
        List<Computer> result = instance.getComputers();
        assertTrue(result.size() > 0);
    }

    /**
     * Test of updateComputer method from ComputerRepository class
     */
    @Test
    void updateComputer() {
        System.out.println("updateComputer");
        Computer computer = new Computer("Inspirion", "TEST", 1,
                1, "", 1, "","",
                "","",1,1, "",
                "", "", "", 1, "",
                1, 1, 1, "", 1,
                1, 1, 1,
                1, "", "");
        instance.updateComputer(computer, computer.getId());
        String expectedResult = "";
        for (Computer c: instance.getComputers()) {
            if(c.getId() == computer.getId())
                expectedResult = c.getName();
        }
        assertEquals(expectedResult, computer.getName());
    }

    /**
     * Test of addComputer method from ComputerRepository class
     */
    @Test
    void addComputer() {
        System.out.println("addComputer");
        Computer computer = new Computer("BIG Computer", "TEST", 13,
                1, "", 1, "","",
                "","",1,1, "",
                "", "", "", 1, "",
                1, 1, 1, "", 1,
                1, 1, 1,
                1, "", "");
        instance.addComputer(computer);
        String expectedResult = "";
        for (Computer c: instance.getComputers()) {
            if(c.getId() == computer.getId())
                expectedResult = c.getName();
        }
        assertEquals(expectedResult, computer.getName());
    }

    /**
     * Test of deleteComputer method from ComputerRepository class
     */
    @Test
    void deleteComputer() {
        System.out.println("deleteComputer");
        instance.deleteComputer(1);
        assertFalse(instance.computerIdExist(1));
    }

    /**
     * Test of computerIdExist method from ComputerRepository class
     */
    @Test
    void computerIdExist() {
        System.out.println("computerIdExists");
        assertTrue(instance.computerIdExist(1));
    }
}