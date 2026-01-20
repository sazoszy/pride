import java.util.Scanner;

public class StudentInfo{

    public static void main(String[] args) {

        String studentName = "Szao";
        int age = 18;
        double grade = 93.4;
        char section = 'A';
        boolean passed = true;

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
        System.out.println("Passed: " + passed);

        int x = 7; int y = 6;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x == y = " + (x == y));

        boolean a = true; boolean b = false;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String nameInput = sc.nextLine();

        System.out.print("Enter Age: ");
        int Bage = sc.nextInt();

        System.out.print("Enter Grade: ");
        double Bgrade = sc.nextDouble();

        System.out.print("Enter Section: ");
        char Bsection = sc.next().charAt(0);

        boolean eligibleForCertificate = Bgrade >= 75;

        System.out.println("Student Name: " + nameInput);
        System.out.println("Age: " + Bage);
        System.out.println("Grade: " + Bgrade);
        System.out.println("Section: " + Bsection);
        System.out.println("Eligible for Certificate: " + eligibleForCertificate);

        sc.close();
    }
}