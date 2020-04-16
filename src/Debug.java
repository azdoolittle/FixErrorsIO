import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        String name;
        int age;
        int dob;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Input your name: ");
        name = input.next();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your DOB year: ");
        dob = input.nextInt();
        System.out.printf("Summary:\n" +
                "Your name is %s.\n" +
                "Your age is %d.\n" +
                "Your birth year is %d.\n", name, age, dob);
    }
}
