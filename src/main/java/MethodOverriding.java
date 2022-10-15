/* Java program to demonstrate
* run-time polymorphism
* overriding method.  */

// Super class.
class Shape
{   // Start of super class.

    // Method that will be overridden in subclass.
    void draw()
    {   // Start of method block.
        System.out.println
                (
                        "creating…"
                );
    }   // End of method block.

}

// Subclass 1.
class Square
        extends Shape
{   // Start of subclass 1.

    @Override   // Annotation
    void draw()
    {   // Start of method block.
        System.out.println
                (
                        "creating square…"
                );
    }   // End of method block.

}   // End of subclass 1.

// Subclass 2
class Triangle
        extends Shape
{   // Start of subclass 2.

    @Override   // Annotation
    void draw()
    {   // Start of method block.
        System.out.println
                (
                        "creating triangle…"
                );
    }   // End of method block.

}   // End of subclass 2.

// Subclass 3
class Pentagon
        extends Shape
{   // Start of subclass 3.

    @Override   // Annotation
    void draw()
    {   // Start of method block.
        System.out.println
                (
                        "creating pentagon…"
                );
    }   // End of method block.

}   // End of subclass 3.

//Main class.
public class MethodOverriding
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        Shape s;    // Super class reference variable.

        s=new Square(); // Subclass 1 object.

        s.draw();   // Calling method of Subclass 1.

        s=new Triangle(); // Subclass 2 object.

        s.draw();   // Calling method of Subclass 2.

        s=new Pentagon(); // Subclass 3 object.

        s.draw();   // Calling method of Subclass 3.

    }   // End of execution thread.

}   // End of main class.
