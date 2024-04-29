//TASK 04 - CURRENCY CONVERTER
//CODESOFT


import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Here you would fetch real-time exchange rates from an API
        // For simplicity, let's assume a fixed conversion rate
        double conversionRate = 1.5; // Example conversion rate

        double convertedAmount = amount * conversionRate;

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}


