package lt.viko.eif.lsongulija.PraktinisDarbas3.repo;


import lt.viko.eif.lsongulija.PraktinisDarbas3.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents repository object of computers.
 * Has attribute computers, which is a list of computers.
 *
 * @author lukas
 * @version 1.0
 */
public class ComputerRepository {
    /**
     * Initialize computers list. And adding few computer object to this array
     */
    private static List<Computer> computers = new ArrayList<>();
    {
        computers.add(new Computer("Dell Insipirion 2500", "DELL", 1,
                1493, "MSI", 1379, "MSI GTX 1060 TI","6 GB GDDR5",
                "ASUS","Intel",32,4, "DD4",
                "Linux", "100 - 240 V", "0 - 40 °C", 750, "Deepcool DQ750ST",
                2.5, 8, 3.7, "Intel i5-10700", 16,
                16, 1.35, 3200,
                900, "SATA III", "HDD"));
        computers.add(new Computer("Dell Insipirion 6000", "DELL", 2,
                1493, "MSI", 1379, "MSI GTX 1060 TI","6 GB GDDR5",
                "ASUS","Intel",32,4, "DD4",
                "Linux", "100 - 240 V", "0 - 40 °C", 750, "Deepcool DQ750ST",
                2.5, 8, 3.7, "Intel i5-10700", 16,
                16, 1.35, 3200,
                900, "SATA III", "HDD"));
        computers.add(new Computer("Dell Insipirion 5000", "DELL", 3,
                1493, "MSI", 1379, "MSI GTX 1060 TI","6 GB GDDR5",
                "ASUS","Intel",32,4, "DD4",
                "Linux", "100 - 240 V", "0 - 40 °C", 750, "Deepcool DQ750ST",
                2.5, 8, 3.7, "Intel i5-10700", 16,
                16, 1.35, 3200,
                900, "SATA III", "HDD"));
    }

    /**
     * Method which returns our list of computers
     * @return computers
     */
    public List<Computer> getComputers(){
        return computers;
    }

    /**
     * Method to update computer object. It searches
     * Through computer array and if it finds computer with specified id
     * that computer will be updated
     * @param computer
     * @param id
     */
    public void updateComputer(Computer computer, int id){
        boolean founded = false;
        computer.setId(id);
        /**
         * looping through computers array, and searching for
         * computer with id same as we inserted, if found update
         */
        for(Computer c: computers){
            if(c.getId() == id){
                founded = true;
                c.setName(computer.getName());
                c.setManufacturer(computer.getManufacturer());
                c.setOperationSystem(computer.getOperationSystem());

                c.setGpu(computer.getGpu());
                c.setMotherboard(computer.getMotherboard());
                c.setPowerSupply(computer.getPowerSupply());
                c.setCpu(computer.getCpu());
                c.setRam(computer.getRam());
                c.setStorage(computer.getStorage());
            }
        }
        if(founded == false){
            addComputer(computer);
        }
    }

    /**
     * Method which adds computer object
     * to our computers list. We have to provide computer object
     * which we want to add and id of computer we want to add
     * @param computer
     */
    public void addComputer(Computer computer){
        computers.add(computer);
    }

    /**
     * Method which deletes computer object from
     * computers list. It searches through computers array
     * and if finds computer with specified id, it deletes it from list
     * @param id
     */
    public void deleteComputer(int id){
        computers.removeIf(c->c.getId() == id);
    }

    /**
     * Method which finds if there is computer object
     * whith specified id in computers list. if there is return true
     * else return false. For method you have to provide computer id
     * @param id
     * @return true or false
     */
    public boolean computerIdExist(int id){
        for(Computer c: computers){
            if(c.getId() == id){
                return true;
            }
        }
        return false;
    }

}
