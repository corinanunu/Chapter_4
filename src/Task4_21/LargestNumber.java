package Task4_21;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int i;
        int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        for(i=0; i<10; i++){
            System.out.printf("Enter the units for saleperson %d -- > ", i+1);
            number =  input.nextInt();

            if(number > largest){
                largest = number;
            }
        }

        System.out.printf("The largest number is %d ", largest);
    }
}