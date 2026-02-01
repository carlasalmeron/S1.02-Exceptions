package Level2;

public class Main {
    public static void main(String[] args) {
        //Call methods
        int age = ConsoleReader.readInt("Type your age");
        System.out.println("Age: " + age);

        String name = ConsoleReader.readString("Type your name");
        System.out.println("Name: " + name);

        char typo = ConsoleReader.readChar("Type a character");
        System.out.println("Character: " + typo);

        boolean answer = ConsoleReader.readYesNo("Do you like books? (y/n):" );
        System.out.println("Answer: " + answer);
    }
}
