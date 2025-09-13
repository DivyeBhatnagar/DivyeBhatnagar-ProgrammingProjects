import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int length = String.valueOf(Math.abs(num)).length();
        
        System.out.println("Length of " + num + " is: " + length);
        
        sc.close();
    }
}           if (temp < 0) {
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