/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents Computer object which has name, manufacturer fields
 * It also has multiple classes connected with it like: GraphicCard, PowerSupply
 * Ram, Storage and more
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version 1.0
 */
public class Computer {
    /**
     * Defining all fields and objects
     */
    private String name;
    private String manufacturer;
    private int id;
    private String operationSystem;

    private GraphicCard gpu;
    private Motherboard motherboard;
    private PowerSupply powerSupply;
    private Processor cpu;
    private Ram ram;
    private Storage storage;


    /**
     * Constructor for Computers object.When
     * creating computers object we can provide
     * all these fields values
     * @param name
     * @param manufacturer
     * @param id
     * @param gpuBoostClock
     * @param gpuBrand
     * @param gpuCoreClock
     * @param gpuDescription
     * @param gpuMemory
     * @param mothBrand
     * @param mothCompCpu
     * @param mothMaxRam
     * @param mothMemorySlots
     * @param mothRamType
     * @param operationSystem
     * @param psInputVoltage
     * @param psOperatingTemp
     * @param psPowerWats
     * @param psProducer
     * @param cpuBaseFreq
     * @param cpuCores
     * @param cpuMaxFreq
     * @param cpuName
     * @param cpuThreads
     * @param ramCapacity
     * @param ramMemoryVolt
     * @param ramTacticalFreq
     * @param storageCapacity
     * @param storageConnectionType
     * @param storageStorType
     */
    public Computer(String name, String manufacturer, int id, int gpuBoostClock, String gpuBrand, int gpuCoreClock, String gpuDescription,
                    String gpuMemory, String mothBrand, String mothCompCpu, int mothMaxRam, int mothMemorySlots, String mothRamType,
                    String operationSystem, String psInputVoltage, String psOperatingTemp, int psPowerWats, String psProducer,
                    double cpuBaseFreq, int cpuCores, double cpuMaxFreq, String cpuName, int cpuThreads,
                    int ramCapacity, double ramMemoryVolt, int ramTacticalFreq,
                    int storageCapacity, String storageConnectionType, String storageStorType){

        this.name = name;
        this.manufacturer = manufacturer;
        this.id = id;
        this.operationSystem = operationSystem;

        GraphicCard gpu = new GraphicCard();
        gpu.setBoostClock(gpuBoostClock);
        gpu.setBrand(gpuBrand);
        gpu.setCoreClock(gpuCoreClock);
        gpu.setDescription(gpuDescription);
        gpu.setMemory(gpuMemory);
        this.gpu = gpu;

        Motherboard motherboard = new Motherboard();
        motherboard.setBrand(mothBrand);
        motherboard.setCompatibleCpuBrand(mothCompCpu);
        motherboard.setMaxRams(mothMaxRam);
        motherboard.setMemorySlotsNumer(mothMemorySlots);
        motherboard.setRamType(mothRamType);
        this.motherboard = motherboard;

        PowerSupply powerSupply = new PowerSupply();
        powerSupply.setInputVoltage(psInputVoltage);
        powerSupply.setOperatingTemperature(psOperatingTemp);
        powerSupply.setPowerWats(psPowerWats);
        powerSupply.setProducer(psProducer);
        this.powerSupply = powerSupply;

        Processor cpu = new Processor();
        cpu.setBaseFrequency(cpuBaseFreq);
        cpu.setCores(cpuCores);
        cpu.setMaxFrequency(cpuMaxFreq);
        cpu.setName(cpuName);
        cpu.setThreads(cpuThreads);
        this.cpu = cpu;

        Ram ram = new Ram();
        ram.setCapacity(ramCapacity);
        ram.setMemoryVoltage(ramMemoryVolt);
        ram.setTacticalFrequency(ramTacticalFreq);
        this.ram = ram;

        Storage storage = new Storage();
        storage.setCapacity(storageCapacity);
        storage.setConnectionType(storageConnectionType);
        storage.setStorageType(storageStorType);
        this.storage = storage;

    }

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
     * Getter for manufacturer field
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Setter for manufacturer field
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Getter for id field
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for Id field
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for GPU object
     * @return gpu
     */
    public GraphicCard getGpu() {
        return gpu;
    }

    /**
     * Setter for gpu object
     * @param gpu
     */
    public void setGpu(GraphicCard gpu) {
        this.gpu = gpu;
    }

    /**
     * Getter for motherboard object
     * @return motherboard
     */
    public Motherboard getMotherboard() {
        return motherboard;
    }

    /**
     * Setter for motherboard object
     * @param motherboard
     */
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * Getter for powerSupply object
     * @return powerSupply
     */
    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    /**
     * Setter for powerSupply object
     * @param powerSupply
     */
    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    /**
     * Getter for processor object
     * @return cpu
     */
    public Processor getCpu() {
        return cpu;
    }

    /**
     * Setter for cpu object
     * @param cpu
     */
    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    /**
     * Getter for ram object
     * @return ram
     */
    public Ram getRam() {
        return ram;
    }

    /**
     * Setter for ram object
     * @param ram
     */
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    /**
     * Getter for storage object
     * @return storage
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Setter for storage object
     * @param storage
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * Getter for operationSystem field
     * @return
     */
    public String getOperationSystem() {
        return operationSystem;
    }

    /**
     * Setter for operationSystem
     * @param operationSystem
     */
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    /**
     * Print all properties and objects values
     * @return all computer properties as string
     */
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", id=" + id +
                ", gpu=" + gpu +
                ", motherboard=" + motherboard +
                ", powerSupply=" + powerSupply +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", storage=" + storage +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
