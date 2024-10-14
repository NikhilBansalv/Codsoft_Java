import java.util.*;

class CurrencyConverter {
    private HashMap<String, Double> exchangeRates;
    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("INR", 75.0);
        exchangeRates.put("JPY", 110.0);
    }
    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        if (!exchangeRates.containsKey(baseCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency selected.");
            return 0;
        }
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        double amountInUSD = amount / baseRate;
        double convertedAmount = amountInUSD * targetRate;
        return convertedAmount;
    }
    public void displayCurrencies() {
        System.out.println("Available currencies: " + exchangeRates.keySet());
    }
}

public class Task_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to the Currency Converter!");
        converter.displayCurrencies();

        System.out.print("Enter the base currency: ");
        String baseCurrency = sc.nextLine().toUpperCase();

        System.out.print("Enter the target currency: ");
        String targetCurrency = sc.nextLine().toUpperCase();

        System.out.print("Enter the amount you want to convert: ");
        double amount = sc.nextDouble();

        double convertedAmount = converter.convertCurrency(baseCurrency, targetCurrency, amount);

        if (convertedAmount != 0) {
            System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        } else {
            System.out.println("Conversion failed.");
        }
    }
}
