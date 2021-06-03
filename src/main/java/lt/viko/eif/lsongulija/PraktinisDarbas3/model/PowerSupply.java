/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents PowerSupply object which has producer, powerWats,inputVoltage,operatingTemperature properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class PowerSupply {
    private String producer;
    private int powerWats;
    private String inputVoltage;
    private String operatingTemperature;

    /**
     * Getter for producer field
     * @return producer
     */
    public String getProducer() {
        return producer;
    }
    /**
     * Setter for producer field
     * @param producer 
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }
    /**
     * Getter for powerWats field
     * @return powerWats
     */
    public int getPowerWats() {
        return powerWats;
    }
    /**
     * Setter for powerWats field
     * @param powerWats 
     */
    public void setPowerWats(int powerWats) {
        this.powerWats = powerWats;
    }
    /**
     * Getter for inputVoltage field
     * @return inputVoltage
     */
    public String getInputVoltage() {
        return inputVoltage;
    }
    /**
     * Setter for inputVoltage field
     * @param inputVoltage 
     */
    public void setInputVoltage(String inputVoltage) {
        this.inputVoltage = inputVoltage;
    }
    /**
     * Getter for operatingTemperature field
     * @return operatingTemperature
     */
    public String getOperatingTemperature() {
        return operatingTemperature;
    }
    /**
     * Setter for operatingTemperature field
     * @param operatingTemperature 
     */
    public void setOperatingTemperature(String operatingTemperature) {
        this.operatingTemperature = operatingTemperature;
    }
    /**
     * Print all properties values
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("Power Supply \n \t\t\t\t\t\t Producer \t %s \n \t\t\t\t\t\t PowerWats \t %d \n \t\t\t\t\t\t InputVoltage \t %s, \n \t\t\t\t\t\t OperatingTemperature \t %s",producer, powerWats,inputVoltage,operatingTemperature);
        return result;
    }

}
