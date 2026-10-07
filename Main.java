import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[]args){

        //This line prints the Hello world
        // System.out.println("Hello world!!");
        // /*This is multi-line 
        // comment */
        // System.out.println("This is my first java program");

            
        // VARIABLES
        
        // int age = 18;
        // int year = 2026;
        // int quantity = 5;

        // System.out.println("My age is "+age);
        // System.out.println("This is year "+year);
        // System.out.println("The quantity is "+quantity);


        // double price = 45.99;
        // double cgpa = 9.8;
        // double tempareture = 36.28;

        // System.out.println("$"+price);
        // System.out.println(cgpa);
        // System.out.println(tempareture);


        // char grade = 'A';
        // char section = 'C';
        // char currency = '₹';

        // System.out.println("grade "+grade);
        // System.out.println("section "+section);
        // System.out.println("currency "+currency);


        // boolean is_online = false;
        // boolean is_walking = false;
        // boolean is_singing = true;

        // System.out.println(is_online);
        // System.out.println(is_walking);
        // System.out.println(is_singing);

        // if(is_online == true){
        //     System.out.println("He is online!");
        // }else{
        //     System.out.println("He is not online!");
        // }


        // String name = "Tony stark";
        // String car = "BMW M4";
        // String food = "Chicken Biryani";
        

        // System.out.println("Hello "+ name);
        // System.out.println("My favorite car is "+car);
        // System.out.println("My favorite food is "+food);


        // double car_speed = 180.88;
        // String car_name = "BMW M2";
        // String color = "black";
        // int model = 2022;
        // boolean for_sale = false;


        // System.out.println("Car Name: "+car_name+"\n"+"Car speed: "+car_speed+"\n"+"Car color: "+color+"\n"+"Car model: "+model);
        // if(for_sale == true){
        //     System.out.println(car_name+" is for sale");
        // }else{
        //     System.out.println(car_name+" is not for sale");
        // }


        // String name = "Steve Harrington";
        // int gta = 6;
        // double pi = 3.14159;
        // char gender = 'M';
        // boolean isAdmin = true;

        // System.out.println("Name :"+name);
        // System.out.println("gta :"+gta);
        // System.out.println("pi :"+pi);
        // System.out.println("gender :"+gender);
        // System.out.println("isAdmin :"+isAdmin);



        // USER INPUTS IN JAVA

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = sc.next();
        
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        // System.out.print("Enter yout cgpa: ");
        // double cgpa = sc.nextDouble();

        // System.out.print("Are you a Student?: ");
        
        // System.out.println("Hello "+name);
        // System.out.println("You are "+age+ " years old");
        // System.out.println("My CGPA is: "+cgpa);


        // sc.close();


        // CALCULATE AREA OF RECTANGLE

        // double length = 0;
        // double width = 0;
        // double area = 0;

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter length of rectangle: ");  
        // length = sc.nextDouble();
        
        // System.out.print("Enter width of rectangle: ");  
        // width = sc.nextDouble();

        // area = length*width;

        // System.out.println("The area of rectangle is "+area+" cm²");


            // MAD LIBS GAME

        // Scanner sc = new Scanner(System.in);
      
        // String adjective1;
        // String noun;
        // String adjective2;
        // String verb;
        // String adjective3;

        // System.out.print("Enter a adjective1 (description):  ");
        // adjective1 = sc.nextLine();
        // System.out.print("Enter a noun: ");
        // noun = sc.nextLine();
        // System.out.print("Enter a adjective2 (description): ");
        // adjective2 = sc.nextLine();
        // System.out.print("Enter a verb end with -ing(action): ");
        // verb = sc.nextLine();
        // System.out.print("Enter a adjective3 (description): ");
        // adjective3 = sc.nextLine();


        // System.out.println("Today i went to "+adjective1+ " zoo.");
        // System.out.println("In the zoo, i saw a "+noun+" that was "+adjective2);
        // System.out.println("And the "+noun+" is "+verb);
        // System.out.println("And i "+adjective3+ "in a zoo.");

        // sc.close();


                // ARITHEMATIC OPERATORS

        // int x = 10;
        // int y = 20;

        // int z = x+y;
        // int z = x-y;
        // int z = x*y;
        // int z = x/y;
        // int z = x%y;

        // System.out.println(z);

        // AUGAMENTED ASSIGNMENT OPERATOR

        // x += y;
        // x -= y;
        // x *= y;
        // x /= y;

        // System.out.println(x);


        // INCREMENT AND DECREMENT

        // x++;
        // System.out.println(x);
        // y++;
        // System.out.println(y);
        // x--;
        // System.out.println(x);


        // ORDER OF OPERATOR PRECEDENCES [P-E-D-M-A-S]
  
        // double result = 3 * (4 / 2) + 8 - 2;
        // System.out.println(result);


        
        // SHOPPING CART PROGRAM

        // Scanner sc = new Scanner(System.in);

        // String item;
        // double price;
        // int quantity;
        // double total;

        // System.out.print("Enter what you want to buy?: ");
        // item = sc.nextLine();
        // System.out.print("Enter the price of item?: ");
        // price = sc.nextDouble();
        // System.out.print("How many items do you want?: ");
        // quantity = sc.nextInt();

        // total = price*quantity;
        // System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        // System.out.println("Total bill amount is: $"+total);
        

        // sc.close();



            // CONDITIONAL STATEMENTS


    //    int id = 147258741;

    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter a id: ");
    //    int userid = sc.nextInt();

    //    if(userid == id){
    //     System.out.println("Entry passed!");
    //    }else{
    //     System.out.println("Entry failed!");
    //    }


    // EXERCISE 2
    // int marks;

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter your marks: ");
    // marks = sc.nextInt();

    // if(marks >= 90 && marks <= 100){
    //     System.out.println("Disticntion!");
    // }else if (marks >= 80 && marks <= 89){
    //     System.out.println("First class!");
    // }else if(marks >= 70 && marks <= 79){
    //     System.out.println("Second class");
    // }else if(marks >= 50 && marks <= 69){
    //     System.out.println("PASS");
    // }else{
    //     System.out.println("Fail");
    // }

    // String name;

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your name: ");
    // name = sc.nextLine();

    // if(name.isEmpty() == true){
    //     System.out.println("You haven't entered name yet!");
    // }else{
    //     System.out.println("Hello "+name);
    // }


        // RANDOM NUMBERS

    // Random random = new Random();

    // int num = random.nextInt(1, 6+1);
    // System.out.println(num);     

    // double num = random.nextDouble(1, 7);
    // System.out.print(num);

    // boolean isHeads;
    // isHeads = random.nextBoolean();
    
    // if(isHeads){
    //     System.out.println("Heads");
    // }else{
    //     System.out.println("Tails");
    // }


                // MATH CLASS

            // System.out.println(Math.PI);
            // System.out.println(Math.E);

            // double result = Math.pow(5, 2);
            // double result = Math.sqrt(9);
            // double result = Math.round(52.4);
            // double result = Math.ceil(24.1);
            // double result = Math.floor(42.1);
            // double result = Math.max(47, 255);
            // double result = Math.min(14, 5);

            // System.out.println(result);


            // Scanner sc = new Scanner(System.in);

            // double a;
            // double b;

            // System.out.print("Enter the length of angle A: ");
            // a = sc.nextDouble();
            // System.out.print("Enter the length of angle B: ");
            // b = sc.nextDouble();

            // double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            // System.out.println("The hypotenuse of triangle is: "+c+"cm");

            // double radius;
            // double circumference;
            // double area;
            // double volume;

            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the radius: ");
            // radius = sc.nextDouble();

            // circumference = 2 * Math.PI * radius;
            // System.out.printf("The circumfernce is: %.2f\n",circumference);
            
            // area = Math.PI * Math.pow(radius, 2);
            // System.out.printf("The area of circle is: %.2f\n",area);
            
            // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            // System.out.printf("The volume  is: %.2f\n",volume);



            // PRINTF STATEMENT

        // String name = "Tony Stark";
        // char first_letter = 'T';
        // int age = 18;
        // double weight = 77.25;
        // boolean is_online = true;

        // System.out.printf("My name is %s\n",name);
        // System.out.printf("My name's first letter is %c\n",first_letter);
        // System.out.printf("I am %d years old\n",age);
        // System.out.printf("My weight is %.2f\n",weight);
        // System.out.printf("Is am i online: %b\n",is_online);


        // NESTED IF STATEMENT

        // boolean isStudent = true;
        // boolean isSenior = true;
        // double price = 12.99;

        // if(isStudent){
        //     if(isSenior){
        //         System.out.println("You are student and senoir so u get 30% Discount!");
        //         price = price * 0.7; 
        //         }
        //     else{
        //         System.out.println("You are student so u get 10% Discount!");
        //         price = price * 0.9;
        //     }
        // }
        // else{
        //     if(isSenior){
        //         System.out.println("You are senior so u get 20% Discount!");
        //         price = price * 0.8;
        //     }
        //     else{
        //         price *= 1;
        //     }
        // }
            
        // System.out.printf("The ticket price is: $%.2f\n",price);


                // STRING METHODS

        // String name = "Vishw mlji";

        // int length = name.length();
        // char letter = name.charAt(5);
        // int index = name.indexOf(' ');
        // int lastIndex = name.lastIndexOf('a');


        // System.out.println(length);
        // System.out.println(letter);
        // System.out.println(index);
        // System.out.println(lastIndex);
        // System.out.println(name.trim().toUpperCase());
        // System.out.println(name.trim().toLowerCase());
        // System.out.println(name.trim());
        // System.out.println(name.trim().replace('V', 'I'));
        // System.out.println(name.trim().isEmpty());
        // System.out.println(name.trim().isBlank());


        // if(name.contains("a")){
        //     System.out.println("Your name consists atleast one a");
        // }else{
        //     System.out.println("Your name didn't consists a");

        // }


        // String username = "abc";
        // String enteredUsername = "ABCD";

        // if(username.equalsIgnoreCase(enteredUsername)){
        //     System.out.println("LOGIN SUCCESSFULL");
        // }else{
        //     System.out.println("LOGIN FALIED!");
        // }
        

                // SUB STRING

            // String email;
            // String username;
            // String domain;

            // Scanner sc = new Scanner(System.in);

            // System.out.print("Enter your email: ");
            // email = sc.nextLine();

            // if(email.contains("@")){
            //     username = email.substring(0, email.indexOf("@"));
            //     domain = email.substring(email.indexOf("@") + 1);

            //     System.out.println("Username: "+username);
            //     System.out.println("Domain: "+domain);
            // }else{
            //     System.out.println("Invalid! Email must contain @");
            // }


                    // TERNARY OPERATOR IN JAVA
            
            // int score = 8;

            // String result = (score >= 35) ? "PASS" : "FAIL";
            // System.out.println(result);


            //EVEN OR ODD USING TERNARY OPERATOR
            // int number = 1;

            // String evenORodd = (number % 2 == 0) ? "EVEN" : "ODD";
            // System.out.println(evenORodd);2.20462


            // int timeofday = 12;

            // String time = (timeofday < 12) ? "A.M" : "P.M";

            // System.out.println(time);


            // int annualIncome = 10000;

            // String tax = (annualIncome < 800000) ? "0% TAX" : "5%TAX";
            // System.out.println(tax);


                // ENHANCED SWITCHES

            // String day = "Pizza";

            // switch(day){
            //     case "Monday" -> System.out.println("It's a weekday");
            //     case "Tuesday" -> System.out.println("It's a weekday");
            //     case "Wednesday" -> System.out.println("It's a weekday");
            //     case "Thursday" -> System.out.println("It's a weekday");
            //     case "Friday" -> System.out.println("It's a weekday");
            //     case "Saturday" -> System.out.println("It's a weekend");
            //     case "Sunday" -> System.out.println("It's a weekend");
            //     default -> System.out.println(day+" is not a day");
            // }


            // char ch;
            // Scanner sc = new Scanner(System.in);

            // System.out.print("Enter a character: ");
            // ch = sc.next().toLowerCase().charAt(0);

            // switch(ch){
            //     case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            //     default -> System.out.println("Consonent");
            // }            


                // LOGICAL OPERATORS

            // int marks = 74;

            // if(marks > 35 && marks < 60){
            //     System.out.println("second class");
            // }else if(marks > 60 && marks < 80){
            //     System.out.println("First class");
            // }

            
            // int num = 141;

            // if(num % 2 != 0){
            //     System.out.println("ODD");
            // }else{
                
            //     System.out.println("EVEN");
            // }



                        //  WHILE LOOP

            
        String name = "";

        Scanner sc = new Scanner(System.in);

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name);
                
     
    }
}



