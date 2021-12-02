package Task4_23;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        int i;
        int number;
        int largest1 = 0;
        int largest2 = 0;

        Scanner input = new Scanner(System.in);

        for(i=0; i<10; i++) {
            System.out.printf("Enter the units for saleperson %d -- > ", i + 1);
            number = input.nextInt();

            if (number > largest1) {
                largest2 = largest2;
                largest1 = number;
            } else if (number > largest2) {
                largest2 = number;
            }
        }
        System.out.printf("The first largest number is %d and the second is %d ", largest1, largest2);
    }
}