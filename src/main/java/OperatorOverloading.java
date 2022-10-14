/* Java program of operator overloading
 * to demonstrate Compile-time polymorphism.
 * In Java, only “+” operator can be overloaded:
 *    - To add integers
 *    - To concatenate strings
 */

// Operator overloading class.
class Operations
{   // Start of operations class.

    // Method with 2 integer parameters to be added.
    static void plusOperation(int num1, int num2)
    { // Start of addition method.

        // Addition of two numbers using plus operator.
        int result = num1 + num2;

        // Printing addition of two numbers.
        System.out.println
                (
                        "Plus operator use for adding two integers, result = "
                                + result
                );

    }   // End of addition method.

    /* Method with the same name,
     * but 2 string parameters
     * to be concatenated
     * using plus operator. */
    static void plusOperation (String str1, String str2)
    {   // Start of concatenation method.

        // Concatenating 2 strings.
        String result = str1 + str2;

        // Printing concatenation of 2 strings
        System.out.println
                (
                        "Plus operator use for concatenating two strings, result = "
                                + result
                );

    }   // End of concatenation method.

}   // End of operations class.

// Main class.
public class OperatorOverloading
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Method to add two numbers
        Operations.plusOperation(2, 3);

        // Method to concatenate two strings
        Operations.plusOperation("Soft", "ware");

    }   // End of execution thread.

}   // End of main class.