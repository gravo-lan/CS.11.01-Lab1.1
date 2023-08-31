import java.util.*;

public class Pages {

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.print(age + "-year-olds should read at least " + (100-age) + " pages before giving up on a book.");
        scanner.close();
    }
}
