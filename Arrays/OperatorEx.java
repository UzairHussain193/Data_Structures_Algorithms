import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = s.nextInt();
        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid marks");
        } else {
            System.out.println("Invalid marks: ");
        }
    }
}
