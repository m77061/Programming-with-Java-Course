import java.math.BigDecimal;

public class House {
    private String townName;
    private String streetAddress;
    private byte floorsCount;
    private byte bedroomsCount;
    private BigDecimal priceUsd;
    private short sizeSquareMeters;
    private boolean hasGarage;
    private boolean hasWifi;
    
    public House(String townName, String streetAddress, short sizeSquareMeters) {
        this.setTownName(townName);
        this.setStreetAddress(streetAddress);
        this.setSizeSquareMeters(sizeSquareMeters);
    }
    
    public House(String townName, String streetAddress, short sizeSquareMeters, BigDecimal priceUsd) {
        this.setTownName(townName);
        this.setStreetAddress(streetAddress);
        this.setSizeSquareMeters(sizeSquareMeters);
        this.setPriceUsd(priceUsd);
    }
    
    public String getTownName() {
        return this.townName;
    }
    
    private void setTownName(String townName) {
        this.townName = townName;
    }
    
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    private void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    
    public byte getFloorsCount() {
        return this.floorsCount;
    }
    
    public void setFloorsCount(byte floorsCount) {
        this.floorsCount = floorsCount;
    }
    
    public byte getBedroomsCount() {
        return this.bedroomsCount;
    }
    
    public void setBedroomsCount(byte bedroomsCount) {
        this.bedroomsCount = bedroomsCount;
    }
    
    public BigDecimal getPriceUsd() {
        return this.priceUsd;
    }
    
    public void setPriceUsd(BigDecimal priceUsd) {
        this.priceUsd = priceUsd;
    }
    
    public short getSizeSquareMeters() {
        return this.sizeSquareMeters;
    }
    
    public void setSizeSquareMeters(short sizeSquareMeters) {
        this.sizeSquareMeters = sizeSquareMeters;
    }
    
    public boolean hasGarage() {
        return this.hasGarage;
    }
    
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
    
    public boolean hasWifi() {
        return this.hasWifi;
    }
    
    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
}
