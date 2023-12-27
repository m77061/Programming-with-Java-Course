import java.util.Scanner;

public class ProductPriceCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String productName = scanner.nextLine();
		String townName = scanner.nextLine();
		double price = 0;

		if ("coffee".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 0.8;
					break;
				case "plovdiv":
					price = 0.7;
					break;
				case "varna":
					price = 0.6;
					break;
				case "burgas":
					price = 0.4;
					break;
			}
		} else if ("mineral water".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 1.1;
					break;
				case "plovdiv":
				case "burgas":
					price = 1; // Plovdiv and Burgas - the same price
					break;
				case "varna":
					price = 0.8;
					break;
			}
		} else if ("hot chocolate".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 1.2;
					break;
				case "plovdiv":
					price = 1;
					break;
				case "varna":
					price = 1.4;
					break;
				case "burgas":
					price = 0.7;
					break;
			}
		} else if ("beer".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 1.6;
					break;
				case "plovdiv":
					price = 1.5;
					break;
				case "varna":
					price = 1.1;
					break;
				case "burgas":
					price = 1.25;
					break;
			}
		} else if ("energy drink".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 2.4;
					break;
				case "plovdiv":
					price = 1.9;
					break;
				case "varna":
					price = 2.5;
					break;
				case "burgas":
					price = 3;
					break;
			}
		} else if ("coca-cola".equalsIgnoreCase(productName)) {
			switch (townName.toLowerCase()) {
				case "sofia":
					price = 2.2;
					break;
				case "plovdiv":
					price = 1.9;
					break;
				case "varna":
					price = 1.8;
					break;
				case "burgas":
					price = 1.7;
					break;
			}
		}

		System.out.println(price);
	}
}
