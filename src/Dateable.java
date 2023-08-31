import java.util.*;

public class Dateable {

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age + "-year-olds should date somebody who is at least " + (age/2 + 7) + " years old.");
        scanner.close();
    }
}
