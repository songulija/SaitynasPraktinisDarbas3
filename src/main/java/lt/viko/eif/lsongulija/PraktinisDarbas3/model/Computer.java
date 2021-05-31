/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.PraktinisDarbas3.model;

/**
 * Represents Model object which has name, specifications properties
 * This class is responsible for getting, setting and printing properties
 * @author Lukas Songulija
 * version 1.0
 */
public class Computer {
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
     * Getter for name field
     * @return name
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GraphicCard getGpu() {
        return gpu;
    }

    public void setGpu(GraphicCard gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

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
