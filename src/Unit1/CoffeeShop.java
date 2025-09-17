package Unit1;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number of latte?");
        int latte = scan.nextInt();
        System.out.println("I want " + (latte) + " cups of latte");
        double price = scan.nextDouble();
        System.out.println("the price is " + (price) + "$ per cup");
        double tip = scan.nextDouble();
        System.out.println("Thank you for your " + (tip) + "$ tip");
        double total = latte * price + tip;
        System.out.println("Total: $" + total);
/*Research findings: When we assign an int to a double, an "implicit type conversion"
will happen, where the int value
will automatically be converted into the equivalent double value. When we assign a double
to an int, it will either lose the data or the double value will be discarded and turn into a int
value, for example, 3.99 will turn into 3, no rounding will occur because this is a defult
double x=5 is allowed because the system will automatically turn it into 5.00, which is valid
int y=5.5 will likely work when the system turn it into 5
 */
        System.out.println("\n--- Experiment 1: Integer Division ---");
        System.out.print("How many cookies? ");
        int cookies = scan.nextInt();
        System.out.print("How many kids? ");
        int kids = scan.nextInt();

        int cookiesPerKid = cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKid + " cookies");
//It doesn't show 2.333 because the command it "int" integers, so if the system get decimal points
// It will automatically discard it and turn it into the whole number it is on (no rounding)
//If you want to show decimal, change "int" to "double"
        System.out.println("\n--- Experiment 2: Bonus Points ---");
        int loyaltyPoints = 10;

        System.out.println("Points: " + loyaltyPoints);
        loyaltyPoints += 5;  //Add 5
        System.out.println("After bonus: " + loyaltyPoints);

        loyaltyPoints *= 2; //Double for weekend promo
        System.out.println("After promo: " + loyaltyPoints);

        int a = 5;
        int b = 5;
        int c = ++a;  //prefix: increment THEN assign
        int d = b++;  // postfix: assign THEN increment

        System.out.println("c = " + c + ", a = " + a); //c=6,a=6
        System.out.println("d = " + d + ", b = " + b);


        double itemPrice = 3.99;
        int quantity = 2;
        double subtotal = itemPrice * quantity;

        //BUG: won't compile!
        System.out.println("Rounded total: " + (int) subtotal);
        /*int roundedPrice = subtotal does not work because subtotal=double and roundedPrice is a
         kind of int, you cannot assign a double into an int because this could make you lose the
         decimal parts of the data. The one above is correct because we cast the double into the int
        , so it is kind of giving java the permission to chop off the decimal point for us, because
         it is valid for integer to double, for example 5 to 5.0, but not 5.6 to 5 without the user's
         permission.
         */

        /*
        Reflection questions:
        1. When we store a .double in an int, it will not compile, because that would lose the data
        which is the decimal points, for example, java cannot take the 4 from 3.4 without permission
        since this will cause data lose.
        2. 5/2 gives 2 not 2.5 because when the system get permission to cast double into the integer
        category, it removes the decimal, it does not round it.
        3. We use explicit casting when we have two different data types such as double and int, and we
        need to use explicit casting because we can turn int into double but we cannot turn double
        into int, but if we give the system the permission to remove the decimal point of the double,
        it will automatically do it again next time.
        4. Don't understand
        5. I was surprised by how careful Java is, to prevent the program from corrupting, caring about
        almost all kind of details.
         */



    }
}
