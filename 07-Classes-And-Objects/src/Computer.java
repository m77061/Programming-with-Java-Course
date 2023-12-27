import java.math.BigDecimal;

public class Computer {
    private String brand;
    private String model;
    private short productionYear;
    private BigDecimal priceBgn;
    private boolean isTurnedOn;
    private byte ramMemoryGB;
    private short hddMemoryGB;
    private OperatingSystem operatingSystem;

    public Computer(String brand, String model) {
        this.turnOff();
        this.setOperatingSystem(OperatingSystem.None);
        this.setBrand(brand);
        this.setModel(model);
    }

    public Computer(String brand, String model, BigDecimal priceBgn) {
        this.turnOff();
        this.setOperatingSystem(OperatingSystem.None);
        this.setBrand(brand);
        this.setModel(model);
        this.setPriceBgn(priceBgn);
    }

    public String getBrand() {
        return this.brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public short getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(short productionYear) {
        this.productionYear = productionYear;
    }

    public BigDecimal getPriceBgn() {
        return this.priceBgn;
    }

    public void setPriceBgn(BigDecimal priceBgn) {
        this.priceBgn = priceBgn;
    }

    public boolean isTurnedOn() {
        return this.isTurnedOn;
    }

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }

    public byte getRamMemoryGB() {
        return this.ramMemoryGB;
    }

    public void setRamMemoryGB(byte ramMemoryGB) {
        this.ramMemoryGB = ramMemoryGB;
    }

    public short getHddMemoryGB() {
        return this.hddMemoryGB;
    }

    public void setHddMemoryGB(short hddMemoryGB) {
        this.hddMemoryGB = hddMemoryGB;
    }

    public OperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
