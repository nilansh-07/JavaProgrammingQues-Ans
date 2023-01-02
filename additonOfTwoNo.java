import java.util.Scanner;

public class additonOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Sum is:"+sum);
        System.out.println("The Subtraction is:"+(a-b));
        System.out.println("The Multiplication is:"+(a*b));
        System.out.println("The Division is:"+(a/b));

    }
}
