import java.util.Scanner;

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

        double length = 0;
        double width = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");  
        length = sc.nextDouble();
        
        System.out.print("Enter width of rectangle: ");  
        width = sc.nextDouble();

        area = length*width;

        System.out.println("The area of rectangle is "+area+" cm²");
        
    }
}


        
