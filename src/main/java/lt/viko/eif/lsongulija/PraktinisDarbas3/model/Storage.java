/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents Storage object which has storageType, capacity, connectionType properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class Storage {
    private String storageType;
    private int capacity;
    private String connectionType;



    /**
     * Getter for storageType field
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }
    /**
     * Setter for storagageType field
     * @param storageType 
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
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
     * Setter for connectionType field
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }
    /**
     * Setter for connectionType field
     * @param connectionType 
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
    /**
     * Print all properties values
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("\t Storage: \n \t\t\t\t\t\t StorageType: \t %s \n \t\t\t\t\t\t Capacity: \t %s \n \t\t\t\t\t\t ConnectionType: \t %s",storageType, capacity, connectionType);
        return result;
    }
    
    
}
