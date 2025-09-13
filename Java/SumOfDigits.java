import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sumWhile = 0;
        // Using while loop
        while (temp != 0) {
            sumWhile += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits using while loop: " + sumWhile);

        // Using do-while loop
        temp = n;
        int sumDoWhile = 0;
        if (temp == 0) {
            sumDoWhile = 0;
        } else {
            do {
                sumDoWhile += temp % 10;
                temp /= 10;
            } while (temp != 0);
        }
        System.out.println("Sum of digits using do-while loop: " + sumDoWhile);
        sc.close();
    }
}
