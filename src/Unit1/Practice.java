package Unit1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Question 1
//        System.out.println("Enter a mass in kg: ");
//        double mass = scanner.nextDouble();
//
//        System.out.println("Enter a speed in m/s: ");
//        double speed = scanner.nextDouble();
//
//        double KE = 0.5 * mass * Math.pow(speed, 2); //this is how you square
//        System.out.println("Kinetic energy is " + KE + " joules");

//Kinetic Energy calculator: KE = 1/2 * m * v^2
//Ask user for mass(kg) as double
//velocity(m/s) as double
//Then compute and print: "Kinetic energy: x.xx joules"

        //Question 2
//        System.out.println("Enter first int value: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Enter second int value: ");
//        int b = scanner.nextInt();
//
//        System.out.println("Enter third int value: ");
//        int c = scanner.nextInt();
//
//        double average = (a + b + c) / 3.0; //or * 1.0/3, both gets you a double result
//        System.out.println("The average of your numbers is: " + average);

        //Even or positive
        //%2 == 0 and >0 for even and positive

        //Question 3
//        System.out.println("Enter integer: ");
//        int number = scanner.nextInt();
//
//        if(number % 2 == 0) {
//            if(number > 0) {
//                System.out.println("The number is even and positive");
//            } else {
//                System.out.println("the number is even and not positive");
//            }
//        } else {
//            if(number > 0) {
//                System.out.println("the number is odd and positive");
//            } else {
//                System.out.println("the number is odd and not positive");
//            }
//        }
                    // sum of first N integers
                    //sum = n * (n+1) / 2
        //Question 4
        System.out.println("Enter how many integers you want to sum: ");
        int n = scanner.nextInt();

        int sum = n * (n+1) / 2;
        System.out.println("The sum of 1 to " + n + " : " + sum);
        double x = (int) (5.5-2.5);
        double y = (int) 5.5-2.5;
        System.out.println(x-y);


    }
}
