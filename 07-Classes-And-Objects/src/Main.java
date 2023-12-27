import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Computer myFirstComputer = new Computer("Lenovo", "Ideapad");
        Computer mySecondComputer = new Computer("Lenovo", "Legion", new BigDecimal(2000));
        
        House myFirstHouse = new House("Sofia", "unknown street", (short)120);
        House mySecondHouse = new House("Sofia", "unknown street", (short)120, new BigDecimal(120000));
    }
}
