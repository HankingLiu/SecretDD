package Main;

import java.util.Scanner;

public class SecretDecoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your 7 digit agent ID: ");
        int phoneNumber = scan.nextInt();

        int last4 = phoneNumber % 10000; // Gets remainder when divided by 10000
        System.out.println("Last four digits: " + last4);

        int d1 = last4 % 10;  //ones digits
        last4 = last4 / 10;
        int d2 = last4 % 10;
        last4 = last4 / 10;
        int d3 = last4 % 10;
        last4 = last4 / 10;
        int d4 = last4 % 10;

        System.out.println("Last four digits: " + d4 + ", " + d3 + ", " + d2 + "and " + d1);
        //%10 give the last digit because it calculates the remainder from right to left, or
// it means taking the first digit from right to left. /10 remove it because it has the same
//mechanism as %10, it takes away the first number from right to left

        System.out.print("Enter temperature in Celcius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        int C = 25;
        int F = (int) (1.8 * C + 32);
        System.out.println("Int version: " + F);
        //For some reason, it still gave me 77 even though it is in integer form

        int code = 1 + 2 * 5 + (3+7);
        System.out.println("Vault code: " + code);
//my prediction was 21, and I was correct, because it would first start by adding parenthesis
//then, it will move from left to right and do the multiplication, then add the three numbers up
//so we get 21
        System.out.println(5+3*2); //prediction: 11
        System.out.println((5+3) * 2); //prediction: 16
        System.out.println(10/3 * 2); //prediction:6
        System.out.println(10.0/3*2); //prediction: 6
// my last prediction was wrong because I didn't pay attention to the .0
//since it has .0, it is a double, so it should be 3.333333333333333334 * 2, which is
//6.666666666667
        System.out.println(1+2*3); //7
        System.out.println("Score: " + 1+2*3); //Score:7
        System.out.println("Score: " + (1+2*3)); //Score:7
        System.out.println(5/2 + 1.5); //3.5
        System.out.println(5.0/2 + 1.5); //4

/*
Reflection:
1. 7/3 give 2 because both numbers are in integer form, so the answer will also be
integer, removing the decimal point. If you want to get the decimal answer, add a .0 to either
after the 7 or 3, making them a double, so the answer will also be in double.
2. To extract the middle digit of a 3-digit number, you will first have to remove the first
number through /10, so it will now be 58. Then, you use % to extract the last number of 58(%10)
and you get 8.
3."Answer: " + 5 + 3 give "Answer: 53" because it is considered as a string, so the numbers
do not do addition, it is just simply put together. (5+3) gives you Answer:8 because it does
the addition first and then do the put together step.
4. It is dangerous to use all integers because you are unable to put in decimal points,
such as 2.3, so their will be a limit.
5. operator precedence specifies how tightly it binds two expressions together. Normal equations
go from left to right, "()" will be done first,then  "*" and "/" according to their order
from left to right, the one at the most left will be done first, and "+" and "-" is the same,
but are done after * and / are done, and also, the ones at the most left will be done first.
6. In order to get the first digit of a 4-digit number, instead of doing /10 three times,
I think we could do /1000, so there would only be 7 remaining, and then %10.
 */
    }



}


