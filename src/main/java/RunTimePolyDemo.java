/* Java program to demonstrate
* run-time polymorphism. */

//Main class.
public class RunTimePolyDemo
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        Engine e;    // Super class reference variable.

        e = new PetrolEng();    // Referring subclass1.
        e.start();  // Invoking subclass1 method.

        e = new DieselEng();    // Referring subclass2.
        e.start();  // Invoking subclass2 method.

    }   // End of execution thread.

}   // End of main class.


// Super class.
class Engine
{   // Start of super class block.

    // Method that will be overridden in subclasses.
    void start()
    {   // Start of method block.
        System.out.println
                (
                        "Starting engine…"
                );
    }   // End of method block.

}

// Subclass 1.
class PetrolEng
        extends Engine
{   // Start of subclass 1.

    @Override   // Annotation
    void start()
    {   // Start of method block.
        System.out.println
                (
                        "Petrol combustion engine starting..."
                );
    }   // End of method block.

}   // End of subclass 1.

// Subclass 2
class DieselEng
        extends Engine
{   // Start of subclass 2.

    @Override   // Annotation
    void start()
    {   // Start of method block.
        System.out.println
                (
                        "Diesel combustion engine starting..."
                );
    }   // End of method block.

}   // End of subclass 2.

