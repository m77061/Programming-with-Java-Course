import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<String, String>();

        while (true) {
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            String[] tokens = input.split(", ");
            String name = tokens[0];
            String phoneNumber = tokens[1];

            if (phonebook.size() == 10) {
                break;
            }

            if (phonebook.containsKey(name)) {
                System.out.println("Already exists! Telephone: " + phonebook.get(name));
                continue;
            }

            phonebook.put(name, phoneNumber);
        }

        for (Map.Entry<String, String> kvp : phonebook.entrySet()) {
            System.out.println(kvp.getKey() + " - " + kvp.getValue());
        }
    }
}
