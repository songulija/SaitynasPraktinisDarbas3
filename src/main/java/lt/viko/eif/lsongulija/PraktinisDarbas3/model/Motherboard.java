/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents Motherboard object which has brand, compatibleCpuBrand,ramType,maxRams,memorySlotsNumer properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class Motherboard {
    private String brand;
    private String compatibleCpuBrand;
    private String ramType;
    private int maxRams;
    private int memorySlotsNumer;
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
     * Getter for compatibleCpuBrand field
     * @return compatibleCpuBrand
     */
    public String getCompatibleCpuBrand() {
        return compatibleCpuBrand;
    }
    /**
     * Setter for compatibleCpuBrand field
     * @param compatibleCpuBrand 
     */
    public void setCompatibleCpuBrand(String compatibleCpuBrand) {
        this.compatibleCpuBrand = compatibleCpuBrand;
    }
    /**
     * Getter for ramType field
     * @return ramType
     */
    public String getRamType() {
        return ramType;
    }
    /**
     * Setter for ramType field
     * @param ramType 
     */
    public void setRamType(String ramType) {
        this.ramType = ramType;
    }
    /**
     * Getter for maxRams field
     * @return maxRams
     */
    public int getMaxRams() {
        return maxRams;
    }
    /**
     * Setter for maxRams field
     * @param maxRams 
     */
    public void setMaxRams(int maxRams) {
        this.maxRams = maxRams;
    }
    /**
     * Getter for memorySlotsNumer field
     * @return memorySlotsNumer
     */
    public int getMemorySlotsNumer() {
        return memorySlotsNumer;
    }
    /**
     * Setter for memorySlotsNumer field 
     * @param memorySlotsNumer 
     */
    public void setMemorySlotsNumer(int memorySlotsNumer) {
        this.memorySlotsNumer = memorySlotsNumer;
    }
    /**
     * Print all properties values
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("Motherboard \n \t\t\t\t\t\t Brand \t %s \n \t\t\t\t\t\t CompatibleCpuBrand \t %s \n \t\t\t\t\t\t RamType \t %s \n \t\t\t\t\t\t MaxRams \t %d \n \t\t\t\t\t\t MemorySlotsNumer \t %d",brand, compatibleCpuBrand,ramType,maxRams,memorySlotsNumer);
        return result;
    }
    
    
}
