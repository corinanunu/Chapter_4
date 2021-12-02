package Task4_18;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        int accountNumber;
        int initialBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;
        int counter;

        Scanner input = new Scanner(System.in);

        System.out.println("If you want quiq -> 0 if not -> 1");
        counter = input.nextInt();

        while(counter != 0){
            System.out.println("******** 1 Account ********");
            System.out.print("Enter Account Number > ");
            accountNumber = input.nextInt();
            System.out.print("Enter Initial Balance > ");
            initialBalance = input.nextInt();
            System.out.print("Enter Total Charges > ");
            charges = input.nextInt();
            System.out.print("Enter total Credits > ");
            credits = input.nextInt();
            System.out.print("Enter Credit Limit > ");
            creditLimit = input.nextInt();

            newBalance = initialBalance + charges - credits;
            System.out.printf("New Balance is > %d", newBalance);
            System.out.println();

            if(newBalance > initialBalance){
                System.out.println("Credit Limit Exceeded");
                break;
            }
            System.out.println("If you want quiq -> 0 if not -> 1");
            counter = input.nextInt();

        }

    }
}