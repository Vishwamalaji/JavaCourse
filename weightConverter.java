import java.util.Scanner;

public class weightConverter{
    public static void main(String[]args){

        double weight;
        double newWeight;
        int choice;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("WEIGHT CONVERTER PROGRAM");
        System.out.println("1: kgs to lbs");
        System.out.println("2: lbs to kgs");

        System.out.print("Enter the choice: ");
        choice = sc.nextInt();


        if(choice == 1){
            System.out.print("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n",newWeight);
        }else if(choice == 2){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453589;
            System.out.printf("The new weight in kgs is: %.2f\n",newWeight);
        }else{
            System.out.println("Invalid choice!");
        }

    }
}

