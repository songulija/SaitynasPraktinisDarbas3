/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;


/**
 * Represents Processor object which has name, cores, threads,baseFrequency,maxFrequency properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version: 1.0
 */
public class Processor {
    private String name;
    private int cores;
    private int threads;
    private double baseFrequency;
    private double maxFrequency;
    /**
     * Getter for name field
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Setter for name field
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for cores field
     * @return cores
     */
    public int getCores() {
        return cores;
    }
    /**
     * Setter for cores field
     * @param cores 
     */
    public void setCores(int cores) {
        this.cores = cores;
    }
    /**
     * Getter for threads field
     * @return threads
     */
    public int getThreads() {
        return threads;
    }
    /**
     * Setter for threads field
     * @param threads 
     */
    public void setThreads(int threads) {
        this.threads = threads;
    }
    /**
     * Getter for baseFrequency field
     * @return baseFrequency
     */
    public double getBaseFrequency() {
        return baseFrequency;
    }
    /**
     * Setter for baseFrequency field
     * @param baseFrequency 
     */
    public void setBaseFrequency(double baseFrequency) {
        this.baseFrequency = baseFrequency;
    }
    /**
     * Getter for maxFrequency
     * @return maxFrequency
     */
    public double getMaxFrequency() {
        return maxFrequency;
    }
    /**
     * Setter for maxFrequency
     * @param maxFrequency 
     */
    public void setMaxFrequency(double maxFrequency) {
        this.maxFrequency = maxFrequency;
    }
    /**
     * Print all properties values
     * @return result
     */
    @Override
    public String toString() {
        String result = String.format("Processor \n \t\t\t\t\t\t Name \t %s \n \t\t\t\t\t\t Coars \t %s \n \t\t\t\t\t\t Threads \t %s \n \t\t\t\t\t\t BaseFrequency \t %s \n \t\t\t\t\t\t MaxFrequency \t %s",name, cores,threads, baseFrequency, maxFrequency);
        return result;
    }

    
    

    
    
}
