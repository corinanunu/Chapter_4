package Task4_24;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr = 0;
        System.out.println("Enter 1 or 2 for end the program");
        while( nr !=1 && nr !=2){
            System.out.print("Enter the number --> ");
            nr = input.nextInt();
            //System.out.println("Enter 1 or 2 for end the program");
        }
    }
}