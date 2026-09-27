// Compund Interest Calculator in java

import java.util.Scanner;

public class compoundInterestCalculator{
    public static void main(String[]args){

        double principle;
        double rate;
        int timecompounded;
        int years;
        double amount;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        principle = sc.nextDouble();
        
        System.out.print("Enter the interest rate (in %) :  ");
        rate = sc.nextDouble() / 100;
        
        System.out.print("Enter the number of time compounded: ");
        timecompounded = sc.nextInt();
        
        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate/timecompounded, timecompounded*years);

        System.out.printf("The total amount after %d is $%.2f\n", years, amount);

    }
}