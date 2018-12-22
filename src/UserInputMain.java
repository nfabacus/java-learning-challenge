import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        System.out.println("Hello - What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}
