/*
 * Author: Spencer Buchanan File Created: 2/1/2019 Last Edited: 2/1/2019 NOTES: This is just quick
 * and dirty, purely to fulfill the assignments requirements. I am working on something bigger, but
 * it was not done in time to submit.
 */

/*
 * Integration Project PSI 1
 * 
 * Goals: *List built-in data types *Greet user *Define the term "variable" *Define the term "scope"
 * *Describe a "final" variable *Describe what type casting is *Format a string with escape
 * sequences
 * 
 * Requirements: *Use a boolean *Use an int *Use a double *Use a String *Use a final *Use
 * typecasting *Use escape sequences
 * 
 */


public class Main {

  public static void main(String args[]) {
    System.out.print("Welcome! The following program goes over\n"
        + "some basic Java datatypes and information\n\n");

    System.out.println("What is a variable?");
    System.out
        .println("\tA variable is a space in memory that is reserved to store some information.");
    System.out
        .println("\tVariables are used when a value needs to be used in multiple places, or when\n"
            + "\tits value needs to be changed easily.");

    System.out.print("\nSome basic Java data types are:\n" + "\tboolean\n"
        + "\t\t*Stores either 'true' or 'false'\n" + "\tinteger\n" + "\t\t*Stores a number between "
        + Integer.MAX_VALUE + " and " + Integer.MIN_VALUE + "\n" + "\tdouble\n"
        + "\t\t*Stores a floating point number\n" + "\tString\n"
        + "\t\t*Not necessarily a variable, but a class to make objects which store text\n");

    System.out.print('\n');

    System.out
        .println("Variables have a \"Scope\", meaning that a variable can only be \"seen\" in its\n"
            + "\"room\" and in \"rooms\" inside of its own room");
    System.out
        .println("For example, lets create a variable \"couch\" and put it in the Main \"room\"");

    int couch = 15;

    System.out.println("\n\tThe value of couch is: " + couch + " and couch is an integer\n");

    System.out.println(
        "Now lets go into an if statement, which will be in the Main \"room\", and create\n"
            + "a new variable, this time a boolean");

    if (true) {
      boolean inBedRoom = true;
      System.out.println("\n\tThe value of inBedRoom is: " + inBedRoom);
      System.out.println("\tThe value of couch is: " + couch);
    }

    System.out
        .println("\nWhen we were in the if room, we could use 'inBedRoom' since it was in the if\n"
            + "statements room. We could also use 'couch' because it was outside of the if\n"
            + "room (the if statement was in the Main room)\n"
            + "However, now that we are out side of the if statements room, inBedRoom no longer\n"
            + "exists. If we were try to access 'inBedRoom', Java would yell at us that\n"
            + "\"inBedRoom cannot be resolved to a variable\"\n");

    System.out.println("Type casting is typically used to override a variables type, interpreting\n"
        + "the variable as its cast type.\n");
    System.out
        .print("For example, if we were to take our previously created couch varible, divide\n"
            + "it by two, and store it in a double variable, we would get: ");
    double couchHalved = couch / 2;
    System.out.println(couchHalved);

    System.out.println("\nSince couch is fifteen we should get 15/2 = 7.5, but since couch is an\n"
        + "integer we lose the digits after the decimal place.");
    System.out
        .println("We could typecast couch as a double though by placing '(double)' in front of\n"
            + "our variable couch. We would then have 'couchHalved = (double) couch / 2;'");
    couchHalved = (double) couch / 2;
    System.out.println("couchHalved now equals: " + couchHalved);

    System.out.println('\n');

    System.out.println(
        "Finally, a final variable is one which can not be changd after it is initialized\n"
            + "Though you can initialize a final variable after it has been declared, this is the\n"
            + "only time that this variable will be changeable");

    final int theFinalInteger;
    theFinalInteger = 42;

    System.out.println("theFinalInteger equals: " + theFinalInteger);

    // theFinalInteger = 30; can't do, java yells at us since theFinalInteger is a final

    System.out.println("theFinalInteger = 30; can't do, Java yells that\n"
        + "'theFinalInteger has already been assigned to!'");

    String goodbyeMessage = "\nThanks for reading, goodbye!";

    System.out.println(goodbyeMessage);

  }

}
