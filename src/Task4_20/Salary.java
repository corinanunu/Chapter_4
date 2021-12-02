package Task4_20;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        String name;
        int nrHours;
        double mPerHours;
        int counter;
        int i;

        Scanner input = new Scanner(System.in);



        System.out.println("How much all three made per hour: ");
        mPerHours = input.nextDouble();

        for(i=0; i<3; i++){
            System.out.printf("******* Employee %d ********\n", i+1);

            System.out.print("Enter the name --> ");
            name = input.nextLine();
            System.out.println();
            System.out.print("Enter the the numeber of worked hours --> ");
            nrHours = input.nextInt();

            if(nrHours <= 40){
                System.out.printf("The employee’s gross pay is %.2f", nrHours*mPerHours);
            }else{
                int difference = nrHours - 40;
                System.out.printf("The employee’s gross pay is %.2f ", (40*mPerHours)+(difference*mPerHours));
            }
            System.out.println();
            System.out.println();
        }

    }
}