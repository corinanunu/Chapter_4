package Task4_17;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;
        int counter;
        int i = 0;

        Scanner input = new Scanner((System.in));
        System.out.print("Enter data --> 0 or --> -1 for Exit >  ");
        counter = input.nextInt();


        while(counter != -1){
            System.out.print("Enter miles: ");
            miles = input.nextInt();
            System.out.print("Enter gallons: ");
            gallons = input.nextInt();
            totalMiles += miles;
            totalGallons += gallons;
            System.out.printf("********* %d Trip ********\n", ++i);
            System.out.printf("Miles > %d\n", miles);
            System.out.printf("Gallons > %d\n", gallons);
            System.out.printf("MPG (miles/gallons) > %.2f\n", (double)miles/gallons);
            System.out.println("**************************");
            System.out.println();

            System.out.print("Enter data --> 0 or --> -1 for Exit >  ");
            counter = input.nextInt();
        }

        System.out.println("******** TOTAL **********");
        System.out.printf("Total miles > %d\n", totalMiles);
        System.out.printf("Total gallons > %d\n", totalGallons);
        System.out.printf("Total MPG > %.2f\n",(double)totalMiles/totalGallons);


    }
}