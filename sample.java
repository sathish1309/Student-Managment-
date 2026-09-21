import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT APPLICATION =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Student Mark: ");
        double mark = sc.nextDouble();

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Mark      : " + mark);

        if (mark >= 50) {
            System.out.println("Result    : PASS");
        } else {
            System.out.println("Result    : FAIL");
        }

        sc.close();
    }
}
