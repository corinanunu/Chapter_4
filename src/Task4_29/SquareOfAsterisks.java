package Task4_29;

import java.util.Scanner;

public class SquareOfAsterisks {


    public static void main(String[] args) {
        int side = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of square --> ");
        side = input.nextInt();

        if(side>0 && side < 20){
            for(int i = 0; i < side; i++){
                System.out.print("*");
            }
            System.out.print("**");
            System.out.println();

            for(int i = 0; i < side; i++){
                System.out.print("*");
                for(int j = 0; j < side; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for(int i = 0; i < side; i++){
                System.out.print("*");
            }
            System.out.print("**");
        }
    }
}