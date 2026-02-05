package Level2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please type a byte");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please type a int");
                scanner.nextLine();
            }
        }

    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please type a float");
                scanner.nextLine();
            }
        }

    }
    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format Error. Please type a double");
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next();
                if (input.length() != 1) {
                    throw new InvalidInputException("You have to type just one character");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true)  {
            System.out.println(message);
            scanner.nextLine();
            return scanner.nextLine();
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new InvalidInputException("Type 'y' for yes and 'n' for no");
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
