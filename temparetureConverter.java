import java.util.Scanner;

public class temparetureConverter{
    public static void main(String[]args){
        double temp;
        double newtemp;
        String unit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tempareture: ");
        temp = sc.nextDouble();
        System.out.print("Convert to celsius/Fahernite(C/F): ");
        unit = sc.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.2f %s\n",newtemp,unit);

        sc.close();

    }
}


