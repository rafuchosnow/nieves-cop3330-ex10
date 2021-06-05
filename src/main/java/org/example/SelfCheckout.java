package org.example;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String itemOnePriceString = input.nextLine();
        float itemOnePriceNumber = Float.parseFloat(itemOnePriceString);

        System.out.print("Enter the quantity of item 1: ");
        String itemOneQuantityString = input.nextLine();
        float itemOneQuantityNumber = Float.parseFloat(itemOneQuantityString);

        System.out.print("Enter the price of item 2: ");
        String itemTwoPriceString = input.nextLine();
        float itemTwoPriceNumber = Float.parseFloat(itemTwoPriceString);

        System.out.print("Enter the quantity of item 2: ");
        String itemTwoQuantityString = input.nextLine();
        float itemTwoQuantityNumber = Float.parseFloat(itemTwoQuantityString);

        System.out.print("Enter the price of item 3: ");
        String itemThreePriceString = input.nextLine();
        float itemThreePriceNumber = Float.parseFloat(itemThreePriceString);

        System.out.print("Enter the quantity of item 3: ");
        String itemThreeQuantityString = input.nextLine();
        float itemThreeQuantityNumber = Float.parseFloat(itemThreeQuantityString);

        float subtotal = (itemOnePriceNumber * itemOneQuantityNumber) +
                         (itemTwoPriceNumber * itemTwoQuantityNumber) +
                         (itemThreePriceNumber * itemThreeQuantityNumber);
        double taxRate = 0.055;
        double tax = subtotal * taxRate;
        double totalSales = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalSales);
        

    }
}
