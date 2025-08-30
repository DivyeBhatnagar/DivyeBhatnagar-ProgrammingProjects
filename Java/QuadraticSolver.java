import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Root: " + r);
        } else {
            System.out.println("No real roots");
        }

        s.close();
    }
}
