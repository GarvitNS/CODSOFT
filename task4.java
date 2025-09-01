/*TASK 4 OF MY INTERNSHIP IS PRESENTED HERE*/
import java.util.*;

// Class to handle currency conversion
class CurrencyConverter {
    double rate; 

    void setRate(String base, String target) {
        if (base.equalsIgnoreCase("USD") && target.equalsIgnoreCase("INR")) {
            rate = 83.0;
        } else if (base.equalsIgnoreCase("INR") && target.equalsIgnoreCase("USD")) {
            rate = 0.012;
        } else if (base.equalsIgnoreCase("USD") && target.equalsIgnoreCase("EUR")) {
            rate = 0.93;
        } else if (base.equalsIgnoreCase("EUR") && target.equalsIgnoreCase("USD")) {
            rate = 1.08;
        } else {
            rate = 1; 
            System.out.println("Unsupported currency pair, assuming 1:1 rate.");
        }
    }

    /*Convert aomunt                          */
    double convert(double amount) {
        return amount * rate;
    }
}

// Main class
public class CurrencyConverterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        System.out.print("Enter base currency (USD/INR/EUR): ");
        String base = sc.next();

        System.out.print("Enter target currency (USD/INR/EUR): ");
        String target = sc.next();

        System.out.print("Enter amount to cnvert: ");
        double amount = sc.nextDouble();

        CurrencyConverter converter = new CurrencyConverter();
        converter.setRate(base, target);

        double convertedAmount = converter.convert(amount);

        System.out.println(amount + " " + base + " = " + convertedAmount + " " + target);

        sc.close();
    }
}
