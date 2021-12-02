package Task4_19;

import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nrItems;
        double total;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;
        int counter;
        int i=0;

        System.out.println("If you want quiq -> 0 if not -> 1");
        counter = input.nextInt();

        while (counter != 0) {

            System.out.printf("**** Saleperson %d****\n", ++i);
            System.out.println("Complete with number of each items");
            System.out.println("***************");
            System.out.print("|Items 1 : ");
            nrItems = input.nextInt();
            total1 = 239.99 * nrItems;

            System.out.print("|Items 2 : ");
            nrItems = input.nextInt();
            total2 = 129.75 * nrItems;

            System.out.print("|Items 3 : ");
            nrItems = input.nextInt();
            total3 = 99.95 * nrItems;

            System.out.print("|Items 4 : ");
            nrItems = input.nextInt();
            total4 = 350.89 * nrItems;
            System.out.println("***************");

            total = total1 + total2 + total3 + total4;

            System.out.printf("Wekly sales = %.2f$\n", total);
            System.out.printf("Wekly earrnings = %.2f$\n", 200 + total * 0.09);

            System.out.println();

            System.out.println("If you want add another information -> 1 if not -> 0");
            counter = input.nextInt();
        }

    }
}