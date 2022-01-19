/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * The zero.
    */
    private static final int ZERO = 0;
    /**
    * The two.
    */
    private static final int TWO = 2;
    /**
    * The four.
    */
    private static final int FOUR = 4;
    /**
    * The two hundred.
    */
    private static final int TWOOO = 200;
    /**
    * The five hundred.
    */
    private static final int FIVEOO = 500;
    /**
    * The spare.
    */
    private static final String SPARE = "\n";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner userInputInt2 = new Scanner(System.in);
        final Scanner userInputString2 = new Scanner(System.in);
        final Bike aStack2 = new Bike(ZERO, TWOOO, TWO);

        System.out.print("Please enter the cadence of the bike : ");
        final int cadence = userInputInt2.nextInt();
        aStack2.setCadence(cadence);

        System.out.print("Please enter the Colour of the bike: ");

        final String color2 = userInputString2.nextLine();

        aStack2.setColour(color2);

        System.out.println(SPARE
                           + "Cadence: " + aStack2.getCadence()
                           + SPARE
                           + "Colour: " + aStack2.getColour()
                           + SPARE
                           + "Tires: " + aStack2.getTires()
                           + SPARE
                           + "Speed: " + aStack2.getSpeed()
                           + SPARE
                           + "Max Speed: " + aStack2.getMaxSpeed()
                           + SPARE);

        System.out.print(
            "Please enter the ring Bicycle bell of the bike(y/n): "
        );
        final String ring = userInputString2.nextLine();
        aStack2.ringBell(ring);
        System.out.println("\nDone.");
    }
}

