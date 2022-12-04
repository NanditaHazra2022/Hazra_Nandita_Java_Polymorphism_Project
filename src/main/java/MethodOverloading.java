/* Java program to demonstrate
* compile type polymorphism
* by method overloading.
* Different types of parameters:
* integer and decimal
* are used to do the same. */
// Main class.
public class MethodOverloading
{   // Start of main class.

    // Starting point of execution.
    public static void main (String[] args)
    {   // Start of execution thread.

        // Printing multiplication of 2 integer numbers.
        System.out.println
                (
                        "Multiplication of 2 integer numbers: 2 and 4 = "
                                + Multiply.multiplyTwoNumbers (7, 5)
                );

        System.out.println
                (
                        "Multiplication of 2 integer numbers: 3 and 6 = "
                                + Multiply.multiplyTwoNumbers (3, 6)
                );


        // Printing multiplication of 2 double numbers.
        System.out.println
                (
                        "Multiplication of 2 double numbers: 5.5 and 6.3 = "
                                + Multiply.multiplyTwoNumbers (5.5, 6.3)
                );

        System.out.println
                (
                        "Multiplication of 2 double numbers: 1.8 and 9.2 = "
                                + Multiply.multiplyTwoNumbers (11.3, 9.2)
                );

    }   // End of execution thread.

}   // End of main class.

// Method overloading class.
class Multiply
{   // Start of method overloading class.

    // Method with 2 integer parameters.
    static int multiplyTwoNumbers (int a, int b)
    {

        return a * b;

    }

    // Method with the same name but 2 double parameters.
    static double multiplyTwoNumbers (double a, double b)
    {

        return a * b;

    }

}   // End of method overloading class.

