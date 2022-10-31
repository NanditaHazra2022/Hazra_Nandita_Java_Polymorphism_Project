/* Java program of operator overloading
 * to demonstrate Compile-time polymorphism.
 * In Java, only “+” operator can be overloaded:
 *    - To add integers
 *    - To concatenate strings
 */

// Operator overloading class.
class Operations
{   // Start of operations class block.

    // Method with 2 integer parameters to be added.
    static int plusOperation(int num1, int num2)
    { // Start of addition method.

        // Addition of two numbers using plus operator.
        return num1 + num2;

    }   // End of addition method.

    /* Method with the same name,
     * but 2 string parameters
     * to be concatenated
     * using plus operator. */
    static String plusOperation (String str1, String str2)
    {   // Start of concatenation method.

        // Concatenating 2 strings.
        return str1 + str2;

    }   // End of concatenation method.

}   // End of operations class.

// Main class.
public class OperatorOverloading
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Method to add two numbers
        int sum1 = Operations.plusOperation(2, 3);
        int sum2 = Operations.plusOperation(100,150);
        // Printing addition of two numbers.
        System.out.println
                (
                        "Addition of 2 and 3 = "
                                + sum1
                );
        System.out.println
                (
                        "Addition of 100 and 150 = "
                                + sum2
                );

        // Method to concatenate two strings
        String concat1 = Operations.plusOperation("Soft", "ware");
        String concat2 = Operations.plusOperation("Learn", "ing");

        // Printing concatenation of 2 strings
        System.out.println
                (
                        "Concatenation of two strings: Soft and ware = "
                                + concat1
                );
        System.out.println
                (
                        "Concatenation of two strings: Learn and ing = "
                                + concat2
                );

    }   // End of execution thread.

}   // End of main class.