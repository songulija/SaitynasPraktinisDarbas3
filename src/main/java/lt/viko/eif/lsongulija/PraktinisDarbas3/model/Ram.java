/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;


/**
 * Represents Ram object which has capacity, memoryVoltage,tacticalFrequency properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class Ram {
    private int capacity;
    private double memoryVoltage;
    private int tacticalFrequency;

    /**
     * Getter for capacity field
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * Setter for capacity field
     * @param capacity 
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     * Getter for memoryVoltage
     * @return memoryVoltage
     */
    public double getMemoryVoltage() {
        return memoryVoltage;
    }
    /**
     * Setter for memoryVoltage field
     * @param memoryVoltage 
     */
    public void setMemoryVoltage(double memoryVoltage) {
        this.memoryVoltage = memoryVoltage;
    }
    /**
     * Getter for tacticalFrequency field
     * @return tacticalFrequency
     */
    public int getTacticalFrequency() {
        return tacticalFrequency;
    }
    /**
     * Setter for tacticalFrequency field
     * @param tacticalFrequency 
     */
    public void setTacticalFrequency(int tacticalFrequency) {
        this.tacticalFrequency = tacticalFrequency;
    }
    /**
     * Print all properties values
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("Rams\n \t\t\t\t\t\t Capacity \t %s \n \t\t\t\t\t\t MemoryVoltage \t %s \n \t\t\t\t\t\t TacticalFrequency \t %s",capacity, memoryVoltage,tacticalFrequency);
        return result;
    }
    
    
}
