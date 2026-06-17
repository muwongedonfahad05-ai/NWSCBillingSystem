import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();

        int lifeline = 0;
        int domesticLow = 0;
        int domesticHigh = 0;
        int commercial = 0;
        int industrial = 0;
        int institutional = 0;

        double totalRevenue = 0;

        for (int i = 1; i <= 6; i++) {

            double consumption = 0;

            while (true) {

                try {

                    System.out.println("\nCustomer " + i);
                    System.out.print("Enter consumption: ");

                    consumption = input.nextDouble();

                    if (consumption < 0) {
                        throw new Exception();
                    }

                    break;

                } catch (Exception e) {

                    System.out.println("Invalid input. Try again.");

                    input.nextLine();
                }
            }

            Customer customer = new Customer(consumption);

            customers.add(customer);

            totalRevenue += customer.getTotalBill();

            switch (customer.getBand()) {

                case "LIFELINE":
                    lifeline++;
                    break;

                case "DOMESTIC LOW":
                    domesticLow++;
                    break;

                case "DOMESTIC HIGH":
                    domesticHigh++;
                    break;

                case "COMMERCIAL":
                    commercial++;
                    break;

                case "INDUSTRIAL":
                    industrial++;
                    break;

                case "INSTITUTIONAL":
                    institutional++;
                    break;
            }
        }

        System.out.println("\n========== CUSTOMER DETAILS ==========");

        for (Customer c : customers) {

            System.out.println("Consumption: " + c.getConsumption()
                    + " m3 | Band: " + c.getBand()
                    + " | Bill: UGX " + c.getTotalBill());
        }

        System.out.println("\n========== SUMMARY ==========");

        System.out.println("LIFELINE: " + lifeline);
        System.out.println("DOMESTIC LOW: " + domesticLow);
        System.out.println("DOMESTIC HIGH: " + domesticHigh);
        System.out.println("COMMERCIAL: " + commercial);
        System.out.println("INDUSTRIAL: " + industrial);
        System.out.println("INSTITUTIONAL: " + institutional);

        System.out.println("Total Revenue: UGX " + totalRevenue);

        System.out.println("Average Bill: UGX "
                + (totalRevenue / customers.size()));
    }
}