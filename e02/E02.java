import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1 = input.nextInt();

        System.out.println("Give a number:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        System.out.println();

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
}
