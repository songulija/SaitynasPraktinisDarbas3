/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents GraphicCard object which has brand, description,memory,coreClock,boostClock properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class GraphicCard {
    private String brand;
    private String description;
    private String memory;
    private int coreClock;
    private int boostClock;
    /**
     * Getter for brand field
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Setter for brand field
     * @param brand 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * Getter for description field
     * @return description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Setter for description field
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getter for memory field
     * @return memory
     */
    public String getMemory() {
        return memory;
    }
    /**
     * Setter for memory field
     * @param memory 
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }
    /**
     * Getter for coreClock field
     * @return coreClock
     */
    public int getCoreClock() {
        return coreClock;
    }
    /**
     * Setter for coreClock field
     * @param coreClock 
     */
    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }
    /**
     * Getter for boostClock field
     * @return boostClock
     */
    public int getBoostClock() {
        return boostClock;
    }
    /**
     * Setter for boostClock field
     * @param boostClock 
     */
    public void setBoostClock(int boostClock) {
        this.boostClock = boostClock;
    }
    /**
     * Print all properties values 
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("GraphicCard \n \t\t\t\t\t\t Brand \t %s \n \t\t\t\t\t\t Description \t %s \n \t\t\t\t\t\t Memory \t %s \n \t\t\t\t\t\t CoreClock \t %s \n \t\t\t\t\t\t BoostClock \t %s",brand, description,memory, coreClock, boostClock);
        return result;
    }

}
