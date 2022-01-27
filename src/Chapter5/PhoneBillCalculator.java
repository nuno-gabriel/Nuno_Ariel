package Chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        System.out.println("Enter international calls minutes:");
        double International = scanner.nextDouble();
        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);
        double ring = calculateRoaming(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax, ring);
    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }
    public static double calculateRoaming(double RoamingCalls){
        double rate = 1.50;
        double ring = RoamingCalls * rate;
        return ring;
    }
    public static void calculateAndPrintBill(double base, double overage, double tax, double ring){
        double finalTotal = base + overage + tax + ring;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Roaming: $" + String.format("%.2f", ring));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}