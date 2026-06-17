public class Customer {

    private double consumption;
    private String band;
    private double rate;
    private double serviceCharge;
    private double totalBill;

    public Customer(double consumption) {
        this.consumption = consumption;
        calculateBill();
    }

    private void calculateBill() {

        if (consumption <= 5) {
            band = "LIFELINE";
            rate = 1000;
            serviceCharge = 2000;
        } else if (consumption <= 20) {
            band = "DOMESTIC LOW";
            rate = 2500;
            serviceCharge = 4000;
        } else if (consumption <= 50) {
            band = "DOMESTIC HIGH";
            rate = 3800;
            serviceCharge = 7500;
        } else if (consumption <= 100) {
            band = "COMMERCIAL";
            rate = 4500;
            serviceCharge = 15000;
        } else if (consumption <= 300) {
            band = "INDUSTRIAL";
            rate = 5200;
            serviceCharge = 40000;
        } else {
            band = "INSTITUTIONAL";
            rate = 6000;
            serviceCharge = 90000;
        }

        totalBill = (consumption * rate) + serviceCharge;
    }

    public String getBand() {
        return band;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public double getConsumption() {
        return consumption;
    }
}