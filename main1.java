import java.util.Scanner;
public class main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter consumption: ");
        double consumption = input.nextDouble();

        Customer customer = new Customer(consumption);

        System.out.println("\n===== CUSTOMER BILL =====");
        System.out.println("Consumption: " + customer.getConsumption() + " m3");
        System.out.println("Band: " + customer.getBand());
        System.out.println("Total Bill: UGX " + customer.getTotalBill());
    }
}
