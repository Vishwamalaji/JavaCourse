import java.util.Scanner;;

public class Calculator {
    public static void main(String[]args){
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter an operator(+,-,*,/,^): ");
        operator = sc.next().charAt(0);
        
        System.out.print("Enter the number2: ");
        num2 = sc.nextDouble();
        
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperation = false;
                }else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {System.out.println(operator+" is an invalid operator!");
            validOperation = false;
        }
        
    }
    
    if (validOperation){
        System.out.println(result);
    }
    
}
}