import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int length = 0;
        int temp = num;
        
        if (temp == 0) {
            length = 1;
        } else {
            if (temp < 0) {
                temp = -temp;
            }
            
            while (temp != 0) {
                length++;
                temp = temp / 10;
            }
        }
        
        System.out.println("Length of " + num + " is: " + length);
        
        sc.close();
    }
}